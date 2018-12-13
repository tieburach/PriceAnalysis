
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rangeValueMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rangeValueMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeValueType", propOrder = {

})
public class RangeValueType {

    protected String rangeValueMin;
    protected String rangeValueMax;

    /**
     * Gets the value of the rangeValueMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeValueMin() {
        return rangeValueMin;
    }

    /**
     * Sets the value of the rangeValueMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeValueMin(String value) {
        this.rangeValueMin = value;
    }

    /**
     * Gets the value of the rangeValueMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeValueMax() {
        return rangeValueMax;
    }

    /**
     * Sets the value of the rangeValueMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeValueMax(String value) {
        this.rangeValueMax = value;
    }

}
