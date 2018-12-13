
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="itemsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemsFeaturedCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="itemsList" type="{https://webapi.allegro.pl/service.php}ArrayOfItemslisttype" minOccurs="0"/>
 *         &lt;element name="categoriesList" type="{https://webapi.allegro.pl/service.php}CategoriesListType" minOccurs="0"/>
 *         &lt;element name="filtersList" type="{https://webapi.allegro.pl/service.php}ArrayOfFilterslisttype" minOccurs="0"/>
 *         &lt;element name="filtersRejected" type="{https://webapi.allegro.pl/service.php}ArrayOfString" minOccurs="0"/>
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
    "itemsCount",
    "itemsFeaturedCount",
    "itemsList",
    "categoriesList",
    "filtersList",
    "filtersRejected"
})
@XmlRootElement(name = "doGetItemsListResponse")
public class DoGetItemsListResponse {

    protected int itemsCount;
    protected Integer itemsFeaturedCount;
    protected ArrayOfItemslisttype itemsList;
    protected CategoriesListType categoriesList;
    protected ArrayOfFilterslisttype filtersList;
    protected ArrayOfString filtersRejected;

    /**
     * Gets the value of the itemsCount property.
     * 
     */
    public int getItemsCount() {
        return itemsCount;
    }

    /**
     * Sets the value of the itemsCount property.
     * 
     */
    public void setItemsCount(int value) {
        this.itemsCount = value;
    }

    /**
     * Gets the value of the itemsFeaturedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemsFeaturedCount() {
        return itemsFeaturedCount;
    }

    /**
     * Sets the value of the itemsFeaturedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemsFeaturedCount(Integer value) {
        this.itemsFeaturedCount = value;
    }

    /**
     * Gets the value of the itemsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemslisttype }
     *     
     */
    public ArrayOfItemslisttype getItemsList() {
        return itemsList;
    }

    /**
     * Sets the value of the itemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemslisttype }
     *     
     */
    public void setItemsList(ArrayOfItemslisttype value) {
        this.itemsList = value;
    }

    /**
     * Gets the value of the categoriesList property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriesListType }
     *     
     */
    public CategoriesListType getCategoriesList() {
        return categoriesList;
    }

    /**
     * Sets the value of the categoriesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriesListType }
     *     
     */
    public void setCategoriesList(CategoriesListType value) {
        this.categoriesList = value;
    }

    /**
     * Gets the value of the filtersList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFilterslisttype }
     *     
     */
    public ArrayOfFilterslisttype getFiltersList() {
        return filtersList;
    }

    /**
     * Sets the value of the filtersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFilterslisttype }
     *     
     */
    public void setFiltersList(ArrayOfFilterslisttype value) {
        this.filtersList = value;
    }

    /**
     * Gets the value of the filtersRejected property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFiltersRejected() {
        return filtersRejected;
    }

    /**
     * Sets the value of the filtersRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFiltersRejected(ArrayOfString value) {
        this.filtersRejected = value;
    }

}
