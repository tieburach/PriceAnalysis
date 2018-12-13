
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellFormFieldsForCategoryStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellFormFieldsForCategoryStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sellFormFieldsList" type="{https://webapi.allegro.pl/service.php}ArrayOfSellformtype" minOccurs="0"/>
 *         &lt;element name="sellFormFieldsVersionKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sellFormFieldsComponentValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellFormFieldsForCategoryStruct", propOrder = {

})
public class SellFormFieldsForCategoryStruct {

    protected ArrayOfSellformtype sellFormFieldsList;
    protected long sellFormFieldsVersionKey;
    @XmlElement(required = true)
    protected String sellFormFieldsComponentValue;

    /**
     * Gets the value of the sellFormFieldsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSellformtype }
     *     
     */
    public ArrayOfSellformtype getSellFormFieldsList() {
        return sellFormFieldsList;
    }

    /**
     * Sets the value of the sellFormFieldsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSellformtype }
     *     
     */
    public void setSellFormFieldsList(ArrayOfSellformtype value) {
        this.sellFormFieldsList = value;
    }

    /**
     * Gets the value of the sellFormFieldsVersionKey property.
     * 
     */
    public long getSellFormFieldsVersionKey() {
        return sellFormFieldsVersionKey;
    }

    /**
     * Sets the value of the sellFormFieldsVersionKey property.
     * 
     */
    public void setSellFormFieldsVersionKey(long value) {
        this.sellFormFieldsVersionKey = value;
    }

    /**
     * Gets the value of the sellFormFieldsComponentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellFormFieldsComponentValue() {
        return sellFormFieldsComponentValue;
    }

    /**
     * Sets the value of the sellFormFieldsComponentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellFormFieldsComponentValue(String value) {
        this.sellFormFieldsComponentValue = value;
    }

}
