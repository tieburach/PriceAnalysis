
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userCountry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userCreateDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userLoginDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userRating" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userIsNewUser" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userNotActivated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userClosed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userBlocked" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userTerminated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userHasPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userIsSseller" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userIsEco" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userPositiveFeedback" type="{https://webapi.allegro.pl/service.php}ShowUserFeedbacks"/>
 *         &lt;element name="userNegativeFeedback" type="{https://webapi.allegro.pl/service.php}ShowUserFeedbacks"/>
 *         &lt;element name="userNeutralFeedback" type="{https://webapi.allegro.pl/service.php}ShowUserFeedbacks"/>
 *         &lt;element name="userJuniorStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userHasShop" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userCompanyIcon" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userSellRatingCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userSellRatingAverage" type="{https://webapi.allegro.pl/service.php}ArrayOfSellratingaveragestruct" minOccurs="0"/>
 *         &lt;element name="userIsAllegroStandard" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userIsB2cSeller" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "userId",
    "userLogin",
    "userCountry",
    "userCreateDate",
    "userLoginDate",
    "userRating",
    "userIsNewUser",
    "userNotActivated",
    "userClosed",
    "userBlocked",
    "userTerminated",
    "userHasPage",
    "userIsSseller",
    "userIsEco",
    "userPositiveFeedback",
    "userNegativeFeedback",
    "userNeutralFeedback",
    "userJuniorStatus",
    "userHasShop",
    "userCompanyIcon",
    "userSellRatingCount",
    "userSellRatingAverage",
    "userIsAllegroStandard",
    "userIsB2CSeller"
})
@XmlRootElement(name = "doShowUserResponse")
public class DoShowUserResponse {

    protected long userId;
    @XmlElement(required = true)
    protected String userLogin;
    protected int userCountry;
    protected long userCreateDate;
    protected long userLoginDate;
    protected int userRating;
    protected int userIsNewUser;
    protected int userNotActivated;
    protected int userClosed;
    protected int userBlocked;
    protected int userTerminated;
    protected int userHasPage;
    protected int userIsSseller;
    protected int userIsEco;
    @XmlElement(required = true)
    protected ShowUserFeedbacks userPositiveFeedback;
    @XmlElement(required = true)
    protected ShowUserFeedbacks userNegativeFeedback;
    @XmlElement(required = true)
    protected ShowUserFeedbacks userNeutralFeedback;
    protected int userJuniorStatus;
    protected int userHasShop;
    protected int userCompanyIcon;
    protected int userSellRatingCount;
    protected ArrayOfSellratingaveragestruct userSellRatingAverage;
    protected int userIsAllegroStandard;
    @XmlElement(name = "userIsB2cSeller")
    protected int userIsB2CSeller;

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
     * Gets the value of the userCreateDate property.
     * 
     */
    public long getUserCreateDate() {
        return userCreateDate;
    }

    /**
     * Sets the value of the userCreateDate property.
     * 
     */
    public void setUserCreateDate(long value) {
        this.userCreateDate = value;
    }

    /**
     * Gets the value of the userLoginDate property.
     * 
     */
    public long getUserLoginDate() {
        return userLoginDate;
    }

