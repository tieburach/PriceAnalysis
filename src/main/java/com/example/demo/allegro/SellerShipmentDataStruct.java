
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerShipmentDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerShipmentDataStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sellerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellerPaymentInfo" type="{https://webapi.allegro.pl/service.php}SellerPaymentInfoStruct"/>
 *         &lt;element name="sellerOtherShipmentIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="generalDeliveryPaymentInfo" type="{https://webapi.allegro.pl/service.php}ArrayOfShipmentpaymentinfostruct" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerShipmentDataStruct", propOrder = {

})
public class SellerShipmentDataStruct {

    protected int sellerId;
    @XmlElement(required = true)
    protected SellerPaymentInfoStruct sellerPaymentInfo;
    protected int sellerOtherShipmentIsActive;
    protected ArrayOfShipmentpaymentinfostruct generalDeliveryPaymentInfo;

    /**
     * Gets the value of the sellerId property.
     * 
     */
    public int getSellerId() {
        return sellerId;
    }

    /**
     * Sets the value of the sellerId property.
     * 
     */
    public void setSellerId(int value) {
        this.sellerId = value;
    }

    /**
     * Gets the value of the sellerPaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SellerPaymentInfoStruct }
     *     
     */
    public SellerPaymentInfoStruct getSellerPaymentInfo() {
        return sellerPaymentInfo;
    }

    /**
     * Sets the value of the sellerPaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerPaymentInfoStruct }
     *     
     */
    public void setSellerPaymentInfo(SellerPaymentInfoStruct value) {
        this.sellerPaymentInfo = value;
    }

    /**
     * Gets the value of the sellerOtherShipmentIsActive property.
     * 
     */
    public int getSellerOtherShipmentIsActive() {
        return sellerOtherShipmentIsActive;
    }

    /**
     * Sets the value of the sellerOtherShipmentIsActive property.
     * 
     */
    public void setSellerOtherShipmentIsActive(int value) {
        this.sellerOtherShipmentIsActive = value;
    }

    /**
     * Gets the value of the generalDeliveryPaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShipmentpaymentinfostruct }
     *     
     */
    public ArrayOfShipmentpaymentinfostruct getGeneralDeliveryPaymentInfo() {
        return generalDeliveryPaymentInfo;
    }

    /**
     * Sets the value of the generalDeliveryPaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShipmentpaymentinfostruct }
     *     
     */
    public void setGeneralDeliveryPaymentInfo(ArrayOfShipmentpaymentinfostruct value) {
        this.generalDeliveryPaymentInfo = value;
    }

}
