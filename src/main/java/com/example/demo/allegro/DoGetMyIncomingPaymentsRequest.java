
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
 *         &lt;element name="buyerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="transRecvDateFrom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="transRecvDateTo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="transPageLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="strictedSearch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "buyerId",
    "itemId",
    "transRecvDateFrom",
    "transRecvDateTo",
    "transPageLimit",
    "transOffset",
    "strictedSearch"
})
@XmlRootElement(name = "DoGetMyIncomingPaymentsRequest")
public class DoGetMyIncomingPaymentsRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected Integer buyerId;
    protected Long itemId;
    protected Long transRecvDateFrom;
    protected Long transRecvDateTo;
    protected Integer transPageLimit;
    protected Integer transOffset;
    protected Integer strictedSearch;

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
     * Gets the value of the buyerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * Sets the value of the buyerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuyerId(Integer value) {
        this.buyerId = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemId(Long value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the transRecvDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransRecvDateFrom() {
        return transRecvDateFrom;
    }

    /**
     * Sets the value of the transRecvDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransRecvDateFrom(Long value) {
        this.transRecvDateFrom = value;
    }

    /**
     * Gets the value of the transRecvDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransRecvDateTo() {
        return transRecvDateTo;
    }

    /**
     * Sets the value of the transRecvDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransRecvDateTo(Long value) {
        this.transRecvDateTo = value;
    }

    /**
     * Gets the value of the transPageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransPageLimit() {
        return transPageLimit;
    }

    /**
     * Sets the value of the transPageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransPageLimit(Integer value) {
        this.transPageLimit = value;
    }

    /**
     * Gets the value of the transOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransOffset() {
        return transOffset;
    }

    /**
     * Sets the value of the transOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransOffset(Integer value) {
        this.transOffset = value;
    }

    /**
     * Gets the value of the strictedSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStrictedSearch() {
        return strictedSearch;
    }

    /**
     * Sets the value of the strictedSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrictedSearch(Integer value) {
        this.strictedSearch = value;
    }

}
