
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentPriceTypeStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentPriceTypeStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="shipmentPriceTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shipmentPriceTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentPriceTypeStruct", propOrder = {

})
public class ShipmentPriceTypeStruct {

    protected int shipmentPriceTypeId;
    @XmlElement(required = true)
    protected String shipmentPriceTypeName;

    /**
     * Gets the value of the shipmentPriceTypeId property.
     * 
     */
    public int getShipmentPriceTypeId() {
        return shipmentPriceTypeId;
    }

    /**
     * Sets the value of the shipmentPriceTypeId property.
     * 
     */
    public void setShipmentPriceTypeId(int value) {
        this.shipmentPriceTypeId = value;
    }

    /**
     * Gets the value of the shipmentPriceTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentPriceTypeName() {
        return shipmentPriceTypeName;
    }

    /**
     * Sets the value of the shipmentPriceTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentPriceTypeName(String value) {
        this.shipmentPriceTypeName = value;
    }

}
