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
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}remarks"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}mutationdate"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}remarkstatus" minOccurs="0"/>
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
    "remarks",
    "mutationdate",
    "remarkstatus"
})
@XmlRootElement(name = "stopplaceremarks")
public class Stopplaceremarks {

    @XmlElement(required = true)
    protected XMLGregorianCalendar validfrom;
    @XmlElement(required = true)
    protected String remarks;
    @XmlElement(required = true)
    protected XMLGregorianCalendar mutationdate;
    protected String remarkstatus;

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
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
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
     * Gets the value of the remarkstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkstatus() {
        return remarkstatus;
    }

    /**
     * Sets the value of the remarkstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkstatus(String value) {
        this.remarkstatus = value;
    }

}