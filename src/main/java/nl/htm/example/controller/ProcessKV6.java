package nl.htm.example.controller;

import nl.connekt.bison.kv6.*;
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

public class ProcessKV6 {
    static final ExecutorService fixedPool = Executors.newFixedThreadPool(10);

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

    private static Unmarshaller getKV6Unmarchaller() {
        Unmarshaller jaxbUnmarshaller = null;

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(nl.connekt.bison.kv6.ObjectFactory.class);
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return jaxbUnmarshaller;
    }

    static private void handleKV6(ZMsg zMsg) {
        System.err.println("KV6 received.");

        try {
            GZIPInputStream gzis = new GZIPInputStream(new ByteArrayInputStream(zMsg.getLast().getData()));
            com.bliksemlabs.ptds.controller.UnicodeBOMInputStream ubis = new com.bliksemlabs.ptds.controller.UnicodeBOMInputStream(gzis);
            SAXSource saxSource = new SAXSource(getXmlReader(), new InputSource(ubis));

            VVTMPUSH vvtmpush = (VVTMPUSH) getKV6Unmarchaller().unmarshal(saxSource);
            for (KV6PosinfoType kv6PosinfoType : vvtmpush.getKV6Posinfo()) {
                for (Object obj : kv6PosinfoType.getDELAYAndINITAndARRIVAL()) {
                    if (obj instanceof INITType) {
                        INITType initType = (INITType) obj;

                        StringJoiner joiner = new StringJoiner(":");
                        joiner.add(initType.getDataownercode())
                              .add(initType.getLineplanningnumber())
                              .add(Integer.toString(initType.getJourneynumber()))
                              .add(initType.getOperatingday().toGregorianCalendar().toZonedDateTime().toLocalDate().toString());
                        

                    } else

                    if (obj instanceof ARRIVALType) {
                        ARRIVALType arrivalType = (ARRIVALType) obj;

                        StringJoiner joiner = new StringJoiner(":");
                        joiner.add(arrivalType.getDataownercode())
                              .add(arrivalType.getLineplanningnumber())
                              .add(Integer.toString(arrivalType.getJourneynumber()))
                              .add(arrivalType.getOperatingday().toGregorianCalendar().toZonedDateTime().toLocalDate().toString());
                        

                    } else

                    if (obj instanceof ONSTOPType) {
                        ONSTOPType onstopType = (ONSTOPType) obj;

                        StringJoiner joiner = new StringJoiner(":");
                        joiner.add(onstopType.getDataownercode())
                                .add(onstopType.getLineplanningnumber())
                                .add(Integer.toString(onstopType.getJourneynumber()))
                                .add(onstopType.getOperatingday().toGregorianCalendar().toZonedDateTime().toLocalDate().toString());


                    } else

                    if (obj instanceof DEPARTUREType) {
                        DEPARTUREType departureType = (DEPARTUREType) obj;

                        StringJoiner joiner = new StringJoiner(":");
                        joiner.add(departureType.getDataownercode())
                                .add(departureType.getLineplanningnumber())
                                .add(Integer.toString(departureType.getJourneynumber()))
                                .add(departureType.getOperatingday().toGregorianCalendar().toZonedDateTime().toLocalDate().toString());


                    } else

                    if (obj instanceof ONROUTEType) {
                        ONROUTEType onrouteType = (ONROUTEType) obj;

                        if (onrouteType.getDistancesincelastuserstop() == null ||
                                onrouteType.getDistancesincelastuserstop() == 0) continue;

                        StringJoiner joiner = new StringJoiner(":");
                        joiner.add(onrouteType.getDataownercode())
                                .add(onrouteType.getLineplanningnumber())
                                .add(Integer.toString(onrouteType.getJourneynumber()))
                                .add(onrouteType.getOperatingday().toGregorianCalendar().toZonedDateTime().toLocalDate().toString());


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
                handleKV6(xml);
            }
        }

        fixedPool.submit(new OneShotTask(xml));
    }
}
