
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentPaymentInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentPaymentInfoStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="shipmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shipmentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipmentAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="shipmentPaymentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shipmentItemIds" type="{https://webapi.allegro.pl/service.php}ArrayOfLong" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentPaymentInfoStruct", propOrder = {

})
public class ShipmentPaymentInfoStruct {

    protected int shipmentId;
    @XmlElement(required = true)
    protected String shipmentName;
    protected float shipmentAmount;
    protected int shipmentPaymentType;
    protected ArrayOfLong shipmentItemIds;

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
     * Gets the value of the shipmentAmount property.
     * 
     */
    public float getShipmentAmount() {
        return shipmentAmount;
    }

    /**
     * Sets the value of the shipmentAmount property.
     * 
     */
    public void setShipmentAmount(float value) {
        this.shipmentAmount = value;
    }

    /**
     * Gets the value of the shipmentPaymentType property.
     * 
     */
    public int getShipmentPaymentType() {
        return shipmentPaymentType;
    }

    /**
     * Sets the value of the shipmentPaymentType property.
     * 
     */
    public void setShipmentPaymentType(int value) {
        this.shipmentPaymentType = value;
    }

    /**
     * Gets the value of the shipmentItemIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getShipmentItemIds() {
        return shipmentItemIds;
    }

    /**
     * Sets the value of the shipmentItemIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setShipmentItemIds(ArrayOfLong value) {
        this.shipmentItemIds = value;
    }

}
