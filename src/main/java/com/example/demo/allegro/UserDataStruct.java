
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDataStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userRating" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userMaidenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userCompany" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userCountryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userStateId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userPostcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userPhone2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userSsStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="siteCountryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userJuniorStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userBirthDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userHasShop" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userCompanyIcon" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userIsAllegroStandard" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDataStruct", propOrder = {

})
public class UserDataStruct {

    protected long userId;
    @XmlElement(required = true)
    protected String userLogin;
    protected int userRating;
    @XmlElement(required = true)
    protected String userFirstName;
    @XmlElement(required = true)
    protected String userLastName;
    @XmlElement(required = true)
    protected String userMaidenName;
    @XmlElement(required = true)
    protected String userCompany;
    protected int userCountryId;
    protected int userStateId;
    @XmlElement(required = true)
    protected String userPostcode;
    @XmlElement(required = true)
    protected String userCity;
    @XmlElement(required = true)
    protected String userAddress;
    @XmlElement(required = true)
    protected String userEmail;
    @XmlElement(required = true)
    protected String userPhone;
    @XmlElement(required = true)
    protected String userPhone2;
    protected int userSsStatus;
    protected int siteCountryId;
    protected int userJuniorStatus;
    protected long userBirthDate;
    protected int userHasShop;
    protected int userCompanyIcon;
    protected int userIsAllegroStandard;

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
     * Gets the value of the userLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLogin() {
        return userLogin;
    }

    /**
     * Sets the value of the userLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLogin(String value) {
        this.userLogin = value;
    }

    /**
     * Gets the value of the userRating property.
     * 
     */
    public int getUserRating() {
        return userRating;
    }

    /**
     * Sets the value of the userRating property.
     * 
     */
    public void setUserRating(int value) {
        this.userRating = value;
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
     * Gets the value of the userMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMaidenName() {
        return userMaidenName;
    }

    /**
     * Sets the value of the userMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMaidenName(String value) {
        this.userMaidenName = value;
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
     * Gets the value of the userStateId property.
     * 
     */
    public int getUserStateId() {
        return userStateId;
    }

    /**
     * Sets the value of the userStateId property.
     * 
     */
    public void setUserStateId(int value) {
        this.userStateId = value;
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

    /**
     * Gets the value of the userEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Sets the value of the userEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmail(String value) {
        this.userEmail = value;
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

    /**
     * Gets the value of the userPhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPhone2() {
        return userPhone2;
    }

    /**
     * Sets the value of the userPhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPhone2(String value) {
        this.userPhone2 = value;
    }

    /**
     * Gets the value of the userSsStatus property.
     * 
     */
    public int getUserSsStatus() {
        return userSsStatus;
    }

    /**
     * Sets the value of the userSsStatus property.
     * 
     */
    public void setUserSsStatus(int value) {
        this.userSsStatus = value;
    }

    /**
     * Gets the value of the siteCountryId property.
     * 
     */
    public int getSiteCountryId() {
        return siteCountryId;
    }

    /**
     * Sets the value of the siteCountryId property.
     * 
     */
    public void setSiteCountryId(int value) {
        this.siteCountryId = value;
    }

    /**
     * Gets the value of the userJuniorStatus property.
     * 
     */
    public int getUserJuniorStatus() {
        return userJuniorStatus;
    }

    /**
     * Sets the value of the userJuniorStatus property.
     * 
     */
    public void setUserJuniorStatus(int value) {
        this.userJuniorStatus = value;
    }

    /**
     * Gets the value of the userBirthDate property.
     * 
     */
    public long getUserBirthDate() {
        return userBirthDate;
    }

    /**
     * Sets the value of the userBirthDate property.
     * 
     */
    public void setUserBirthDate(long value) {
        this.userBirthDate = value;
    }

    /**
     * Gets the value of the userHasShop property.
     * 
     */
    public int getUserHasShop() {
        return userHasShop;
    }

    /**
     * Sets the value of the userHasShop property.
     * 
     */
    public void setUserHasShop(int value) {
        this.userHasShop = value;
    }

    /**
     * Gets the value of the userCompanyIcon property.
     * 
     */
    public int getUserCompanyIcon() {
        return userCompanyIcon;
    }

    /**
     * Sets the value of the userCompanyIcon property.
     * 
     */
    public void setUserCompanyIcon(int value) {
        this.userCompanyIcon = value;
    }

    /**
     * Gets the value of the userIsAllegroStandard property.
     * 
     */
    public int getUserIsAllegroStandard() {
        return userIsAllegroStandard;
    }

    /**
     * Sets the value of the userIsAllegroStandard property.
     * 
     */
    public void setUserIsAllegroStandard(int value) {
        this.userIsAllegroStandard = value;
    }

}
