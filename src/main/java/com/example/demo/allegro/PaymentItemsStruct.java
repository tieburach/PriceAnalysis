
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentItemsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentItemsStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="payTransItId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="payTransItName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payTransItCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payTransItPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentItemsStruct", propOrder = {

})
public class PaymentItemsStruct {

    protected long payTransItId;
    @XmlElement(required = true)
    protected String payTransItName;
    protected int payTransItCount;
    protected float payTransItPrice;

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
     * Gets the value of the payTransItName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTransItName() {
        return payTransItName;
    }

    /**
     * Sets the value of the payTransItName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTransItName(String value) {
        this.payTransItName = value;
    }

    /**
     * Gets the value of the payTransItCount property.
     * 
     */
    public int getPayTransItCount() {
        return payTransItCount;
    }

    /**
     * Sets the value of the payTransItCount property.
     * 
     */
    public void setPayTransItCount(int value) {
        this.payTransItCount = value;
    }

    /**
     * Gets the value of the payTransItPrice property.
     * 
     */
    public float getPayTransItPrice() {
        return payTransItPrice;
    }

    /**
     * Sets the value of the payTransItPrice property.
     * 
     */
    public void setPayTransItPrice(float value) {
        this.payTransItPrice = value;
    }

}
