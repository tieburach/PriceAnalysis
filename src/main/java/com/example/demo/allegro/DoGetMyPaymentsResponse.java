
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
 *         &lt;element name="payTransPayment" type="{https://webapi.allegro.pl/service.php}ArrayOfUserpaymentstruct" minOccurs="0"/>
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
    "payTransPayment"
})
@XmlRootElement(name = "doGetMyPaymentsResponse")
public class DoGetMyPaymentsResponse {

    protected ArrayOfUserpaymentstruct payTransPayment;

    /**
     * Gets the value of the payTransPayment property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserpaymentstruct }
     *     
     */
    public ArrayOfUserpaymentstruct getPayTransPayment() {
        return payTransPayment;
    }

    /**
     * Sets the value of the payTransPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserpaymentstruct }
     *     
     */
    public void setPayTransPayment(ArrayOfUserpaymentstruct value) {
        this.payTransPayment = value;
    }

}
