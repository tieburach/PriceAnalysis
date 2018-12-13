
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeDateValueStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeDateValueStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="fvalueRangeDateMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fvalueRangeDateMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeDateValueStruct", propOrder = {

})
public class RangeDateValueStruct {

    protected String fvalueRangeDateMin;
    protected String fvalueRangeDateMax;

    /**
     * Gets the value of the fvalueRangeDateMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFvalueRangeDateMin() {
        return fvalueRangeDateMin;
    }

    /**
     * Sets the value of the fvalueRangeDateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFvalueRangeDateMin(String value) {
        this.fvalueRangeDateMin = value;
    }

    /**
     * Gets the value of the fvalueRangeDateMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFvalueRangeDateMax() {
        return fvalueRangeDateMax;
    }

    /**
     * Sets the value of the fvalueRangeDateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFvalueRangeDateMax(String value) {
        this.fvalueRangeDateMax = value;
    }

}
