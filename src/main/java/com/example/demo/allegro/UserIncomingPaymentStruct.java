
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserIncomingPaymentStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIncomingPaymentStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="payTransId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="payTransItId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="payTransBuyerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payTransType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payTransStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payTransAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="payTransCreateDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="payTransRecvDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="payTransPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="payTransCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payTransPostageAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="payTransDetails" type="{https://webapi.allegro.pl/service.php}ArrayOfPaymentdetailsstruct" minOccurs="0"/>
 *         &lt;element name="payTransIncomplete" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payTransMainId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIncomingPaymentStruct", propOrder = {

})
public class UserIncomingPaymentStruct {

    protected long payTransId;
    protected long payTransItId;
    protected int payTransBuyerId;
    @XmlElement(required = true)
    protected String payTransType;
    @XmlElement(required = true)
    protected String payTransStatus;
    protected float payTransAmount;
    protected long payTransCreateDate;
    protected long payTransRecvDate;
    protected float payTransPrice;
    protected int payTransCount;
    protected float payTransPostageAmount;
    protected ArrayOfPaymentdetailsstruct payTransDetails;
    protected int payTransIncomplete;
    protected long payTransMainId;

    /**
     * Gets the value of the payTransId property.
     * 
     */
    public long getPayTransId() {
        return payTransId;
    }

    /**
     * Sets the value of the payTransId property.
     * 
     */
    public void setPayTransId(long value) {
        this.payTransId = value;
    }

    /**
     * Gets the value of the payTransItId property.
     * 
     */
    public long getPayTransItId() {
        return payTransItId;
    }

    /**
     * Sets the value of the payTransItId property.
     * 
     */
    public void setPayTransItId(long value) {
        this.payTransItId = value;
    }

    /**
     * Gets the value of the payTransBuyerId property.
     * 
     */
    public int getPayTransBuyerId() {
        return payTransBuyerId;
    }

    /**
     * Sets the value of the payTransBuyerId property.
     * 
     */
    public void setPayTransBuyerId(int value) {
        this.payTransBuyerId = value;
    }

    /**
     * Gets the value of the payTransType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTransType() {
        return payTransType;
    }

    /**
     * Sets the value of the payTransType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTransType(String value) {
        this.payTransType = value;
    }

    /**
     * Gets the value of the payTransStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTransStatus() {
        return payTransStatus;
    }

    /**
     * Sets the value of the payTransStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTransStatus(String value) {
        this.payTransStatus = value;
    }

    /**
     * Gets the value of the payTransAmount property.
     * 
     */
    public float getPayTransAmount() {
        return payTransAmount;
    }

    /**
     * Sets the value of the payTransAmount property.
     * 
     */
    public void setPayTransAmount(float value) {
        this.payTransAmount = value;
    }

    /**
     * Gets the value of the payTransCreateDate property.
     * 
     */
    public long getPayTransCreateDate() {
        return payTransCreateDate;
    }

    /**
     * Sets the value of the payTransCreateDate property.
     * 
     */
    public void setPayTransCreateDate(long value) {
        this.payTransCreateDate = value;
    }

    /**
     * Gets the value of the payTransRecvDate property.
     * 
     */
    public long getPayTransRecvDate() {
        return payTransRecvDate;
    }

    /**
     * Sets the value of the payTransRecvDate property.
     * 
     */
    public void setPayTransRecvDate(long value) {
        this.payTransRecvDate = value;
    }

    /**
     * Gets the value of the payTransPrice property.
     * 
     */
    public float getPayTransPrice() {
        return payTransPrice;
    }

    /**
     * Sets the value of the payTransPrice property.
     * 
     */
    public void setPayTransPrice(float value) {
        this.payTransPrice = value;
    }

    /**
     * Gets the value of the payTransCount property.
     * 
     */
    public int getPayTransCount() {
        return payTransCount;
    }

    /**
     * Sets the value of the payTransCount property.
     * 
     */
    public void setPayTransCount(int value) {
        this.payTransCount = value;
    }

    /**
     * Gets the value of the payTransPostageAmount property.
     * 
     */
    public float getPayTransPostageAmount() {
        return payTransPostageAmount;
    }

    /**
     * Sets the value of the payTransPostageAmount property.
     * 
     */
    public void setPayTransPostageAmount(float value) {
        this.payTransPostageAmount = value;
    }

    /**
     * Gets the value of the payTransDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentdetailsstruct }
     *     
     */
    public ArrayOfPaymentdetailsstruct getPayTransDetails() {
        return payTransDetails;
    }

    /**
     * Sets the value of the payTransDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentdetailsstruct }
     *     
     */
    public void setPayTransDetails(ArrayOfPaymentdetailsstruct value) {
        this.payTransDetails = value;
    }

    /**
     * Gets the value of the payTransIncomplete property.
     * 
     */
    public int getPayTransIncomplete() {
        return payTransIncomplete;
    }

    /**
     * Sets the value of the payTransIncomplete property.
     * 
     */
    public void setPayTransIncomplete(int value) {
        this.payTransIncomplete = value;
    }

    /**
     * Gets the value of the payTransMainId property.
     * 
     */
    public long getPayTransMainId() {
        return payTransMainId;
    }

    /**
     * Sets the value of the payTransMainId property.
     * 
     */
    public void setPayTransMainId(long value) {
        this.payTransMainId = value;
    }

}
