
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotWonItemStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotWonItemStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemThumbnailUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemPrice" type="{https://webapi.allegro.pl/service.php}ArrayOfItempricestruct" minOccurs="0"/>
 *         &lt;element name="itemLeftQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemQuantityType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemEndTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemEndTimeLeft" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemSeller" type="{https://webapi.allegro.pl/service.php}UserInfoStruct"/>
 *         &lt;element name="itemBiddersCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemHighestBidder" type="{https://webapi.allegro.pl/service.php}UserInfoStruct"/>
 *         &lt;element name="itemCategoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemViewsCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemSpecialInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemShopInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemProductInfo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemPayuInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotWonItemStruct", propOrder = {

})
public class NotWonItemStruct {

    protected long itemId;
    @XmlElement(required = true)
    protected String itemTitle;
    @XmlElement(required = true)
    protected String itemThumbnailUrl;
    protected ArrayOfItempricestruct itemPrice;
    protected int itemLeftQuantity;
    protected int itemQuantityType;
    protected long itemEndTime;
    @XmlElement(required = true)
    protected String itemEndTimeLeft;
    @XmlElement(required = true)
    protected UserInfoStruct itemSeller;
    protected int itemBiddersCounter;
    @XmlElement(required = true)
    protected UserInfoStruct itemHighestBidder;
    protected int itemCategoryId;
    protected int itemViewsCounter;
    @XmlElement(required = true)
    protected String itemNote;
    protected int itemSpecialInfo;
    protected int itemShopInfo;
    protected long itemProductInfo;
    protected int itemPayuInfo;

    /**
     * Gets the value of the itemId property.
     * 
     */
    public long getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     */
    public void setItemId(long value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itemTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * Sets the value of the itemTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTitle(String value) {
        this.itemTitle = value;
    }

    /**
     * Gets the value of the itemThumbnailUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemThumbnailUrl() {
        return itemThumbnailUrl;
    }

    /**
     * Sets the value of the itemThumbnailUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemThumbnailUrl(String value) {
        this.itemThumbnailUrl = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItempricestruct }
     *     
     */
    public ArrayOfItempricestruct getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItempricestruct }
     *     
     */
    public void setItemPrice(ArrayOfItempricestruct value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the itemLeftQuantity property.
     * 
     */
    public int getItemLeftQuantity() {
        return itemLeftQuantity;
    }

    /**
     * Sets the value of the itemLeftQuantity property.
     * 
     */
    public void setItemLeftQuantity(int value) {
        this.itemLeftQuantity = value;
    }

    /**
     * Gets the value of the itemQuantityType property.
     * 
     */
    public int getItemQuantityType() {
        return itemQuantityType;
    }

    /**
     * Sets the value of the itemQuantityType property.
     * 
     */
    public void setItemQuantityType(int value) {
        this.itemQuantityType = value;
    }

    /**
     * Gets the value of the itemEndTime property.
     * 
     */
    public long getItemEndTime() {
        return itemEndTime;
    }

    /**
     * Sets the value of the itemEndTime property.
     * 
     */
    public void setItemEndTime(long value) {
        this.itemEndTime = value;
    }

    /**
     * Gets the value of the itemEndTimeLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemEndTimeLeft() {
        return itemEndTimeLeft;
    }

    /**
     * Sets the value of the itemEndTimeLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemEndTimeLeft(String value) {
        this.itemEndTimeLeft = value;
    }

    /**
     * Gets the value of the itemSeller property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoStruct }
     *     
     */
    public UserInfoStruct getItemSeller() {
        return itemSeller;
    }

    /**
     * Sets the value of the itemSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoStruct }
     *     
     */
    public void setItemSeller(UserInfoStruct value) {
        this.itemSeller = value;
    }

    /**
     * Gets the value of the itemBiddersCounter property.
     * 
     */
    public int getItemBiddersCounter() {
        return itemBiddersCounter;
    }

    /**
     * Sets the value of the itemBiddersCounter property.
     * 
     */
    public void setItemBiddersCounter(int value) {
        this.itemBiddersCounter = value;
    }

    /**
     * Gets the value of the itemHighestBidder property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoStruct }
     *     
     */
    public UserInfoStruct getItemHighestBidder() {
        return itemHighestBidder;
    }

    /**
     * Sets the value of the itemHighestBidder property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoStruct }
     *     
     */
    public void setItemHighestBidder(UserInfoStruct value) {
        this.itemHighestBidder = value;
    }

    /**
     * Gets the value of the itemCategoryId property.
     * 
     */
    public int getItemCategoryId() {
        return itemCategoryId;
    }

    /**
     * Sets the value of the itemCategoryId property.
     * 
     */
    public void setItemCategoryId(int value) {
        this.itemCategoryId = value;
    }

    /**
     * Gets the value of the itemViewsCounter property.
     * 
     */
    public int getItemViewsCounter() {
        return itemViewsCounter;
    }

    /**
     * Sets the value of the itemViewsCounter property.
     * 
     */
    public void setItemViewsCounter(int value) {
        this.itemViewsCounter = value;
    }

    /**
     * Gets the value of the itemNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNote() {
        return itemNote;
    }

    /**
     * Sets the value of the itemNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNote(String value) {
        this.itemNote = value;
    }

    /**
     * Gets the value of the itemSpecialInfo property.
     * 
     */
    public int getItemSpecialInfo() {
        return itemSpecialInfo;
    }

    /**
     * Sets the value of the itemSpecialInfo property.
     * 
     */
    public void setItemSpecialInfo(int value) {
        this.itemSpecialInfo = value;
    }

    /**
     * Gets the value of the itemShopInfo property.
     * 
     */
    public int getItemShopInfo() {
        return itemShopInfo;
    }

    /**
     * Sets the value of the itemShopInfo property.
     * 
     */
    public void setItemShopInfo(int value) {
        this.itemShopInfo = value;
    }

    /**
     * Gets the value of the itemProductInfo property.
     * 
     */
    public long getItemProductInfo() {
        return itemProductInfo;
    }

    /**
     * Sets the value of the itemProductInfo property.
     * 
     */
    public void setItemProductInfo(long value) {
        this.itemProductInfo = value;
    }

    /**
     * Gets the value of the itemPayuInfo property.
     * 
     */
    public int getItemPayuInfo() {
        return itemPayuInfo;
    }

    /**
     * Sets the value of the itemPayuInfo property.
     * 
     */
    public void setItemPayuInfo(int value) {
        this.itemPayuInfo = value;
    }

}
