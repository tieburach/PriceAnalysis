
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
 *         &lt;element name="sessionHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fields" type="{https://webapi.allegro.pl/service.php}ArrayOfFieldsvalue" minOccurs="0"/>
 *         &lt;element name="itemTemplateId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="itemTemplateCreate" type="{https://webapi.allegro.pl/service.php}ItemTemplateCreateStruct" minOccurs="0"/>
 *         &lt;element name="variants" type="{https://webapi.allegro.pl/service.php}ArrayOfVariantstruct" minOccurs="0"/>
 *         &lt;element name="tags" type="{https://webapi.allegro.pl/service.php}ArrayOfTagnamestruct" minOccurs="0"/>
 *         &lt;element name="afterSalesServiceConditions" type="{https://webapi.allegro.pl/service.php}AfterSalesServiceConditionsStruct" minOccurs="0"/>
 *         &lt;element name="additionalServicesGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionHandle",
    "fields",
    "itemTemplateId",
    "localId",
    "itemTemplateCreate",
    "variants",
    "tags",
    "afterSalesServiceConditions",
    "additionalServicesGroup"
})
@XmlRootElement(name = "DoNewAuctionExtRequest")
public class DoNewAuctionExtRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected ArrayOfFieldsvalue fields;
    protected Integer itemTemplateId;
    protected Integer localId;
    protected ItemTemplateCreateStruct itemTemplateCreate;
    protected ArrayOfVariantstruct variants;
    protected ArrayOfTagnamestruct tags;
    protected AfterSalesServiceConditionsStruct afterSalesServiceConditions;
    protected String additionalServicesGroup;

    /**
     * Gets the value of the sessionHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionHandle() {
        return sessionHandle;
    }

    /**
     * Sets the value of the sessionHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionHandle(String value) {
        this.sessionHandle = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldsvalue }
     *     
     */
    public ArrayOfFieldsvalue getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldsvalue }
     *     
     */
    public void setFields(ArrayOfFieldsvalue value) {
        this.fields = value;
    }

    /**
     * Gets the value of the itemTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemTemplateId() {
        return itemTemplateId;
    }

    /**
     * Sets the value of the itemTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemTemplateId(Integer value) {
        this.itemTemplateId = value;
    }

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalId(Integer value) {
        this.localId = value;
    }

    /**
     * Gets the value of the itemTemplateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link ItemTemplateCreateStruct }
     *     
     */
    public ItemTemplateCreateStruct getItemTemplateCreate() {
        return itemTemplateCreate;
    }

    /**
     * Sets the value of the itemTemplateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTemplateCreateStruct }
     *     
     */
    public void setItemTemplateCreate(ItemTemplateCreateStruct value) {
        this.itemTemplateCreate = value;
    }

    /**
     * Gets the value of the variants property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVariantstruct }
     *     
     */
    public ArrayOfVariantstruct getVariants() {
        return variants;
    }

    /**
     * Sets the value of the variants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVariantstruct }
     *     
     */
    public void setVariants(ArrayOfVariantstruct value) {
        this.variants = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTagnamestruct }
     *     
     */
    public ArrayOfTagnamestruct getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTagnamestruct }
     *     
     */
    public void setTags(ArrayOfTagnamestruct value) {
        this.tags = value;
    }

    /**
     * Gets the value of the afterSalesServiceConditions property.
     * 
     * @return
     *     possible object is
     *     {@link AfterSalesServiceConditionsStruct }
     *     
     */
    public AfterSalesServiceConditionsStruct getAfterSalesServiceConditions() {
        return afterSalesServiceConditions;
    }

    /**
     * Sets the value of the afterSalesServiceConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfterSalesServiceConditionsStruct }
     *     
     */
    public void setAfterSalesServiceConditions(AfterSalesServiceConditionsStruct value) {
        this.afterSalesServiceConditions = value;
    }

    /**
     * Gets the value of the additionalServicesGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServicesGroup() {
        return additionalServicesGroup;
    }

    /**
     * Sets the value of the additionalServicesGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServicesGroup(String value) {
        this.additionalServicesGroup = value;
    }

}
