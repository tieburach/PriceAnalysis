
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
 *         &lt;element name="sessionHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="newStartingPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="newReservePrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="newBuyNowPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="newAdvertisementPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
    "sessionHandle",
    "itemId",
    "newStartingPrice",
    "newReservePrice",
    "newBuyNowPrice",
    "newAdvertisementPrice"
})
@XmlRootElement(name = "DoChangePriceItemRequest")
public class DoChangePriceItemRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected long itemId;
    protected Float newStartingPrice;
    protected Float newReservePrice;
    protected Float newBuyNowPrice;
    protected Float newAdvertisementPrice;

    /**
     * Gets the value of the sessionHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionHandle() {
        return sessionHandle;
    }

    /**
     * Sets the value of the sessionHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionHandle(String value) {
        this.sessionHandle = value;
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
     * Gets the value of the newStartingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNewStartingPrice() {
        return newStartingPrice;
    }

    /**
     * Sets the value of the newStartingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNewStartingPrice(Float value) {
        this.newStartingPrice = value;
    }

    /**
     * Gets the value of the newReservePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNewReservePrice() {
        return newReservePrice;
    }

    /**
     * Sets the value of the newReservePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNewReservePrice(Float value) {
        this.newReservePrice = value;
    }

    /**
     * Gets the value of the newBuyNowPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNewBuyNowPrice() {
        return newBuyNowPrice;
    }

    /**
     * Sets the value of the newBuyNowPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNewBuyNowPrice(Float value) {
        this.newBuyNowPrice = value;
    }

    /**
     * Gets the value of the newAdvertisementPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNewAdvertisementPrice() {
        return newAdvertisementPrice;
    }

    /**
     * Sets the value of the newAdvertisementPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNewAdvertisementPrice(Float value) {
        this.newAdvertisementPrice = value;
    }

}
