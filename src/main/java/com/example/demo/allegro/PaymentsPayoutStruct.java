
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentsPayoutStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentsPayoutStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="payoutType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payoutAutoSettings" type="{https://webapi.allegro.pl/service.php}PayoutAutoSettingsStruct"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentsPayoutStruct", propOrder = {

})
public class PaymentsPayoutStruct {

    protected int payoutType;
    @XmlElement(required = true)
    protected PayoutAutoSettingsStruct payoutAutoSettings;

    /**
     * Gets the value of the payoutType property.
     * 
     */
    public int getPayoutType() {
        return payoutType;
    }

    /**
     * Sets the value of the payoutType property.
     * 
     */
    public void setPayoutType(int value) {
        this.payoutType = value;
    }

    /**
     * Gets the value of the payoutAutoSettings property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutAutoSettingsStruct }
     *     
     */
    public PayoutAutoSettingsStruct getPayoutAutoSettings() {
        return payoutAutoSettings;
    }

    /**
     * Sets the value of the payoutAutoSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutAutoSettingsStruct }
     *     
     */
    public void setPayoutAutoSettings(PayoutAutoSettingsStruct value) {
        this.payoutAutoSettings = value;
    }

}
