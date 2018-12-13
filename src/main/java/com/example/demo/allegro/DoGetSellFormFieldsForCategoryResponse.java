
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
 *         &lt;element name="sellFormFieldsForCategory" type="{https://webapi.allegro.pl/service.php}SellFormFieldsForCategoryStruct"/>
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
    "sellFormFieldsForCategory"
})
@XmlRootElement(name = "doGetSellFormFieldsForCategoryResponse")
public class DoGetSellFormFieldsForCategoryResponse {

    @XmlElement(required = true)
    protected SellFormFieldsForCategoryStruct sellFormFieldsForCategory;

    /**
     * Gets the value of the sellFormFieldsForCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SellFormFieldsForCategoryStruct }
     *     
     */
    public SellFormFieldsForCategoryStruct getSellFormFieldsForCategory() {
        return sellFormFieldsForCategory;
    }

    /**
     * Sets the value of the sellFormFieldsForCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellFormFieldsForCategoryStruct }
     *     
     */
    public void setSellFormFieldsForCategory(SellFormFieldsForCategoryStruct value) {
        this.sellFormFieldsForCategory = value;
    }

}
