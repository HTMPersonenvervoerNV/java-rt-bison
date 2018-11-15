//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 10:39:38 PM CEST 
//


package nl.connekt.bison.kv17;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Java class for KV17mutatejourneystopType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KV17mutatejourneystopType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timestamp" type="{http://bison.connekt.nl/tmi8/kv17/msg}tmidatetimeType"/>
 *         &lt;choice>
 *           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *             &lt;element name="SHORTEN" type="{http://bison.connekt.nl/tmi8/kv17/msg}SHORTENType" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="CHANGEPASSTIMES" type="{http://bison.connekt.nl/tmi8/kv17/msg}CHANGEPASSTIMESType" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="CHANGEDESTINATION" type="{http://bison.connekt.nl/tmi8/kv17/msg}CHANGEDESTINATIONType" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="LAG" type="{http://bison.connekt.nl/tmi8/kv17/msg}LAGType" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="MUTATIONMESSAGE" type="{http://bison.connekt.nl/tmi8/kv17/msg}MUTATIONMESSAGEType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://bison.connekt.nl/tmi8/kv17/core}delimiter"/>
 *           &lt;any processContents='lax' namespace=' http://bison.connekt.nl/tmi8/kv17/msg' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KV17mutatejourneystopType", propOrder = {
    "timestamp",
    "shortenAndCHANGEPASSTIMESAndCHANGEDESTINATION",
    "delimiterAndAny"
})
public class KV17MutatejourneystopType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElements({
        @XmlElement(name = "SHORTEN", type = SHORTENType.class),
        @XmlElement(name = "CHANGEPASSTIMES", type = CHANGEPASSTIMESType.class),
        @XmlElement(name = "CHANGEDESTINATION", type = CHANGEDESTINATIONType.class),
        @XmlElement(name = "LAG", type = LAGType.class),
        @XmlElement(name = "MUTATIONMESSAGE", type = MUTATIONMESSAGEType.class)
    })
    protected List<Object> shortenAndCHANGEPASSTIMESAndCHANGEDESTINATION;
    @XmlElementRef(name = "delimiter", namespace = "http://bison.connekt.nl/tmi8/kv17/core", type = Delimiter.class, required = false)
    @XmlAnyElement(lax = true)
    protected List<Object> delimiterAndAny;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the shortenAndCHANGEPASSTIMESAndCHANGEDESTINATION property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortenAndCHANGEPASSTIMESAndCHANGEDESTINATION property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHORTENAndCHANGEPASSTIMESAndCHANGEDESTINATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHORTENType }
     * {@link CHANGEPASSTIMESType }
     * {@link CHANGEDESTINATIONType }
     * {@link LAGType }
     * {@link MUTATIONMESSAGEType }
     * 
     * 
     */
    public List<Object> getSHORTENAndCHANGEPASSTIMESAndCHANGEDESTINATION() {
        if (shortenAndCHANGEPASSTIMESAndCHANGEDESTINATION == null) {
            shortenAndCHANGEPASSTIMESAndCHANGEDESTINATION = new ArrayList<Object>();
        }
        return this.shortenAndCHANGEPASSTIMESAndCHANGEDESTINATION;
    }

    /**
     * Gets the value of the delimiterAndAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delimiterAndAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelimiterAndAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Delimiter }
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDelimiterAndAny() {
        if (delimiterAndAny == null) {
            delimiterAndAny = new ArrayList<Object>();
        }
        return this.delimiterAndAny;
    }

}
