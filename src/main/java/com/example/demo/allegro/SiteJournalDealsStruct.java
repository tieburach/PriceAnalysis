
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteJournalDealsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteJournalDealsStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dealEventId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dealEventType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dealEventTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dealId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dealTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dealSellerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dealItemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dealBuyerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dealQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteJournalDealsStruct", propOrder = {

})
public class SiteJournalDealsStruct {

    protected long dealEventId;
    protected int dealEventType;
    protected long dealEventTime;
    protected long dealId;
    protected long dealTransactionId;
    protected int dealSellerId;
    protected long dealItemId;
    protected int dealBuyerId;
    protected int dealQuantity;

    /**
     * Gets the value of the dealEventId property.
     * 
     */
    public long getDealEventId() {
        return dealEventId;
    }

    /**
     * Sets the value of the dealEventId property.
     * 
     */
    public void setDealEventId(long value) {
        this.dealEventId = value;
    }

    /**
     * Gets the value of the dealEventType property.
     * 
     */
    public int getDealEventType() {
        return dealEventType;
    }

    /**
     * Sets the value of the dealEventType property.
     * 
     */
    public void setDealEventType(int value) {
        this.dealEventType = value;
    }

    /**
     * Gets the value of the dealEventTime property.
     * 
     */
    public long getDealEventTime() {
        return dealEventTime;
    }

    /**
     * Sets the value of the dealEventTime property.
     * 
     */
    public void setDealEventTime(long value) {
        this.dealEventTime = value;
    }

    /**
     * Gets the value of the dealId property.
     * 
     */
    public long getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     */
    public void setDealId(long value) {
        this.dealId = value;
    }

    /**
     * Gets the value of the dealTransactionId property.
     * 
     */
    public long getDealTransactionId() {
        return dealTransactionId;
    }

    /**
     * Sets the value of the dealTransactionId property.
     * 
     */
    public void setDealTransactionId(long value) {
        this.dealTransactionId = value;
    }

    /**
     * Gets the value of the dealSellerId property.
     * 
     */
    public int getDealSellerId() {
        return dealSellerId;
    }

    /**
     * Sets the value of the dealSellerId property.
     * 
     */
    public void setDealSellerId(int value) {
        this.dealSellerId = value;
    }

    /**
     * Gets the value of the dealItemId property.
     * 
     */
    public long getDealItemId() {
        return dealItemId;
    }

    /**
     * Sets the value of the dealItemId property.
     * 
     */
    public void setDealItemId(long value) {
        this.dealItemId = value;
    }

    /**
     * Gets the value of the dealBuyerId property.
     * 
     */
    public int getDealBuyerId() {
        return dealBuyerId;
    }

    /**
     * Sets the value of the dealBuyerId property.
     * 
     */
    public void setDealBuyerId(int value) {
        this.dealBuyerId = value;
    }

    /**
     * Gets the value of the dealQuantity property.
     * 
     */
    public int getDealQuantity() {
        return dealQuantity;
    }

    /**
     * Sets the value of the dealQuantity property.
     * 
     */
    public void setDealQuantity(int value) {
        this.dealQuantity = value;
    }

}
