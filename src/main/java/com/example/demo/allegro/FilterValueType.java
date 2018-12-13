
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="filterValueId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterValueName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterValueCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterValueType", propOrder = {

})
public class FilterValueType {

    @XmlElement(required = true)
    protected String filterValueId;
    @XmlElement(required = true)
    protected String filterValueName;
    protected Integer filterValueCount;

    /**
     * Gets the value of the filterValueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterValueId() {
        return filterValueId;
    }

    /**
     * Sets the value of the filterValueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterValueId(String value) {
        this.filterValueId = value;
    }

    /**
     * Gets the value of the filterValueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterValueName() {
        return filterValueName;
    }

    /**
     * Sets the value of the filterValueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterValueName(String value) {
        this.filterValueName = value;
    }

    /**
     * Gets the value of the filterValueCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterValueCount() {
        return filterValueCount;
    }

    /**
     * Sets the value of the filterValueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterValueCount(Integer value) {
        this.filterValueCount = value;
    }

}
