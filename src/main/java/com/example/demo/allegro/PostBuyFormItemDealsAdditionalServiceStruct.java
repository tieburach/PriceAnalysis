
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostBuyFormItemDealsAdditionalServiceStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostBuyFormItemDealsAdditionalServiceStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="additionalServiceDefinitionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additionalServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additionalServiceQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="additionalServicePrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostBuyFormItemDealsAdditionalServiceStruct", propOrder = {

})
public class PostBuyFormItemDealsAdditionalServiceStruct {

    @XmlElement(required = true)
    protected String additionalServiceDefinitionId;
    @XmlElement(required = true)
    protected String additionalServiceName;
    protected int additionalServiceQuantity;
    protected float additionalServicePrice;

    /**
     * Gets the value of the additionalServiceDefinitionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServiceDefinitionId() {
        return additionalServiceDefinitionId;
    }

    /**
     * Sets the value of the additionalServiceDefinitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServiceDefinitionId(String value) {
        this.additionalServiceDefinitionId = value;
    }

    /**
     * Gets the value of the additionalServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServiceName() {
        return additionalServiceName;
    }

    /**
     * Sets the value of the additionalServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServiceName(String value) {
        this.additionalServiceName = value;
    }

    /**
     * Gets the value of the additionalServiceQuantity property.
     * 
     */
    public int getAdditionalServiceQuantity() {
        return additionalServiceQuantity;
    }

    /**
     * Sets the value of the additionalServiceQuantity property.
     * 
     */
    public void setAdditionalServiceQuantity(int value) {
        this.additionalServiceQuantity = value;
    }

    /**
     * Gets the value of the additionalServicePrice property.
     * 
     */
    public float getAdditionalServicePrice() {
        return additionalServicePrice;
    }

    /**
     * Sets the value of the additionalServicePrice property.
     * 
     */
    public void setAdditionalServicePrice(float value) {
        this.additionalServicePrice = value;
    }

}
