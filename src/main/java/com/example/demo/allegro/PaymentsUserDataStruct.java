
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentsUserDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentsUserDataStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="userFullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userPostcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userCountry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentsUserDataStruct", propOrder = {

})
public class PaymentsUserDataStruct {

    @XmlElement(required = true)
    protected String userFullName;
    @XmlElement(required = true)
    protected String userAddress;
    @XmlElement(required = true)
    protected String userPostcode;
    @XmlElement(required = true)
    protected String userCity;
    protected int userCountry;
    @XmlElement(required = true)
    protected String userPhone;

    /**
     * Gets the value of the userFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFullName() {
        return userFullName;
    }

    /**
     * Sets the value of the userFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFullName(String value) {
        this.userFullName = value;
    }

    /**
     * Gets the value of the userAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * Sets the value of the userAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAddress(String value) {
        this.userAddress = value;
    }

    /**
     * Gets the value of the userPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPostcode() {
        return userPostcode;
    }

    /**
     * Sets the value of the userPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPostcode(String value) {
        this.userPostcode = value;
    }

    /**
     * Gets the value of the userCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCity() {
        return userCity;
    }

    /**
     * Sets the value of the userCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCity(String value) {
        this.userCity = value;
    }

    /**
     * Gets the value of the userCountry property.
     * 
     */
    public int getUserCountry() {
        return userCountry;
    }

    /**
     * Sets the value of the userCountry property.
     * 
     */
    public void setUserCountry(int value) {
        this.userCountry = value;
    }

    /**
     * Gets the value of the userPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * Sets the value of the userPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPhone(String value) {
        this.userPhone = value;
    }

}
