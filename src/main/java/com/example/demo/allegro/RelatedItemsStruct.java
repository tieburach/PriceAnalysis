
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedItemsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedItemsStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="relatedItemsInfo" type="{https://webapi.allegro.pl/service.php}ArrayOfRelateditemstruct" minOccurs="0"/>
 *         &lt;element name="relatedItemsAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedItemsStruct", propOrder = {

})
public class RelatedItemsStruct {

    protected ArrayOfRelateditemstruct relatedItemsInfo;
    protected float relatedItemsAmount;

    /**
     * Gets the value of the relatedItemsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRelateditemstruct }
     *     
     */
    public ArrayOfRelateditemstruct getRelatedItemsInfo() {
        return relatedItemsInfo;
    }

    /**
     * Sets the value of the relatedItemsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRelateditemstruct }
     *     
     */
    public void setRelatedItemsInfo(ArrayOfRelateditemstruct value) {
        this.relatedItemsInfo = value;
    }

    /**
     * Gets the value of the relatedItemsAmount property.
     * 
     */
    public float getRelatedItemsAmount() {
        return relatedItemsAmount;
    }

    /**
     * Sets the value of the relatedItemsAmount property.
     * 
     */
    public void setRelatedItemsAmount(float value) {
        this.relatedItemsAmount = value;
    }

}
