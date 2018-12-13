
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RefundsDealsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundsDealsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dealId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dealDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="timeLeft" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="buyerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="buyerLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bidsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundsDealsListType", propOrder = {

})
public class RefundsDealsListType {

    protected long dealId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dealDate;
    protected int timeLeft;
    protected int buyerId;
    @XmlElement(required = true)
    protected String buyerLogin;
    protected long itemId;
    @XmlElement(required = true)
    protected String itemTitle;
    protected int bidsCount;
    @XmlElement(required = true)
    protected String quantityType;
    @XmlElement(required = true)
    protected String paymentStatus;

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
     * Gets the value of the dealDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDealDate() {
        return dealDate;
    }

    /**
     * Sets the value of the dealDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDealDate(XMLGregorianCalendar value) {
        this.dealDate = value;
    }

    /**
     * Gets the value of the timeLeft property.
     * 
     */
    public int getTimeLeft() {
        return timeLeft;
    }

    /**
     * Sets the value of the timeLeft property.
     * 
     */
    public void setTimeLeft(int value) {
        this.timeLeft = value;
    }

    /**
     * Gets the value of the buyerId property.
     * 
     */
    public int getBuyerId() {
        return buyerId;
    }

    /**
     * Sets the value of the buyerId property.
     * 
     */
    public void setBuyerId(int value) {
        this.buyerId = value;
    }

    /**
     * Gets the value of the buyerLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerLogin() {
        return buyerLogin;
    }

    /**
     * Sets the value of the buyerLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerLogin(String value) {
        this.buyerLogin = value;
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
     * Gets the value of the bidsCount property.
     * 
     */
    public int getBidsCount() {
        return bidsCount;
    }

    /**
     * Sets the value of the bidsCount property.
     * 
     */
    public void setBidsCount(int value) {
        this.bidsCount = value;
    }

    /**
     * Gets the value of the quantityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityType() {
        return quantityType;
    }

    /**
     * Sets the value of the quantityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityType(String value) {
        this.quantityType = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

}
