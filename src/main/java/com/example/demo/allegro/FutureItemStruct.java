
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FutureItemStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FutureItemStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemThumbnailUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemPrice" type="{https://webapi.allegro.pl/service.php}ArrayOfItempricestruct" minOccurs="0"/>
 *         &lt;element name="itemStartQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemQuantityType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemStartTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemCategoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemSpecialInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemShopInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemProductInfo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemPayuInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FutureItemStruct", propOrder = {

})
public class FutureItemStruct {

    protected long itemId;
    @XmlElement(required = true)
    protected String itemTitle;
    @XmlElement(required = true)
    protected String itemThumbnailUrl;
    protected ArrayOfItempricestruct itemPrice;
    protected int itemStartQuantity;
    protected int itemQuantityType;
    protected long itemStartTime;
    protected int itemCategoryId;
    @XmlElement(required = true)
    protected String itemNote;
    protected int itemSpecialInfo;
    protected int itemShopInfo;
    protected long itemProductInfo;
    protected int itemPayuInfo;
    protected int itemStatus;

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
     * Gets the value of the itemStatus property.
     * 
     */
    public int getItemStatus() {
        return itemStatus;
    }

    /**
     * Sets the value of the itemStatus property.
     * 
     */
    public void setItemStatus(int value) {
        this.itemStatus = value;
    }

}
