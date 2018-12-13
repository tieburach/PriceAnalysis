
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteJournal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteJournal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="changeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="currentPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="itemSellerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteJournal", propOrder = {

})
public class SiteJournal {

    protected long rowId;
    protected long itemId;
    @XmlElement(required = true)
    protected String changeType;
    protected long changeDate;
    protected float currentPrice;
    protected long itemSellerId;

    /**
     * Gets the value of the rowId property.
     * 
     */
    public long getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     */
    public void setRowId(long value) {
        this.rowId = value;
    }

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
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeType(String value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the changeDate property.
     * 
     */
    public long getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     */
    public void setChangeDate(long value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the currentPrice property.
     * 
     */
    public float getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Sets the value of the currentPrice property.
     * 
     */
    public void setCurrentPrice(float value) {
        this.currentPrice = value;
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

}
