
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="relatedItemsShipmentData" type="{https://webapi.allegro.pl/service.php}RelatedItemsShipmentDataStruct"/>
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
    "relatedItemsShipmentData"
})
@XmlRootElement(name = "doGetShipmentDataForRelatedItemsResponse")
public class DoGetShipmentDataForRelatedItemsResponse {

    @XmlElement(required = true)
    protected RelatedItemsShipmentDataStruct relatedItemsShipmentData;

    /**
     * Gets the value of the relatedItemsShipmentData property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedItemsShipmentDataStruct }
     *     
     */
    public RelatedItemsShipmentDataStruct getRelatedItemsShipmentData() {
        return relatedItemsShipmentData;
    }

    /**
     * Sets the value of the relatedItemsShipmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedItemsShipmentDataStruct }
     *     
     */
    public void setRelatedItemsShipmentData(RelatedItemsShipmentDataStruct value) {
        this.relatedItemsShipmentData = value;
    }

}
