
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDetailsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="payTransDetailsItId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="payTransDetailsPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="payTransDetailsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsStruct", propOrder = {

})
public class PaymentDetailsStruct {

    protected long payTransDetailsItId;
    protected float payTransDetailsPrice;
    protected int payTransDetailsCount;

    /**
     * Gets the value of the payTransDetailsItId property.
     * 
     */
    public long getPayTransDetailsItId() {
        return payTransDetailsItId;
    }

    /**
     * Sets the value of the payTransDetailsItId property.
     * 
     */
    public void setPayTransDetailsItId(long value) {
        this.payTransDetailsItId = value;
    }

    /**
     * Gets the value of the payTransDetailsPrice property.
     * 
     */
    public float getPayTransDetailsPrice() {
        return payTransDetailsPrice;
    }

    /**
     * Sets the value of the payTransDetailsPrice property.
     * 
     */
    public void setPayTransDetailsPrice(float value) {
        this.payTransDetailsPrice = value;
    }

    /**
     * Gets the value of the payTransDetailsCount property.
     * 
     */
    public int getPayTransDetailsCount() {
        return payTransDetailsCount;
    }

    /**
     * Sets the value of the payTransDetailsCount property.
     * 
     */
    public void setPayTransDetailsCount(int value) {
        this.payTransDetailsCount = value;
    }

}
