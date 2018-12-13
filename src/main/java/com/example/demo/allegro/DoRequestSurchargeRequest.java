
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
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="surchargeValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="surchargeMessageToBuyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "transactionId",
    "surchargeValue",
    "surchargeMessageToBuyer"
})
@XmlRootElement(name = "DoRequestSurchargeRequest")
public class DoRequestSurchargeRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected long transactionId;
    protected float surchargeValue;
    protected String surchargeMessageToBuyer;

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
     * Gets the value of the transactionId property.
     * 
     */
    public long getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(long value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the surchargeValue property.
     * 
     */
    public float getSurchargeValue() {
        return surchargeValue;
    }

    /**
     * Sets the value of the surchargeValue property.
     * 
     */
    public void setSurchargeValue(float value) {
        this.surchargeValue = value;
    }

    /**
     * Gets the value of the surchargeMessageToBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeMessageToBuyer() {
        return surchargeMessageToBuyer;
    }

    /**
     * Sets the value of the surchargeMessageToBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeMessageToBuyer(String value) {
        this.surchargeMessageToBuyer = value;
    }

}
