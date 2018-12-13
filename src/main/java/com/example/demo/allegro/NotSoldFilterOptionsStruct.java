
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotSoldFilterOptionsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotSoldFilterOptionsStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="filterFormat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="filterFromEnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="filterAutoListing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="filterPrice" type="{https://webapi.allegro.pl/service.php}FilterPriceStruct" minOccurs="0"/>
 *         &lt;element name="filterDurationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotSoldFilterOptionsStruct", propOrder = {

})
public class NotSoldFilterOptionsStruct {

    protected Integer filterFormat;
    protected Integer filterFromEnd;
    protected Integer filterAutoListing;
    protected FilterPriceStruct filterPrice;
    protected Integer filterDurationType;

    /**
     * Gets the value of the filterFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterFormat() {
        return filterFormat;
    }

    /**
     * Sets the value of the filterFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterFormat(Integer value) {
        this.filterFormat = value;
    }

    /**
     * Gets the value of the filterFromEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterFromEnd() {
        return filterFromEnd;
    }

    /**
     * Sets the value of the filterFromEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterFromEnd(Integer value) {
        this.filterFromEnd = value;
    }

    /**
     * Gets the value of the filterAutoListing property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterAutoListing() {
        return filterAutoListing;
    }

    /**
     * Sets the value of the filterAutoListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterAutoListing(Integer value) {
        this.filterAutoListing = value;
    }

    /**
     * Gets the value of the filterPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FilterPriceStruct }
     *     
     */
    public FilterPriceStruct getFilterPrice() {
        return filterPrice;
    }

    /**
     * Sets the value of the filterPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterPriceStruct }
     *     
     */
    public void setFilterPrice(FilterPriceStruct value) {
        this.filterPrice = value;
    }

    /**
     * Gets the value of the filterDurationType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterDurationType() {
        return filterDurationType;
    }

    /**
     * Sets the value of the filterDurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterDurationType(Integer value) {
        this.filterDurationType = value;
    }

}
