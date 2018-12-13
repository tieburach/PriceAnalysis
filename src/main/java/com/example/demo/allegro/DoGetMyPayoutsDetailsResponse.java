
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
 *         &lt;element name="paymentsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payments" type="{https://webapi.allegro.pl/service.php}ArrayOfPayoutpaymentsstruct" minOccurs="0"/>
 *         &lt;element name="refundsFromCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refundFrom" type="{https://webapi.allegro.pl/service.php}ArrayOfPayoutrefundfromstruct" minOccurs="0"/>
 *         &lt;element name="refundsToCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refundTo" type="{https://webapi.allegro.pl/service.php}ArrayOfPayoutrefundtostruct" minOccurs="0"/>
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
    "paymentsCount",
    "payments",
    "refundsFromCount",
    "refundFrom",
    "refundsToCount",
    "refundTo"
})
@XmlRootElement(name = "doGetMyPayoutsDetailsResponse")
public class DoGetMyPayoutsDetailsResponse {

    protected int paymentsCount;
    protected ArrayOfPayoutpaymentsstruct payments;
    protected int refundsFromCount;
    protected ArrayOfPayoutrefundfromstruct refundFrom;
    protected int refundsToCount;
    protected ArrayOfPayoutrefundtostruct refundTo;

    /**
     * Gets the value of the paymentsCount property.
     * 
     */
    public int getPaymentsCount() {
        return paymentsCount;
    }

    /**
     * Sets the value of the paymentsCount property.
     * 
     */
    public void setPaymentsCount(int value) {
        this.paymentsCount = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPayoutpaymentsstruct }
     *     
     */
    public ArrayOfPayoutpaymentsstruct getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPayoutpaymentsstruct }
     *     
     */
    public void setPayments(ArrayOfPayoutpaymentsstruct value) {
        this.payments = value;
    }

    /**
     * Gets the value of the refundsFromCount property.
     * 
     */
    public int getRefundsFromCount() {
        return refundsFromCount;
    }

    /**
     * Sets the value of the refundsFromCount property.
     * 
     */
    public void setRefundsFromCount(int value) {
        this.refundsFromCount = value;
    }

    /**
     * Gets the value of the refundFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPayoutrefundfromstruct }
     *     
     */
    public ArrayOfPayoutrefundfromstruct getRefundFrom() {
        return refundFrom;
    }

    /**
     * Sets the value of the refundFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPayoutrefundfromstruct }
     *     
     */
    public void setRefundFrom(ArrayOfPayoutrefundfromstruct value) {
        this.refundFrom = value;
    }

    /**
     * Gets the value of the refundsToCount property.
     * 
     */
    public int getRefundsToCount() {
        return refundsToCount;
    }

    /**
     * Sets the value of the refundsToCount property.
     * 
     */
    public void setRefundsToCount(int value) {
        this.refundsToCount = value;
    }

    /**
     * Gets the value of the refundTo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPayoutrefundtostruct }
     *     
     */
    public ArrayOfPayoutrefundtostruct getRefundTo() {
        return refundTo;
    }

    /**
     * Sets the value of the refundTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPayoutrefundtostruct }
     *     
     */
    public void setRefundTo(ArrayOfPayoutrefundtostruct value) {
        this.refundTo = value;
    }

}
