//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.27 at 12:15:06 AM CEST 
//


package nl.connekt.bison.chb.export;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}validfrom"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}level"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}rd-x"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}rd-y"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}mutationdate"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}location" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}rd-z" minOccurs="0"/>
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
    "validfrom",
    "level",
    "rdX",
    "rdY",
    "mutationdate",
    "location",
    "rdZ"
})
@XmlRootElement(name = "stopplacelocation")
public class Stopplacelocation {

    @XmlElement(required = true)
    protected XMLGregorianCalendar validfrom;
    @XmlElement(required = true)
    protected String level;
    @XmlElement(name = "rd-x")
    protected int rdX;
    @XmlElement(name = "rd-y")
    protected int rdY;
    @XmlElement(required = true)
    protected XMLGregorianCalendar mutationdate;
    protected String location;
    @XmlElement(name = "rd-z")
    protected Integer rdZ;

    /**
     * Gets the value of the validfrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidfrom() {
        return validfrom;
    }

    /**
     * Sets the value of the validfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidfrom(XMLGregorianCalendar value) {
        this.validfrom = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
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
     * Gets the value of the mutationdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMutationdate() {
        return mutationdate;
    }

    /**
     * Sets the value of the mutationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMutationdate(XMLGregorianCalendar value) {
        this.mutationdate = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the rdZ property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRdZ() {
        return rdZ;
    }

    /**
     * Sets the value of the rdZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRdZ(Integer value) {
        this.rdZ = value;
    }

}
