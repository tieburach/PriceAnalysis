
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
 *         &lt;element name="shipmentPriceTypes" type="{https://webapi.allegro.pl/service.php}ArrayOfShipmentpricetypestruct" minOccurs="0"/>
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
    "shipmentPriceTypes"
})
@XmlRootElement(name = "doGetShipmentPriceTypesResponse")
public class DoGetShipmentPriceTypesResponse {

    protected ArrayOfShipmentpricetypestruct shipmentPriceTypes;

    /**
     * Gets the value of the shipmentPriceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShipmentpricetypestruct }
     *     
     */
    public ArrayOfShipmentpricetypestruct getShipmentPriceTypes() {
        return shipmentPriceTypes;
    }

    /**
     * Sets the value of the shipmentPriceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShipmentpricetypestruct }
     *     
     */
    public void setShipmentPriceTypes(ArrayOfShipmentpricetypestruct value) {
        this.shipmentPriceTypes = value;
    }

}
