
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentDataStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="shipmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shipmentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipmentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shipmentTime" type="{https://webapi.allegro.pl/service.php}ShipmentTimeStruct"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDataStruct", propOrder = {

})
public class ShipmentDataStruct {

    protected int shipmentId;
    @XmlElement(required = true)
    protected String shipmentName;
    protected int shipmentType;
    @XmlElement(required = true)
    protected ShipmentTimeStruct shipmentTime;

    /**
     * Gets the value of the shipmentId property.
     * 
     */
    public int getShipmentId() {
        return shipmentId;
    }

    /**
     * Sets the value of the shipmentId property.
     * 
     */
    public void setShipmentId(int value) {
        this.shipmentId = value;
    }

    /**
     * Gets the value of the shipmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentName() {
        return shipmentName;
    }

    /**
     * Sets the value of the shipmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentName(String value) {
        this.shipmentName = value;
    }

    /**
     * Gets the value of the shipmentType property.
     * 
     */
    public int getShipmentType() {
        return shipmentType;
    }

    /**
     * Sets the value of the shipmentType property.
     * 
     */
    public void setShipmentType(int value) {
        this.shipmentType = value;
    }

    /**
     * Gets the value of the shipmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentTimeStruct }
     *     
     */
    public ShipmentTimeStruct getShipmentTime() {
        return shipmentTime;
    }

    /**
     * Sets the value of the shipmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTimeStruct }
     *     
     */
    public void setShipmentTime(ShipmentTimeStruct value) {
        this.shipmentTime = value;
    }

}
