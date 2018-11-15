package nl.htm.example.controller;

import nl.connekt.bison.kv17.*;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.zeromq.ZMsg;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Paths;
import java.util.StringJoiner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;

public class ProcessKV17 {
    static final ExecutorService fixedPool = Executors.newFixedThreadPool(2);

    private static XMLReader getXmlReader() {
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setXIncludeAware(true);
            spf.setNamespaceAware(true);
            spf.setValidating(true); // Not required for JAXB/XInclude

            XMLReader xr = spf.newSAXParser().getXMLReader();
            // xr.setEntityResolver((publicId, systemId) -> new InputSource(AUSServer.class.getClassLoader().getResourceAsStream("dtd/"+ Paths.get(URI.create(systemId)).getFileName())));

            return xr;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Unmarshaller getKV17Unmarchaller() {
        Unmarshaller jaxbUnmarshaller = null;

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return jaxbUnmarshaller;
    }

    static private void handleKV17(ZMsg zMsg) {
        System.err.println("KV17 received.");

        try {
            GZIPInputStream gzis = new GZIPInputStream(new ByteArrayInputStream(zMsg.getLast().getData()));
            com.bliksemlabs.ptds.controller.UnicodeBOMInputStream ubis = new com.bliksemlabs.ptds.controller.UnicodeBOMInputStream(gzis);
            SAXSource saxSource = new SAXSource(getXmlReader(), new InputSource(ubis));

            VVTMPUSH vvtmpush = (VVTMPUSH) getKV17Unmarchaller().unmarshal(saxSource);
            for (KV17CvlinfoType kv17CvlinfoType : vvtmpush.getKV17Cvlinfo()) {
                KV17MutatejourneyType kv17MutatejourneyType = kv17CvlinfoType.getKV17MUTATEJOURNEY();
                if (kv17MutatejourneyType != null) {
                    KV17JourneyType kv17JourneyType = kv17CvlinfoType.getKV17JOURNEY();
                    CANCELType cancelType = kv17MutatejourneyType.getCANCEL();
                    if (cancelType != null) {
                        StringJoiner joiner = new StringJoiner(":");
                        joiner.add(kv17JourneyType.getDataownercode())
                                .add(kv17JourneyType.getLineplanningnumber())
                                .add(Integer.toString(kv17JourneyType.getJourneynumber()))
                                .add(kv17JourneyType.getOperatingday().toGregorianCalendar().toZonedDateTime().toLocalDate().toString());


                    } else {
                        RECOVERType recoverType = kv17MutatejourneyType.getRECOVER();
                        if (recoverType != null) {
                            StringJoiner joiner = new StringJoiner(":");
                            joiner.add(kv17JourneyType.getDataownercode())
                                    .add(kv17JourneyType.getLineplanningnumber())
                                    .add(Integer.toString(kv17JourneyType.getJourneynumber()))
                                    .add(kv17JourneyType.getOperatingday().toGregorianCalendar().toZonedDateTime().toLocalDate().toString());

                        }
                    }
                }
            }
        } catch (JAXBException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void startRunnable(ZMsg xml) {
        class OneShotTask implements Runnable {
            ZMsg xml;
            OneShotTask(ZMsg xml) { this.xml = xml; }
            public void run() {
                handleKV17(xml);
            }
        }

        fixedPool.submit(new OneShotTask(xml));
    }
}
