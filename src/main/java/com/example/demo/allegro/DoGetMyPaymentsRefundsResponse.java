
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="payTransPaymentRefunds" type="{https://webapi.allegro.pl/service.php}ArrayOfUserpaymentrefundsstruct" minOccurs="0"/>
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
    "payTransPaymentRefunds"
})
@XmlRootElement(name = "doGetMyPaymentsRefundsResponse")
public class DoGetMyPaymentsRefundsResponse {

    protected ArrayOfUserpaymentrefundsstruct payTransPaymentRefunds;

    /**
     * Gets the value of the payTransPaymentRefunds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserpaymentrefundsstruct }
     *     
     */
    public ArrayOfUserpaymentrefundsstruct getPayTransPaymentRefunds() {
        return payTransPaymentRefunds;
    }

    /**
     * Sets the value of the payTransPaymentRefunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserpaymentrefundsstruct }
     *     
     */
    public void setPayTransPaymentRefunds(ArrayOfUserpaymentrefundsstruct value) {
        this.payTransPaymentRefunds = value;
    }

}
