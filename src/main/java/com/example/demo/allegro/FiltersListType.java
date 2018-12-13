
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FiltersListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiltersListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="filterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterControlType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterDataType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterIsRange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filterArraySize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="filterValues" type="{https://webapi.allegro.pl/service.php}ArrayOfFiltervaluetype" minOccurs="0"/>
 *         &lt;element name="filterRelations" type="{https://webapi.allegro.pl/service.php}FilterRelationType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiltersListType", propOrder = {

})
public class FiltersListType {

    @XmlElement(required = true)
    protected String filterId;
    @XmlElement(required = true)
    protected String filterName;
    @XmlElement(required = true)
    protected String filterType;
    @XmlElement(required = true)
    protected String filterControlType;
    @XmlElement(required = true)
    protected String filterDataType;
    protected boolean filterIsRange;
    protected Integer filterArraySize;
    protected ArrayOfFiltervaluetype filterValues;
    protected FilterRelationType filterRelations;

    /**
     * Gets the value of the filterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterId() {
        return filterId;
    }

    /**
     * Sets the value of the filterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterId(String value) {
        this.filterId = value;
    }

    /**
     * Gets the value of the filterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * Sets the value of the filterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterName(String value) {
        this.filterName = value;
    }

    /**
     * Gets the value of the filterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterType() {
        return filterType;
    }

    /**
     * Sets the value of the filterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterType(String value) {
        this.filterType = value;
    }

    /**
     * Gets the value of the filterControlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterControlType() {
        return filterControlType;
    }

    /**
     * Sets the value of the filterControlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterControlType(String value) {
        this.filterControlType = value;
    }

    /**
     * Gets the value of the filterDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterDataType() {
        return filterDataType;
    }

    /**
     * Sets the value of the filterDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterDataType(String value) {
        this.filterDataType = value;
    }

    /**
     * Gets the value of the filterIsRange property.
     * 
     */
    public boolean isFilterIsRange() {
        return filterIsRange;
    }

    /**
     * Sets the value of the filterIsRange property.
     * 
     */
    public void setFilterIsRange(boolean value) {
        this.filterIsRange = value;
    }

    /**
     * Gets the value of the filterArraySize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterArraySize() {
        return filterArraySize;
    }

    /**
     * Sets the value of the filterArraySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterArraySize(Integer value) {
        this.filterArraySize = value;
    }

    /**
     * Gets the value of the filterValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFiltervaluetype }
     *     
     */
    public ArrayOfFiltervaluetype getFilterValues() {
        return filterValues;
    }

    /**
     * Sets the value of the filterValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFiltervaluetype }
     *     
     */
    public void setFilterValues(ArrayOfFiltervaluetype value) {
        this.filterValues = value;
    }

    /**
     * Gets the value of the filterRelations property.
     * 
     * @return
     *     possible object is
     *     {@link FilterRelationType }
     *     
     */
    public FilterRelationType getFilterRelations() {
        return filterRelations;
    }

    /**
     * Sets the value of the filterRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterRelationType }
     *     
     */
    public void setFilterRelations(FilterRelationType value) {
        this.filterRelations = value;
    }

}
