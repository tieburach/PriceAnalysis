
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserSentToDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserSentToDataStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userCompany" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userCountryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userPostcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserSentToDataStruct", propOrder = {

})
public class UserSentToDataStruct {

    protected long userId;
    @XmlElement(required = true)
    protected String userFirstName;
    @XmlElement(required = true)
    protected String userLastName;
    @XmlElement(required = true)
    protected String userCompany;
    protected int userCountryId;
    @XmlElement(required = true)
    protected String userPostcode;
    @XmlElement(required = true)
    protected String userCity;
    @XmlElement(required = true)
    protected String userAddress;

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFirstName() {
        return userFirstName;
    }

    /**
     * Sets the value of the userFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFirstName(String value) {
        this.userFirstName = value;
    }

    /**
     * Gets the value of the userLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLastName() {
        return userLastName;
    }

    /**
     * Sets the value of the userLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLastName(String value) {
        this.userLastName = value;
    }

    /**
     * Gets the value of the userCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCompany() {
        return userCompany;
    }

    /**
     * Sets the value of the userCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCompany(String value) {
        this.userCompany = value;
    }

    /**
     * Gets the value of the userCountryId property.
     * 
     */
    public int getUserCountryId() {
        return userCountryId;
    }

    /**
     * Sets the value of the userCountryId property.
     * 
     */
    public void setUserCountryId(int value) {
        this.userCountryId = value;
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

}
