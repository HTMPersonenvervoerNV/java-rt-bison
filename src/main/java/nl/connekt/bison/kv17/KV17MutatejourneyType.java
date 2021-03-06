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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * ADD is a RESERVED OPERATION
 * 
 * <p>Java class for KV17mutatejourneyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KV17mutatejourneyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timestamp" type="{http://bison.connekt.nl/tmi8/kv17/msg}tmidatetimeType"/>
 *         &lt;choice>
 *           &lt;element name="CANCEL" type="{http://bison.connekt.nl/tmi8/kv17/msg}CANCELType" minOccurs="0"/>
 *           &lt;element name="RECOVER" type="{http://bison.connekt.nl/tmi8/kv17/msg}RECOVERType" minOccurs="0"/>
 *           &lt;element name="ADD" type="{http://bison.connekt.nl/tmi8/kv17/msg}ADDType" minOccurs="0"/>
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
@XmlType(name = "KV17mutatejourneyType", propOrder = {
    "timestamp",
    "cancel",
    "recover",
    "add",
    "delimiterAndAny"
})
public class KV17MutatejourneyType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "CANCEL")
    protected CANCELType cancel;
    @XmlElement(name = "RECOVER")
    protected RECOVERType recover;
    @XmlElement(name = "ADD")
    protected ADDType add;
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
     * Gets the value of the cancel property.
     * 
     * @return
     *     possible object is
     *     {@link CANCELType }
     *     
     */
    public CANCELType getCANCEL() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CANCELType }
     *     
     */
    public void setCANCEL(CANCELType value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the recover property.
     * 
     * @return
     *     possible object is
     *     {@link RECOVERType }
     *     
     */
    public RECOVERType getRECOVER() {
        return recover;
    }

    /**
     * Sets the value of the recover property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECOVERType }
     *     
     */
    public void setRECOVER(RECOVERType value) {
        this.recover = value;
    }

    /**
     * Gets the value of the add property.
     * 
     * @return
     *     possible object is
     *     {@link ADDType }
     *     
     */
    public ADDType getADD() {
        return add;
    }

    /**
     * Sets the value of the add property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDType }
     *     
     */
    public void setADD(ADDType value) {
        this.add = value;
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
