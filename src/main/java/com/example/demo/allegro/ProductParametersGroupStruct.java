
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductParametersGroupStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductParametersGroupStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="productParametersGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productParametersList" type="{https://webapi.allegro.pl/service.php}ArrayOfProductparametersstruct" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductParametersGroupStruct", propOrder = {

})
public class ProductParametersGroupStruct {

    @XmlElement(required = true)
    protected String productParametersGroupName;
    protected ArrayOfProductparametersstruct productParametersList;

    /**
     * Gets the value of the productParametersGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductParametersGroupName() {
        return productParametersGroupName;
    }

    /**
     * Sets the value of the productParametersGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductParametersGroupName(String value) {
        this.productParametersGroupName = value;
    }

    /**
     * Gets the value of the productParametersList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductparametersstruct }
     *     
     */
    public ArrayOfProductparametersstruct getProductParametersList() {
        return productParametersList;
    }

    /**
     * Sets the value of the productParametersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductparametersstruct }
     *     
     */
    public void setProductParametersList(ArrayOfProductparametersstruct value) {
        this.productParametersList = value;
    }

}
