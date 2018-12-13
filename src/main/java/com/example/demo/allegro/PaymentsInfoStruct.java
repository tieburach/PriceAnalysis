
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentsInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentsInfoStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="paymentsBalance" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="paymentsBankAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentsUserData" type="{https://webapi.allegro.pl/service.php}PaymentsUserDataStruct"/>
 *         &lt;element name="paymentsPayout" type="{https://webapi.allegro.pl/service.php}PaymentsPayoutStruct"/>
 *         &lt;element name="paymentsNotifications" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentsInfoStruct", propOrder = {

})
public class PaymentsInfoStruct {

    protected float paymentsBalance;
    @XmlElement(required = true)
    protected String paymentsBankAccount;
    @XmlElement(required = true)
    protected PaymentsUserDataStruct paymentsUserData;
    @XmlElement(required = true)
    protected PaymentsPayoutStruct paymentsPayout;
    protected int paymentsNotifications;

    /**
     * Gets the value of the paymentsBalance property.
     * 
     */
    public float getPaymentsBalance() {
        return paymentsBalance;
    }

    /**
     * Sets the value of the paymentsBalance property.
     * 
     */
    public void setPaymentsBalance(float value) {
        this.paymentsBalance = value;
    }

    /**
     * Gets the value of the paymentsBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentsBankAccount() {
        return paymentsBankAccount;
    }

    /**
     * Sets the value of the paymentsBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentsBankAccount(String value) {
        this.paymentsBankAccount = value;
    }

    /**
     * Gets the value of the paymentsUserData property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentsUserDataStruct }
     *     
     */
    public PaymentsUserDataStruct getPaymentsUserData() {
        return paymentsUserData;
    }

    /**
     * Sets the value of the paymentsUserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsUserDataStruct }
     *     
     */
    public void setPaymentsUserData(PaymentsUserDataStruct value) {
        this.paymentsUserData = value;
    }

    /**
     * Gets the value of the paymentsPayout property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentsPayoutStruct }
     *     
     */
    public PaymentsPayoutStruct getPaymentsPayout() {
        return paymentsPayout;
    }

    /**
     * Sets the value of the paymentsPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsPayoutStruct }
     *     
     */
    public void setPaymentsPayout(PaymentsPayoutStruct value) {
        this.paymentsPayout = value;
    }

    /**
     * Gets the value of the paymentsNotifications property.
     * 
     */
    public int getPaymentsNotifications() {
        return paymentsNotifications;
    }

    /**
     * Sets the value of the paymentsNotifications property.
     * 
     */
    public void setPaymentsNotifications(int value) {
        this.paymentsNotifications = value;
    }

}
