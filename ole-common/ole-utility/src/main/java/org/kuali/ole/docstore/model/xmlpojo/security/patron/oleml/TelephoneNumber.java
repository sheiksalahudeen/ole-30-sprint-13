////
//// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
//// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
//// Any modifications to this file will be lost upon recompilation of the source schema.
//// Generated on: 2012.03.15 at 02:03:46 PM IST
////
//
//
//package org.kuali.ole.docstore.model.xmlpojo.security.patron.oleml;
//
//import com.thoughtworks.xstream.annotations.XStreamAlias;
//
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlType;
//
//
///**
// * <p>Java class for telephoneNumber complex type.
// *
// * <p>The following schema fragment specifies the expected content contained within this class.
// *
// * <pre>
// * &lt;complexType name="telephoneNumber">
// *   &lt;complexContent>
// *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
// *       &lt;sequence>
// *         &lt;element name="countryDialingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
// *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="acceptsTextMessage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
// *       &lt;/sequence>
// *     &lt;/restriction>
// *   &lt;/complexContent>
// * &lt;/complexType>
// * </pre>
// *
// *
// * @author Rajesh Chowdary K
// * @created Mar 15, 2012
// */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "telephoneNumber", propOrder = {
//    "countryDialingCode",
//    "phoneNumber",
//    "acceptsTextMessage"
//})
//@XStreamAlias("telephoneNumber")
//public class TelephoneNumber {
//
//    protected String countryDialingCode;
//    @XmlElement(required = true)
//    protected String phoneNumber;
//    @XmlElement(defaultValue = "false")
//    protected boolean acceptsTextMessage;
//
//    /**
//     * Gets the value of the countryDialingCode property.
//     *
//     * @return
//     *     possible object is
//     *     {@link String }
//     *
//     */
//    public String getCountryDialingCode() {
//        return countryDialingCode;
//    }
//
//    /**
//     * Sets the value of the countryDialingCode property.
//     *
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *
//     */
//    public void setCountryDialingCode(String value) {
//        this.countryDialingCode = value;
//    }
//
//    /**
//     * Gets the value of the phoneNumber property.
//     *
//     * @return
//     *     possible object is
//     *     {@link String }
//     *
//     */
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    /**
//     * Sets the value of the phoneNumber property.
//     *
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *
//     */
//    public void setPhoneNumber(String value) {
//        this.phoneNumber = value;
//    }
//
//    /**
//     * Gets the value of the acceptsTextMessage property.
//     *
//     */
//    public boolean isAcceptsTextMessage() {
//        return acceptsTextMessage;
//    }
//
//    /**
//     * Sets the value of the acceptsTextMessage property.
//     *
//     */
//    public void setAcceptsTextMessage(boolean value) {
//        this.acceptsTextMessage = value;
//    }
//
//}
