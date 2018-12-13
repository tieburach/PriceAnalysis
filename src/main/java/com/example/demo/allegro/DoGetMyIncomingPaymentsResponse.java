
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
 *         &lt;element name="payTransIncome" type="{https://webapi.allegro.pl/service.php}ArrayOfUserincomingpaymentstruct" minOccurs="0"/>
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
    "payTransIncome"
})
@XmlRootElement(name = "doGetMyIncomingPaymentsResponse")
public class DoGetMyIncomingPaymentsResponse {

    protected ArrayOfUserincomingpaymentstruct payTransIncome;

    /**
     * Gets the value of the payTransIncome property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserincomingpaymentstruct }
     *     
     */
    public ArrayOfUserincomingpaymentstruct getPayTransIncome() {
        return payTransIncome;
    }

    /**
     * Sets the value of the payTransIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserincomingpaymentstruct }
     *     
     */
    public void setPayTransIncome(ArrayOfUserincomingpaymentstruct value) {
        this.payTransIncome = value;
    }

}
