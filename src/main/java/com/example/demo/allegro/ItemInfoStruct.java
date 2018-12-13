
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemInfoStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itemInfo" type="{https://webapi.allegro.pl/service.php}ItemInfo"/>
 *         &lt;element name="itemCats" type="{https://webapi.allegro.pl/service.php}ArrayOfItemcatlist" minOccurs="0"/>
 *         &lt;element name="itemImages" type="{https://webapi.allegro.pl/service.php}ArrayOfItemimagelist" minOccurs="0"/>
 *         &lt;element name="itemAttribs" type="{https://webapi.allegro.pl/service.php}ArrayOfAttribstruct" minOccurs="0"/>
 *         &lt;element name="itemPostageOptions" type="{https://webapi.allegro.pl/service.php}ArrayOfPostagestruct" minOccurs="0"/>
 *         &lt;element name="itemPaymentOptions" type="{https://webapi.allegro.pl/service.php}ItemPaymentOptions"/>
 *         &lt;element name="itemCompanyInfo" type="{https://webapi.allegro.pl/service.php}CompanyInfoStruct"/>
 *         &lt;element name="itemProductInfo" type="{https://webapi.allegro.pl/service.php}ProductStruct"/>
 *         &lt;element name="itemAfterSalesServiceConditions" type="{https://webapi.allegro.pl/service.php}AfterSalesServiceConditionsStruct" minOccurs="0"/>
 *         &lt;element name="itemAdditionalServicesGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemInfoStruct", propOrder = {

})
public class ItemInfoStruct {

    @XmlElement(required = true)
    protected ItemInfo itemInfo;
    protected ArrayOfItemcatlist itemCats;
    protected ArrayOfItemimagelist itemImages;
    protected ArrayOfAttribstruct itemAttribs;
    protected ArrayOfPostagestruct itemPostageOptions;
    @XmlElement(required = true)
    protected ItemPaymentOptions itemPaymentOptions;
    @XmlElement(required = true)
    protected CompanyInfoStruct itemCompanyInfo;
    @XmlElement(required = true)
    protected ProductStruct itemProductInfo;
    protected AfterSalesServiceConditionsStruct itemAfterSalesServiceConditions;
    protected String itemAdditionalServicesGroup;

    /**
     * Gets the value of the itemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInfo }
     *     
     */
    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    /**
     * Sets the value of the itemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInfo }
     *     
     */
    public void setItemInfo(ItemInfo value) {
        this.itemInfo = value;
    }

    /**
     * Gets the value of the itemCats property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemcatlist }
     *     
     */
    public ArrayOfItemcatlist getItemCats() {
        return itemCats;
    }

    /**
     * Sets the value of the itemCats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemcatlist }
     *     
     */
    public void setItemCats(ArrayOfItemcatlist value) {
        this.itemCats = value;
    }

    /**
     * Gets the value of the itemImages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemimagelist }
     *     
     */
    public ArrayOfItemimagelist getItemImages() {
        return itemImages;
    }

    /**
     * Sets the value of the itemImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemimagelist }
     *     
     */
    public void setItemImages(ArrayOfItemimagelist value) {
        this.itemImages = value;
    }

    /**
     * Gets the value of the itemAttribs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttribstruct }
     *     
     */
    public ArrayOfAttribstruct getItemAttribs() {
        return itemAttribs;
    }

    /**
     * Sets the value of the itemAttribs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttribstruct }
     *     
     */
    public void setItemAttribs(ArrayOfAttribstruct value) {
        this.itemAttribs = value;
    }

    /**
     * Gets the value of the itemPostageOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostagestruct }
     *     
     */
    public ArrayOfPostagestruct getItemPostageOptions() {
        return itemPostageOptions;
    }

    /**
     * Sets the value of the itemPostageOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostagestruct }
     *     
     */
    public void setItemPostageOptions(ArrayOfPostagestruct value) {
        this.itemPostageOptions = value;
    }

    /**
     * Gets the value of the itemPaymentOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPaymentOptions }
     *     
     */
    public ItemPaymentOptions getItemPaymentOptions() {
        return itemPaymentOptions;
    }

    /**
     * Sets the value of the itemPaymentOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPaymentOptions }
     *     
     */
    public void setItemPaymentOptions(ItemPaymentOptions value) {
        this.itemPaymentOptions = value;
    }

    /**
     * Gets the value of the itemCompanyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInfoStruct }
     *     
     */
    public CompanyInfoStruct getItemCompanyInfo() {
        return itemCompanyInfo;
    }

    /**
     * Sets the value of the itemCompanyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInfoStruct }
     *     
     */
    public void setItemCompanyInfo(CompanyInfoStruct value) {
        this.itemCompanyInfo = value;
    }

    /**
     * Gets the value of the itemProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStruct }
     *     
     */
    public ProductStruct getItemProductInfo() {
        return itemProductInfo;
    }

    /**
     * Sets the value of the itemProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStruct }
     *     
     */
    public void setItemProductInfo(ProductStruct value) {
        this.itemProductInfo = value;
    }

    /**
     * Gets the value of the itemAfterSalesServiceConditions property.
     * 
     * @return
     *     possible object is
     *     {@link AfterSalesServiceConditionsStruct }
     *     
     */
    public AfterSalesServiceConditionsStruct getItemAfterSalesServiceConditions() {
        return itemAfterSalesServiceConditions;
    }

    /**
     * Sets the value of the itemAfterSalesServiceConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfterSalesServiceConditionsStruct }
     *     
     */
    public void setItemAfterSalesServiceConditions(AfterSalesServiceConditionsStruct value) {
        this.itemAfterSalesServiceConditions = value;
    }

    /**
     * Gets the value of the itemAdditionalServicesGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemAdditionalServicesGroup() {
        return itemAdditionalServicesGroup;
    }

    /**
     * Sets the value of the itemAdditionalServicesGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemAdditionalServicesGroup(String value) {
        this.itemAdditionalServicesGroup = value;
    }

}
