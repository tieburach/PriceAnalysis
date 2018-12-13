
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
 *         &lt;element name="relatedItems" type="{https://webapi.allegro.pl/service.php}RelatedItemsStruct"/>
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
    "relatedItems"
})
@XmlRootElement(name = "doGetRelatedItemsResponse")
public class DoGetRelatedItemsResponse {

    @XmlElement(required = true)
    protected RelatedItemsStruct relatedItems;

    /**
     * Gets the value of the relatedItems property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedItemsStruct }
     *     
     */
    public RelatedItemsStruct getRelatedItems() {
        return relatedItems;
    }

    /**
     * Sets the value of the relatedItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedItemsStruct }
     *     
     */
    public void setRelatedItems(RelatedItemsStruct value) {
        this.relatedItems = value;
    }

}
