//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.17 at 01:56:36 AM CEST 
//


package nl.connekt.bison.kv6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://bison.connekt.nl/tmi8/kv6/msg}MessageProperties"/>
 *         &lt;element name="KV6posinfo" type="{http://bison.connekt.nl/tmi8/kv6/msg}KV6posinfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subscriberID",
    "version",
    "dossierName",
    "timestamp",
    "kv6Posinfo"
})
@XmlRootElement(name = "VV_TM_PUSH")
public class VVTMPUSH {

    @XmlElement(name = "SubscriberID", required = true)
    protected String subscriberID;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "DossierName", required = true)
    @XmlSchemaType(name = "string")
    protected DossierNameType dossierName;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "KV6posinfo")
    protected List<KV6PosinfoType> kv6Posinfo;

    /**
     * Gets the value of the subscriberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberID() {
        return subscriberID;
    }

    /**
     * Sets the value of the subscriberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberID(String value) {
        this.subscriberID = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the dossierName property.
     * 
     * @return
     *     possible object is
     *     {@link DossierNameType }
     *     
     */
    public DossierNameType getDossierName() {
        return dossierName;
    }

    /**
     * Sets the value of the dossierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DossierNameType }
     *     
     */
    public void setDossierName(DossierNameType value) {
        this.dossierName = value;
    }

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
     * Gets the value of the kv6Posinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kv6Posinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKV6Posinfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KV6PosinfoType }
     * 
     * 
     */
    public List<KV6PosinfoType> getKV6Posinfo() {
        if (kv6Posinfo == null) {
            kv6Posinfo = new ArrayList<KV6PosinfoType>();
        }
        return this.kv6Posinfo;
    }

}
