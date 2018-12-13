
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethodStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="paymentMethodId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentMethodName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentMethodImage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentMethodUsage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethodStruct", propOrder = {

})
public class PaymentMethodStruct {

    @XmlElement(required = true)
    protected String paymentMethodId;
    @XmlElement(required = true)
    protected String paymentMethodName;
    @XmlElement(required = true)
    protected String paymentMethodImage;
    protected int paymentMethodUsage;

    /**
     * Gets the value of the paymentMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * Sets the value of the paymentMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodId(String value) {
        this.paymentMethodId = value;
    }

    /**
     * Gets the value of the paymentMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    /**
     * Sets the value of the paymentMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodName(String value) {
        this.paymentMethodName = value;
    }

    /**
     * Gets the value of the paymentMethodImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodImage() {
        return paymentMethodImage;
    }

    /**
     * Sets the value of the paymentMethodImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodImage(String value) {
        this.paymentMethodImage = value;
    }

    /**
     * Gets the value of the paymentMethodUsage property.
     * 
     */
    public int getPaymentMethodUsage() {
        return paymentMethodUsage;
    }

    /**
     * Sets the value of the paymentMethodUsage property.
     * 
     */
    public void setPaymentMethodUsage(int value) {
        this.paymentMethodUsage = value;
    }

}
