
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="webapiKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filterOptions" type="{https://webapi.allegro.pl/service.php}ArrayOfFilteroptionstype" minOccurs="0"/>
 *         &lt;element name="sortOptions" type="{https://webapi.allegro.pl/service.php}SortOptionsType" minOccurs="0"/>
 *         &lt;element name="resultSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resultOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resultScope" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "webapiKey",
    "countryId",
    "filterOptions",
    "sortOptions",
    "resultSize",
    "resultOffset",
    "resultScope"
})
@XmlRootElement(name = "DoGetItemsListRequest")
public class DoGetItemsListRequest {

    @XmlElement(required = true)
    protected String webapiKey;
    protected int countryId;
    protected ArrayOfFilteroptionstype filterOptions;
    protected SortOptionsType sortOptions;
    protected Integer resultSize;
    protected Integer resultOffset;
    protected Integer resultScope;

    /**
     * Gets the value of the webapiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebapiKey() {
        return webapiKey;
    }

    /**
     * Sets the value of the webapiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebapiKey(String value) {
        this.webapiKey = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     */
    public int getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    public void setCountryId(int value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the filterOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFilteroptionstype }
     *     
     */
    public ArrayOfFilteroptionstype getFilterOptions() {
        return filterOptions;
    }

    /**
     * Sets the value of the filterOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFilteroptionstype }
     *     
     */
    public void setFilterOptions(ArrayOfFilteroptionstype value) {
        this.filterOptions = value;
    }

    /**
     * Gets the value of the sortOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SortOptionsType }
     *     
     */
    public SortOptionsType getSortOptions() {
        return sortOptions;
    }

    /**
     * Sets the value of the sortOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOptionsType }
     *     
     */
    public void setSortOptions(SortOptionsType value) {
        this.sortOptions = value;
    }

    /**
     * Gets the value of the resultSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultSize() {
        return resultSize;
    }

    /**
     * Sets the value of the resultSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultSize(Integer value) {
        this.resultSize = value;
    }

    /**
     * Gets the value of the resultOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultOffset() {
        return resultOffset;
    }

    /**
     * Sets the value of the resultOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultOffset(Integer value) {
        this.resultOffset = value;
    }

    /**
     * Gets the value of the resultScope property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultScope() {
        return resultScope;
    }

    /**
     * Sets the value of the resultScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultScope(Integer value) {
        this.resultScope = value;
    }

}
