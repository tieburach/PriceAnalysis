
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceInfoStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="invoiceAddressType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="invoiceAddressData" type="{https://webapi.allegro.pl/service.php}AddressUserDataStruct" minOccurs="0"/>
 *         &lt;element name="invoiceNip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceInfoStruct", propOrder = {

})
public class InvoiceInfoStruct {

    protected int invoiceAddressType;
    protected AddressUserDataStruct invoiceAddressData;
    @XmlElement(required = true)
    protected String invoiceNip;

    /**
     * Gets the value of the invoiceAddressType property.
     * 
     */
    public int getInvoiceAddressType() {
        return invoiceAddressType;
    }

    /**
     * Sets the value of the invoiceAddressType property.
     * 
     */
    public void setInvoiceAddressType(int value) {
        this.invoiceAddressType = value;
    }

    /**
     * Gets the value of the invoiceAddressData property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUserDataStruct }
     *     
     */
    public AddressUserDataStruct getInvoiceAddressData() {
        return invoiceAddressData;
    }

    /**
     * Sets the value of the invoiceAddressData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUserDataStruct }
     *     
     */
    public void setInvoiceAddressData(AddressUserDataStruct value) {
        this.invoiceAddressData = value;
    }

    /**
     * Gets the value of the invoiceNip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNip() {
        return invoiceNip;
    }

    /**
     * Sets the value of the invoiceNip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNip(String value) {
        this.invoiceNip = value;
    }

}
