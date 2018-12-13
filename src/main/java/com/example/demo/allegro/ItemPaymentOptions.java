
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemPaymentOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemPaymentOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="payOptionTransfer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payOptionOnDelivery" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payOptionAllegroPay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payOptionSeeDesc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payOptionPayu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payOptionEscrow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payOptionQiwi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPaymentOptions", propOrder = {

})
public class ItemPaymentOptions {

    protected int payOptionTransfer;
    protected int payOptionOnDelivery;
    protected int payOptionAllegroPay;
    protected int payOptionSeeDesc;
    protected int payOptionPayu;
    protected int payOptionEscrow;
    protected int payOptionQiwi;

    /**
     * Gets the value of the payOptionTransfer property.
     * 
     */
    public int getPayOptionTransfer() {
        return payOptionTransfer;
    }

    /**
     * Sets the value of the payOptionTransfer property.
     * 
     */
    public void setPayOptionTransfer(int value) {
        this.payOptionTransfer = value;
    }

    /**
     * Gets the value of the payOptionOnDelivery property.
     * 
     */
    public int getPayOptionOnDelivery() {
        return payOptionOnDelivery;
    }

    /**
     * Sets the value of the payOptionOnDelivery property.
     * 
     */
    public void setPayOptionOnDelivery(int value) {
        this.payOptionOnDelivery = value;
    }

    /**
     * Gets the value of the payOptionAllegroPay property.
     * 
     */
    public int getPayOptionAllegroPay() {
        return payOptionAllegroPay;
    }

    /**
     * Sets the value of the payOptionAllegroPay property.
     * 
     */
    public void setPayOptionAllegroPay(int value) {
        this.payOptionAllegroPay = value;
    }

    /**
     * Gets the value of the payOptionSeeDesc property.
     * 
     */
    public int getPayOptionSeeDesc() {
        return payOptionSeeDesc;
    }

    /**
     * Sets the value of the payOptionSeeDesc property.
     * 
     */
    public void setPayOptionSeeDesc(int value) {
        this.payOptionSeeDesc = value;
    }

    /**
     * Gets the value of the payOptionPayu property.
     * 
     */
    public int getPayOptionPayu() {
        return payOptionPayu;
    }

    /**
     * Sets the value of the payOptionPayu property.
     * 
     */
    public void setPayOptionPayu(int value) {
        this.payOptionPayu = value;
    }

    /**
     * Gets the value of the payOptionEscrow property.
     * 
     */
    public int getPayOptionEscrow() {
        return payOptionEscrow;
    }

    /**
     * Sets the value of the payOptionEscrow property.
     * 
     */
    public void setPayOptionEscrow(int value) {
        this.payOptionEscrow = value;
    }

    /**
     * Gets the value of the payOptionQiwi property.
     * 
     */
    public int getPayOptionQiwi() {
        return payOptionQiwi;
    }

    /**
     * Sets the value of the payOptionQiwi property.
     * 
     */
    public void setPayOptionQiwi(int value) {
        this.payOptionQiwi = value;
    }

}
