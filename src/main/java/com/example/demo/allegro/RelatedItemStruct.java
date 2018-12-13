
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedItemStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedItemStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemThumbnail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="itemBoughtCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="itemPaymentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemSellerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemSellerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemInvoiceInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemCategoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedItemStruct", propOrder = {

})
public class RelatedItemStruct {

    protected long itemId;
    @XmlElement(required = true)
    protected String itemTitle;
    @XmlElement(required = true)
    protected String itemThumbnail;
    protected float itemPrice;
    protected int itemBoughtCount;
    protected float itemAmount;
    protected int itemPaymentType;
    protected long itemSellerId;
    @XmlElement(required = true)
    protected String itemSellerName;
    protected int itemInvoiceInfo;
    protected Integer itemCategoryId;

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
     * Gets the value of the itemThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemThumbnail() {
        return itemThumbnail;
    }

    /**
     * Sets the value of the itemThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemThumbnail(String value) {
        this.itemThumbnail = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     */
    public float getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     */
    public void setItemPrice(float value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the itemBoughtCount property.
     * 
     */
    public int getItemBoughtCount() {
        return itemBoughtCount;
    }

    /**
     * Sets the value of the itemBoughtCount property.
     * 
     */
    public void setItemBoughtCount(int value) {
        this.itemBoughtCount = value;
    }

    /**
     * Gets the value of the itemAmount property.
     * 
     */
    public float getItemAmount() {
        return itemAmount;
    }

    /**
     * Sets the value of the itemAmount property.
     * 
     */
    public void setItemAmount(float value) {
        this.itemAmount = value;
    }

    /**
     * Gets the value of the itemPaymentType property.
     * 
     */
    public int getItemPaymentType() {
        return itemPaymentType;
    }

    /**
     * Sets the value of the itemPaymentType property.
     * 
     */
    public void setItemPaymentType(int value) {
        this.itemPaymentType = value;
    }

    /**
     * Gets the value of the itemSellerId property.
     * 
     */
    public long getItemSellerId() {
        return itemSellerId;
    }

    /**
     * Sets the value of the itemSellerId property.
     * 
     */
    public void setItemSellerId(long value) {
        this.itemSellerId = value;
    }

    /**
     * Gets the value of the itemSellerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSellerName() {
        return itemSellerName;
    }

    /**
     * Sets the value of the itemSellerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSellerName(String value) {
        this.itemSellerName = value;
    }

    /**
     * Gets the value of the itemInvoiceInfo property.
     * 
     */
    public int getItemInvoiceInfo() {
        return itemInvoiceInfo;
    }

    /**
     * Sets the value of the itemInvoiceInfo property.
     * 
     */
    public void setItemInvoiceInfo(int value) {
        this.itemInvoiceInfo = value;
    }

    /**
     * Gets the value of the itemCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemCategoryId() {
        return itemCategoryId;
    }

    /**
     * Sets the value of the itemCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemCategoryId(Integer value) {
        this.itemCategoryId = value;
    }

}
