
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productImagesList" type="{https://webapi.allegro.pl/service.php}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="productParametersGroupList" type="{https://webapi.allegro.pl/service.php}ArrayOfProductparametersgroupstruct" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductStruct", propOrder = {

})
public class ProductStruct {

    protected long productId;
    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected String productDescription;
    protected ArrayOfString productImagesList;
    protected ArrayOfProductparametersgroupstruct productParametersGroupList;

    /**
     * Gets the value of the productId property.
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productImagesList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getProductImagesList() {
        return productImagesList;
    }

    /**
     * Sets the value of the productImagesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setProductImagesList(ArrayOfString value) {
        this.productImagesList = value;
    }

    /**
     * Gets the value of the productParametersGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductparametersgroupstruct }
     *     
     */
    public ArrayOfProductparametersgroupstruct getProductParametersGroupList() {
        return productParametersGroupList;
    }

    /**
     * Sets the value of the productParametersGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductparametersgroupstruct }
     *     
     */
    public void setProductParametersGroupList(ArrayOfProductparametersgroupstruct value) {
        this.productParametersGroupList = value;
    }

}
