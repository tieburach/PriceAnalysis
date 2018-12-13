
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellFilterOptionsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellFilterOptionsStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="filterFormat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="filterBids" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="filterToEnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="filterFromStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "SellFilterOptionsStruct", propOrder = {

})
public class SellFilterOptionsStruct {

    protected Integer filterFormat;
    protected Integer filterBids;
    protected Integer filterToEnd;
    protected Integer filterFromStart;
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
     * Gets the value of the filterBids property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterBids() {
        return filterBids;
    }

    /**
     * Sets the value of the filterBids property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterBids(Integer value) {
        this.filterBids = value;
    }

    /**
     * Gets the value of the filterToEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterToEnd() {
        return filterToEnd;
    }

    /**
     * Sets the value of the filterToEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterToEnd(Integer value) {
        this.filterToEnd = value;
    }

    /**
     * Gets the value of the filterFromStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFilterFromStart() {
        return filterFromStart;
    }

    /**
     * Sets the value of the filterFromStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFilterFromStart(Integer value) {
        this.filterFromStart = value;
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
