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
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}quayimagedate"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}quayimageurl"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}quayimagedescription"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}mutationdate"/>
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
    "quayimagedate",
    "quayimageurl",
    "quayimagedescription",
    "mutationdate"
})
@XmlRootElement(name = "quayphotodata")
public class Quayphotodata {

    @XmlElement(required = true)
    protected XMLGregorianCalendar quayimagedate;
    @XmlElement(required = true)
    protected String quayimageurl;
    @XmlElement(required = true)
    protected String quayimagedescription;
    @XmlElement(required = true)
    protected XMLGregorianCalendar mutationdate;

    /**
     * Gets the value of the quayimagedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuayimagedate() {
        return quayimagedate;
    }

    /**
     * Sets the value of the quayimagedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuayimagedate(XMLGregorianCalendar value) {
        this.quayimagedate = value;
    }

    /**
     * Gets the value of the quayimageurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuayimageurl() {
        return quayimageurl;
    }

    /**
     * Sets the value of the quayimageurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuayimageurl(String value) {
        this.quayimageurl = value;
    }

    /**
     * Gets the value of the quayimagedescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuayimagedescription() {
        return quayimagedescription;
    }

    /**
     * Sets the value of the quayimagedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuayimagedescription(String value) {
        this.quayimagedescription = value;
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

}
