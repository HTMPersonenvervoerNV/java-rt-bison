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
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}stopsign"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}audiobutton"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}mutationdate"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}stopsigntype" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}shelter" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}shelterpublicity" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}illuminatedstop" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}seatavailable" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}leantosupport" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}timetableinformation" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}infounit" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}routenetworkmap" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}passengerinformationdisplay" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}passengerinformationdisplaytype" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}bicycleparking" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}numberofbicycleplaces" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}bins" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}ovccico" minOccurs="0"/>
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg/v1.4}ovccharging" minOccurs="0"/>
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
    "stopsign",
    "audiobutton",
    "mutationdate",
    "stopsigntype",
    "shelter",
    "shelterpublicity",
    "illuminatedstop",
    "seatavailable",
    "leantosupport",
    "timetableinformation",
    "infounit",
    "routenetworkmap",
    "passengerinformationdisplay",
    "passengerinformationdisplaytype",
    "bicycleparking",
    "numberofbicycleplaces",
    "bins",
    "ovccico",
    "ovccharging"
})
@XmlRootElement(name = "quayfacilities")
public class Quayfacilities {

    @XmlElement(required = true)
    protected XMLGregorianCalendar validfrom;
    protected boolean stopsign;
    protected boolean audiobutton;
    @XmlElement(required = true)
    protected XMLGregorianCalendar mutationdate;
    protected String stopsigntype;
    protected Boolean shelter;
    protected Boolean shelterpublicity;
    protected Boolean illuminatedstop;
    protected Boolean seatavailable;
    protected Boolean leantosupport;
    protected Boolean timetableinformation;
    protected Boolean infounit;
    protected Boolean routenetworkmap;
    protected Boolean passengerinformationdisplay;
    protected String passengerinformationdisplaytype;
    protected Boolean bicycleparking;
    protected Integer numberofbicycleplaces;
    protected Boolean bins;
    protected Boolean ovccico;
    protected Boolean ovccharging;

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
     * Gets the value of the stopsign property.
     * 
     */
    public boolean isStopsign() {
        return stopsign;
    }

    /**
     * Sets the value of the stopsign property.
     * 
     */
    public void setStopsign(boolean value) {
        this.stopsign = value;
    }

    /**
     * Gets the value of the audiobutton property.
     * 
     */
    public boolean isAudiobutton() {
        return audiobutton;
    }

    /**
     * Sets the value of the audiobutton property.
     * 
     */
    public void setAudiobutton(boolean value) {
        this.audiobutton = value;
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
     * Gets the value of the stopsigntype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopsigntype() {
        return stopsigntype;
    }

    /**
     * Sets the value of the stopsigntype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopsigntype(String value) {
        this.stopsigntype = value;
    }

    /**
     * Gets the value of the shelter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShelter() {
        return shelter;
    }

    /**
     * Sets the value of the shelter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShelter(Boolean value) {
        this.shelter = value;
    }

    /**
     * Gets the value of the shelterpublicity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShelterpublicity() {
        return shelterpublicity;
    }

    /**
     * Sets the value of the shelterpublicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShelterpublicity(Boolean value) {
        this.shelterpublicity = value;
    }

    /**
     * Gets the value of the illuminatedstop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIlluminatedstop() {
        return illuminatedstop;
    }

    /**
     * Sets the value of the illuminatedstop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIlluminatedstop(Boolean value) {
        this.illuminatedstop = value;
    }

    /**
     * Gets the value of the seatavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeatavailable() {
        return seatavailable;
    }

    /**
     * Sets the value of the seatavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeatavailable(Boolean value) {
        this.seatavailable = value;
    }

    /**
     * Gets the value of the leantosupport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeantosupport() {
        return leantosupport;
    }

    /**
     * Sets the value of the leantosupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeantosupport(Boolean value) {
        this.leantosupport = value;
    }

    /**
     * Gets the value of the timetableinformation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimetableinformation() {
        return timetableinformation;
    }

    /**
     * Sets the value of the timetableinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimetableinformation(Boolean value) {
        this.timetableinformation = value;
    }

    /**
     * Gets the value of the infounit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInfounit() {
        return infounit;
    }

    /**
     * Sets the value of the infounit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInfounit(Boolean value) {
        this.infounit = value;
    }

    /**
     * Gets the value of the routenetworkmap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoutenetworkmap() {
        return routenetworkmap;
    }

    /**
     * Sets the value of the routenetworkmap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoutenetworkmap(Boolean value) {
        this.routenetworkmap = value;
    }

    /**
     * Gets the value of the passengerinformationdisplay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassengerinformationdisplay() {
        return passengerinformationdisplay;
    }

    /**
     * Sets the value of the passengerinformationdisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassengerinformationdisplay(Boolean value) {
        this.passengerinformationdisplay = value;
    }

    /**
     * Gets the value of the passengerinformationdisplaytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerinformationdisplaytype() {
        return passengerinformationdisplaytype;
    }

    /**
     * Sets the value of the passengerinformationdisplaytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerinformationdisplaytype(String value) {
        this.passengerinformationdisplaytype = value;
    }

    /**
     * Gets the value of the bicycleparking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBicycleparking() {
        return bicycleparking;
    }

    /**
     * Sets the value of the bicycleparking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBicycleparking(Boolean value) {
        this.bicycleparking = value;
    }

    /**
     * Gets the value of the numberofbicycleplaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberofbicycleplaces() {
        return numberofbicycleplaces;
    }

    /**
     * Sets the value of the numberofbicycleplaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberofbicycleplaces(Integer value) {
        this.numberofbicycleplaces = value;
    }

    /**
     * Gets the value of the bins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBins() {
        return bins;
    }

    /**
     * Sets the value of the bins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBins(Boolean value) {
        this.bins = value;
    }

    /**
     * Gets the value of the ovccico property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOvccico() {
        return ovccico;
    }

    /**
     * Sets the value of the ovccico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOvccico(Boolean value) {
        this.ovccico = value;
    }

    /**
     * Gets the value of the ovccharging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOvccharging() {
        return ovccharging;
    }

    /**
     * Sets the value of the ovccharging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOvccharging(Boolean value) {
        this.ovccharging = value;
    }

}
