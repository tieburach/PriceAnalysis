
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewPostBuyFormCommonStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewPostBuyFormCommonStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="paymentMethodId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipmentAddressType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shipmentAddressData" type="{https://webapi.allegro.pl/service.php}AddressUserDataStruct" minOccurs="0"/>
 *         &lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceOption" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="invoiceInfo" type="{https://webapi.allegro.pl/service.php}InvoiceInfoStruct" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewPostBuyFormCommonStruct", propOrder = {

})
public class NewPostBuyFormCommonStruct {

    @XmlElement(required = true)
    protected String paymentMethodId;
    protected int shipmentAddressType;
    protected AddressUserDataStruct shipmentAddressData;
    protected String contactPhone;
    protected int invoiceOption;
    protected InvoiceInfoStruct invoiceInfo;

    /**
     * Gets the value of the paymentMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * Sets the value of the paymentMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodId(String value) {
        this.paymentMethodId = value;
    }

    /**
     * Gets the value of the shipmentAddressType property.
     * 
     */
    public int getShipmentAddressType() {
        return shipmentAddressType;
    }

    /**
     * Sets the value of the shipmentAddressType property.
     * 
     */
    public void setShipmentAddressType(int value) {
        this.shipmentAddressType = value;
    }

    /**
     * Gets the value of the shipmentAddressData property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUserDataStruct }
     *     
     */
    public AddressUserDataStruct getShipmentAddressData() {
        return shipmentAddressData;
    }

    /**
     * Sets the value of the shipmentAddressData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUserDataStruct }
     *     
     */
    public void setShipmentAddressData(AddressUserDataStruct value) {
        this.shipmentAddressData = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the invoiceOption property.
     * 
     */
    public int getInvoiceOption() {
        return invoiceOption;
    }

    /**
     * Sets the value of the invoiceOption property.
     * 
     */
    public void setInvoiceOption(int value) {
        this.invoiceOption = value;
    }

    /**
     * Gets the value of the invoiceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInfoStruct }
     *     
     */
    public InvoiceInfoStruct getInvoiceInfo() {
        return invoiceInfo;
    }

    /**
     * Sets the value of the invoiceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInfoStruct }
     *     
     */
    public void setInvoiceInfo(InvoiceInfoStruct value) {
        this.invoiceInfo = value;
    }

}