    /**
     * Sets the value of the userLoginDate property.
     * 
     */
    public void setUserLoginDate(long value) {
        this.userLoginDate = value;
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
     * Gets the value of the userIsNewUser property.
     * 
     */
    public int getUserIsNewUser() {
        return userIsNewUser;
    }

    /**
     * Sets the value of the userIsNewUser property.
     * 
     */
    public void setUserIsNewUser(int value) {
        this.userIsNewUser = value;
    }

    /**
     * Gets the value of the userNotActivated property.
     * 
     */
    public int getUserNotActivated() {
        return userNotActivated;
    }

    /**
     * Sets the value of the userNotActivated property.
     * 
     */
    public void setUserNotActivated(int value) {
        this.userNotActivated = value;
    }

    /**
     * Gets the value of the userClosed property.
     * 
     */
    public int getUserClosed() {
        return userClosed;
    }

    /**
     * Sets the value of the userClosed property.
     * 
     */
    public void setUserClosed(int value) {
        this.userClosed = value;
    }

    /**
     * Gets the value of the userBlocked property.
     * 
     */
    public int getUserBlocked() {
        return userBlocked;
    }

    /**
     * Sets the value of the userBlocked property.
     * 
     */
    public void setUserBlocked(int value) {
        this.userBlocked = value;
    }

    /**
     * Gets the value of the userTerminated property.
     * 
     */
    public int getUserTerminated() {
        return userTerminated;
    }

    /**
     * Sets the value of the userTerminated property.
     * 
     */
    public void setUserTerminated(int value) {
        this.userTerminated = value;
    }

    /**
     * Gets the value of the userHasPage property.
     * 
     */
    public int getUserHasPage() {
        return userHasPage;
    }

    /**
     * Sets the value of the userHasPage property.
     * 
     */
    public void setUserHasPage(int value) {
        this.userHasPage = value;
    }

    /**
     * Gets the value of the userIsSseller property.
     * 
     */
    public int getUserIsSseller() {
        return userIsSseller;
    }

    /**
     * Sets the value of the userIsSseller property.
     * 
     */
    public void setUserIsSseller(int value) {
        this.userIsSseller = value;
    }

    /**
     * Gets the value of the userIsEco property.
     * 
     */
    public int getUserIsEco() {
        return userIsEco;
    }

    /**
     * Sets the value of the userIsEco property.
     * 
     */
    public void setUserIsEco(int value) {
        this.userIsEco = value;
    }

    /**
     * Gets the value of the userPositiveFeedback property.
     * 
     * @return
     *     possible object is
     *     {@link ShowUserFeedbacks }
     *     
     */
    public ShowUserFeedbacks getUserPositiveFeedback() {
        return userPositiveFeedback;
    }

    /**
     * Sets the value of the userPositiveFeedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowUserFeedbacks }
     *     
     */
    public void setUserPositiveFeedback(ShowUserFeedbacks value) {
        this.userPositiveFeedback = value;
    }

    /**
     * Gets the value of the userNegativeFeedback property.
     * 
     * @return
     *     possible object is
     *     {@link ShowUserFeedbacks }
     *     
     */
    public ShowUserFeedbacks getUserNegativeFeedback() {
        return userNegativeFeedback;
    }

    /**
     * Sets the value of the userNegativeFeedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowUserFeedbacks }
     *     
     */
    public void setUserNegativeFeedback(ShowUserFeedbacks value) {
        this.userNegativeFeedback = value;
    }

    /**
     * Gets the value of the userNeutralFeedback property.
     * 
     * @return
     *     possible object is
     *     {@link ShowUserFeedbacks }
     *     
     */
    public ShowUserFeedbacks getUserNeutralFeedback() {
        return userNeutralFeedback;
    }

    /**
     * Sets the value of the userNeutralFeedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowUserFeedbacks }
     *     
     */
    public void setUserNeutralFeedback(ShowUserFeedbacks value) {
        this.userNeutralFeedback = value;
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
     * Gets the value of the userSellRatingCount property.
     * 
     */
    public int getUserSellRatingCount() {
        return userSellRatingCount;
    }

    /**
     * Sets the value of the userSellRatingCount property.
     * 
     */
    public void setUserSellRatingCount(int value) {
        this.userSellRatingCount = value;
    }

    /**
     * Gets the value of the userSellRatingAverage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSellratingaveragestruct }
     *     
     */
    public ArrayOfSellratingaveragestruct getUserSellRatingAverage() {
        return userSellRatingAverage;
    }

    /**
     * Sets the value of the userSellRatingAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSellratingaveragestruct }
     *     
     */
    public void setUserSellRatingAverage(ArrayOfSellratingaveragestruct value) {
        this.userSellRatingAverage = value;
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

    /**
     * Gets the value of the userIsB2CSeller property.
     * 
     */
    public int getUserIsB2CSeller() {
        return userIsB2CSeller;
    }

    /**
     * Sets the value of the userIsB2CSeller property.
     * 
     */
    public void setUserIsB2CSeller(int value) {
        this.userIsB2CSeller = value;
    }

}
