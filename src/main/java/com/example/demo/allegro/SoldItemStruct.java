
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoldItemStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoldItemStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemThumbnailUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemPrice" type="{https://webapi.allegro.pl/service.php}ArrayOfItempricestruct" minOccurs="0"/>
 *         &lt;element name="itemStartQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemSoldQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemQuantityType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemStartTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemEndTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemEndTimeLeft" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemBiddersCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemHighestBidder" type="{https://webapi.allegro.pl/service.php}UserInfoStruct"/>
 *         &lt;element name="itemCategoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemWatchersCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemViewsCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemSpecialInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemShopInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemProductInfo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemPayuInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemDurationInfo" type="{https://webapi.allegro.pl/service.php}DurationInfoStruct" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoldItemStruct", propOrder = {

})
public class SoldItemStruct {

    protected long itemId;
    @XmlElement(required = true)
    protected String itemTitle;
    @XmlElement(required = true)
    protected String itemThumbnailUrl;
    protected ArrayOfItempricestruct itemPrice;
    protected int itemStartQuantity;
    protected int itemSoldQuantity;
    protected int itemQuantityType;
    protected long itemStartTime;
    protected long itemEndTime;
    @XmlElement(required = true)
    protected String itemEndTimeLeft;
    protected int itemBiddersCounter;
    @XmlElement(required = true)
    protected UserInfoStruct itemHighestBidder;
    protected int itemCategoryId;
    protected int itemWatchersCounter;
    protected int itemViewsCounter;
    @XmlElement(required = true)
    protected String itemNote;
    protected int itemSpecialInfo;
    protected int itemShopInfo;
    protected long itemProductInfo;
    protected int itemPayuInfo;
    protected DurationInfoStruct itemDurationInfo;

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
     * Gets the value of the itemStartQuantity property.
     * 
     */
    public int getItemStartQuantity() {
        return itemStartQuantity;
    }

    /**
     * Sets the value of the itemStartQuantity property.
     * 
     */
    public void setItemStartQuantity(int value) {
        this.itemStartQuantity = value;
    }

    /**
     * Gets the value of the itemSoldQuantity property.
     * 
     */
    public int getItemSoldQuantity() {
        return itemSoldQuantity;
    }

    /**
     * Sets the value of the itemSoldQuantity property.
     * 
     */
    public void setItemSoldQuantity(int value) {
        this.itemSoldQuantity = value;
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
     * Gets the value of the itemStartTime property.
     * 
     */
    public long getItemStartTime() {
        return itemStartTime;
    }

    /**
     * Sets the value of the itemStartTime property.
     * 
     */
    public void setItemStartTime(long value) {
        this.itemStartTime = value;
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
     * Gets the value of the itemWatchersCounter property.
     * 
     */
    public int getItemWatchersCounter() {
        return itemWatchersCounter;
    }

    /**
     * Sets the value of the itemWatchersCounter property.
     * 
     */
    public void setItemWatchersCounter(int value) {
        this.itemWatchersCounter = value;
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

    /**
     * Gets the value of the itemDurationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DurationInfoStruct }
     *     
     */
    public DurationInfoStruct getItemDurationInfo() {
        return itemDurationInfo;
    }

    /**
     * Sets the value of the itemDurationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationInfoStruct }
     *     
     */
    public void setItemDurationInfo(DurationInfoStruct value) {
        this.itemDurationInfo = value;
    }

}
