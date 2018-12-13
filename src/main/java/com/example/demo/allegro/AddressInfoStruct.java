
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressInfoStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="addressUserData" type="{https://webapi.allegro.pl/service.php}AddressUserDataStruct"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInfoStruct", propOrder = {

})
public class AddressInfoStruct {

    protected int addressType;
    @XmlElement(required = true)
    protected AddressUserDataStruct addressUserData;

    /**
     * Gets the value of the addressType property.
     * 
     */
    public int getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     */
    public void setAddressType(int value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the addressUserData property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUserDataStruct }
     *     
     */
    public AddressUserDataStruct getAddressUserData() {
        return addressUserData;
    }

    /**
     * Sets the value of the addressUserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUserDataStruct }
     *     
     */
    public void setAddressUserData(AddressUserDataStruct value) {
        this.addressUserData = value;
    }

}
