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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Java class for ONPATHType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONPATHType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataownercode" type="{http://bison.connekt.nl/tmi8/kv6/msg}dataownercodeType"/>
 *         &lt;element name="lineplanningnumber" type="{http://bison.connekt.nl/tmi8/kv6/msg}lineplanningnumberType"/>
 *         &lt;element name="operatingday" type="{http://bison.connekt.nl/tmi8/kv6/msg}tmidateType"/>
 *         &lt;element name="journeynumber" type="{http://bison.connekt.nl/tmi8/kv6/msg}journeynumberType"/>
 *         &lt;element name="reinforcementnumber" type="{http://bison.connekt.nl/tmi8/kv6/msg}fortifyordernumberType"/>
 *         &lt;element name="userstopcode" type="{http://bison.connekt.nl/tmi8/kv6/msg}codeType"/>
 *         &lt;element name="passagesequencenumber" type="{http://bison.connekt.nl/tmi8/kv6/msg}passagesequencenumberType"/>
 *         &lt;element name="timestamp" type="{http://bison.connekt.nl/tmi8/kv6/msg}tmidatetimeType"/>
 *         &lt;element name="source" type="{http://bison.connekt.nl/tmi8/kv6/msg}sourceType"/>
 *         &lt;element name="vehiclenumber" type="{http://bison.connekt.nl/tmi8/kv6/msg}vehicleidnumberType"/>
 *         &lt;element name="distancesincelastuserstop" type="{http://bison.connekt.nl/tmi8/kv6/msg}distancesincelastuserstopType" minOccurs="0"/>
 *         &lt;element name="rd-x" type="{http://bison.connekt.nl/tmi8/kv6/msg}rdType"/>
 *         &lt;element name="rd-y" type="{http://bison.connekt.nl/tmi8/kv6/msg}rdType"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://bison.connekt.nl/tmi8/kv6/core}delimiter"/>
 *           &lt;any processContents='lax' namespace=' http://bison.connekt.nl/tmi8/kv6/msg' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ONPATHType", propOrder = {
    "dataownercode",
    "lineplanningnumber",
    "operatingday",
    "journeynumber",
    "reinforcementnumber",
    "userstopcode",
    "passagesequencenumber",
    "timestamp",
    "source",
    "vehiclenumber",
    "distancesincelastuserstop",
    "rdX",
    "rdY",
    "delimiterAndAny"
})
public class ONPATHType {

    @XmlElement(required = true)
    protected String dataownercode;
    @XmlElement(required = true)
    protected String lineplanningnumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar operatingday;
    protected int journeynumber;
    protected int reinforcementnumber;
    @XmlElement(required = true)
    protected String userstopcode;
    protected int passagesequencenumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SourceType source;
    protected int vehiclenumber;
    protected Integer distancesincelastuserstop;
    @XmlElement(name = "rd-x")
    protected int rdX;
    @XmlElement(name = "rd-y")
    protected int rdY;
    @XmlElementRef(name = "delimiter", namespace = "http://bison.connekt.nl/tmi8/kv6/core", type = Delimiter.class, required = false)
    @XmlAnyElement(lax = true)
    protected List<Object> delimiterAndAny;

    /**
     * Gets the value of the dataownercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataownercode() {
        return dataownercode;
    }

    /**
     * Sets the value of the dataownercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataownercode(String value) {
        this.dataownercode = value;
    }

    /**
     * Gets the value of the lineplanningnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineplanningnumber() {
        return lineplanningnumber;
    }

    /**
     * Sets the value of the lineplanningnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineplanningnumber(String value) {
        this.lineplanningnumber = value;
    }

    /**
     * Gets the value of the operatingday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperatingday() {
        return operatingday;
    }

    /**
     * Sets the value of the operatingday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperatingday(XMLGregorianCalendar value) {
        this.operatingday = value;
    }

    /**
     * Gets the value of the journeynumber property.
     * 
     */
    public int getJourneynumber() {
        return journeynumber;
    }

    /**
     * Sets the value of the journeynumber property.
     * 
     */
    public void setJourneynumber(int value) {
        this.journeynumber = value;
    }

    /**
     * Gets the value of the reinforcementnumber property.
     * 
     */
    public int getReinforcementnumber() {
        return reinforcementnumber;
    }

    /**
     * Sets the value of the reinforcementnumber property.
     * 
     */
    public void setReinforcementnumber(int value) {
        this.reinforcementnumber = value;
    }

    /**
     * Gets the value of the userstopcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserstopcode() {
        return userstopcode;
    }

    /**
     * Sets the value of the userstopcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserstopcode(String value) {
        this.userstopcode = value;
    }

    /**
     * Gets the value of the passagesequencenumber property.
     * 
     */
    public int getPassagesequencenumber() {
        return passagesequencenumber;
    }

    /**
     * Sets the value of the passagesequencenumber property.
     * 
     */
    public void setPassagesequencenumber(int value) {
        this.passagesequencenumber = value;
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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSource(SourceType value) {
        this.source = value;
    }

    /**
     * Gets the value of the vehiclenumber property.
     * 
     */
    public int getVehiclenumber() {
        return vehiclenumber;
    }

    /**
     * Sets the value of the vehiclenumber property.
     * 
     */
    public void setVehiclenumber(int value) {
        this.vehiclenumber = value;
    }

    /**
     * Gets the value of the distancesincelastuserstop property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistancesincelastuserstop() {
        return distancesincelastuserstop;
    }

    /**
     * Sets the value of the distancesincelastuserstop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistancesincelastuserstop(Integer value) {
        this.distancesincelastuserstop = value;
    }

    /**
     * Gets the value of the rdX property.
     * 
     */
    public int getRdX() {
        return rdX;
    }

    /**
     * Sets the value of the rdX property.
     * 
     */
    public void setRdX(int value) {
        this.rdX = value;
    }

    /**
     * Gets the value of the rdY property.
     * 
     */
    public int getRdY() {
        return rdY;
    }

    /**
     * Sets the value of the rdY property.
     * 
     */
    public void setRdY(int value) {
        this.rdY = value;
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
