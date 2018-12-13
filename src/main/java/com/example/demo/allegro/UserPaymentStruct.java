
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserPaymentStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserPaymentStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="payTransId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="payTransSellers" type="{https://webapi.allegro.pl/service.php}ArrayOfPaymentsellersstruct" minOccurs="0"/>
 *         &lt;element name="payTransType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payTransStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payTransAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="payTransCreateDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="payTransPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="payTransPostageAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="payTransIncomplete" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPaymentStruct", propOrder = {

})
public class UserPaymentStruct {

    protected long payTransId;
    protected ArrayOfPaymentsellersstruct payTransSellers;
    @XmlElement(required = true)
    protected String payTransType;
    @XmlElement(required = true)
    protected String payTransStatus;
    protected float payTransAmount;
    protected long payTransCreateDate;
    protected float payTransPrice;
    protected float payTransPostageAmount;
    protected int payTransIncomplete;

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
     * Gets the value of the payTransSellers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentsellersstruct }
     *     
     */
    public ArrayOfPaymentsellersstruct getPayTransSellers() {
        return payTransSellers;
    }

    /**
     * Sets the value of the payTransSellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentsellersstruct }
     *     
     */
    public void setPayTransSellers(ArrayOfPaymentsellersstruct value) {
        this.payTransSellers = value;
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

}
