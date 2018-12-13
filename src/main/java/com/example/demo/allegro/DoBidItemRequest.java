
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
 *         &lt;element name="bidItId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bidUserPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="bidQuantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bidBuyNow" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pharmacyRecipientData" type="{https://webapi.allegro.pl/service.php}PharmacyRecipientDataStruct" minOccurs="0"/>
 *         &lt;element name="variantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "bidItId",
    "bidUserPrice",
    "bidQuantity",
    "bidBuyNow",
    "pharmacyRecipientData",
    "variantId"
})
@XmlRootElement(name = "DoBidItemRequest")
public class DoBidItemRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected long bidItId;
    protected float bidUserPrice;
    protected long bidQuantity;
    protected Long bidBuyNow;
    protected PharmacyRecipientDataStruct pharmacyRecipientData;
    protected String variantId;

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
     * Gets the value of the bidItId property.
     * 
     */
    public long getBidItId() {
        return bidItId;
    }

    /**
     * Sets the value of the bidItId property.
     * 
     */
    public void setBidItId(long value) {
        this.bidItId = value;
    }

    /**
     * Gets the value of the bidUserPrice property.
     * 
     */
    public float getBidUserPrice() {
        return bidUserPrice;
    }

    /**
     * Sets the value of the bidUserPrice property.
     * 
     */
    public void setBidUserPrice(float value) {
        this.bidUserPrice = value;
    }

    /**
     * Gets the value of the bidQuantity property.
     * 
     */
    public long getBidQuantity() {
        return bidQuantity;
    }

    /**
     * Sets the value of the bidQuantity property.
     * 
     */
    public void setBidQuantity(long value) {
        this.bidQuantity = value;
    }

    /**
     * Gets the value of the bidBuyNow property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBidBuyNow() {
        return bidBuyNow;
    }

    /**
     * Sets the value of the bidBuyNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBidBuyNow(Long value) {
        this.bidBuyNow = value;
    }

    /**
     * Gets the value of the pharmacyRecipientData property.
     * 
     * @return
     *     possible object is
     *     {@link PharmacyRecipientDataStruct }
     *     
     */
    public PharmacyRecipientDataStruct getPharmacyRecipientData() {
        return pharmacyRecipientData;
    }

    /**
     * Sets the value of the pharmacyRecipientData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PharmacyRecipientDataStruct }
     *     
     */
    public void setPharmacyRecipientData(PharmacyRecipientDataStruct value) {
        this.pharmacyRecipientData = value;
    }

    /**
     * Gets the value of the variantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantId() {
        return variantId;
    }

    /**
     * Sets the value of the variantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantId(String value) {
        this.variantId = value;
    }

}
