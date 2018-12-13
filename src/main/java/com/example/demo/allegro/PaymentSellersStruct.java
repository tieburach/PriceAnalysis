
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentSellersStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSellersStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="payTransSellerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payTransSellerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payTransItems" type="{https://webapi.allegro.pl/service.php}ArrayOfPaymentitemsstruct" minOccurs="0"/>
 *         &lt;element name="payTransSellerPostageAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSellersStruct", propOrder = {

})
public class PaymentSellersStruct {

    protected int payTransSellerId;
    @XmlElement(required = true)
    protected String payTransSellerName;
    protected ArrayOfPaymentitemsstruct payTransItems;
    protected float payTransSellerPostageAmount;

    /**
     * Gets the value of the payTransSellerId property.
     * 
     */
    public int getPayTransSellerId() {
        return payTransSellerId;
    }

    /**
     * Sets the value of the payTransSellerId property.
     * 
     */
    public void setPayTransSellerId(int value) {
        this.payTransSellerId = value;
    }

    /**
     * Gets the value of the payTransSellerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTransSellerName() {
        return payTransSellerName;
    }

    /**
     * Sets the value of the payTransSellerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTransSellerName(String value) {
        this.payTransSellerName = value;
    }

    /**
     * Gets the value of the payTransItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentitemsstruct }
     *     
     */
    public ArrayOfPaymentitemsstruct getPayTransItems() {
        return payTransItems;
    }

    /**
     * Sets the value of the payTransItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentitemsstruct }
     *     
     */
    public void setPayTransItems(ArrayOfPaymentitemsstruct value) {
        this.payTransItems = value;
    }

    /**
     * Gets the value of the payTransSellerPostageAmount property.
     * 
     */
    public float getPayTransSellerPostageAmount() {
        return payTransSellerPostageAmount;
    }

    /**
     * Sets the value of the payTransSellerPostageAmount property.
     * 
     */
    public void setPayTransSellerPostageAmount(float value) {
        this.payTransSellerPostageAmount = value;
    }

}
