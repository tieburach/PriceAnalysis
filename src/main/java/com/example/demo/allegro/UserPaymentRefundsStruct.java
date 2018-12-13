
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserPaymentRefundsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserPaymentRefundsStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="payRefundTransId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="payRefundItId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="payRefundSellerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payRefundValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="payRefundReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payRefundDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPaymentRefundsStruct", propOrder = {

})
public class UserPaymentRefundsStruct {

    protected long payRefundTransId;
    protected long payRefundItId;
    protected int payRefundSellerId;
    protected float payRefundValue;
    @XmlElement(required = true)
    protected String payRefundReason;
    protected long payRefundDate;

    /**
     * Gets the value of the payRefundTransId property.
     * 
     */
    public long getPayRefundTransId() {
        return payRefundTransId;
    }

    /**
     * Sets the value of the payRefundTransId property.
     * 
     */
    public void setPayRefundTransId(long value) {
        this.payRefundTransId = value;
    }

    /**
     * Gets the value of the payRefundItId property.
     * 
     */
    public long getPayRefundItId() {
        return payRefundItId;
    }

    /**
     * Sets the value of the payRefundItId property.
     * 
     */
    public void setPayRefundItId(long value) {
        this.payRefundItId = value;
    }

    /**
     * Gets the value of the payRefundSellerId property.
     * 
     */
    public int getPayRefundSellerId() {
        return payRefundSellerId;
    }

    /**
     * Sets the value of the payRefundSellerId property.
     * 
     */
    public void setPayRefundSellerId(int value) {
        this.payRefundSellerId = value;
    }

    /**
     * Gets the value of the payRefundValue property.
     * 
     */
    public float getPayRefundValue() {
        return payRefundValue;
    }

    /**
     * Sets the value of the payRefundValue property.
     * 
     */
    public void setPayRefundValue(float value) {
        this.payRefundValue = value;
    }

    /**
     * Gets the value of the payRefundReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayRefundReason() {
        return payRefundReason;
    }

    /**
     * Sets the value of the payRefundReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayRefundReason(String value) {
        this.payRefundReason = value;
    }

    /**
     * Gets the value of the payRefundDate property.
     * 
     */
    public long getPayRefundDate() {
        return payRefundDate;
    }

    /**
     * Sets the value of the payRefundDate property.
     * 
     */
    public void setPayRefundDate(long value) {
        this.payRefundDate = value;
    }

}
