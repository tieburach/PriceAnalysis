
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
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fieldsToModify" type="{https://webapi.allegro.pl/service.php}ArrayOfFieldsvalue" minOccurs="0"/>
 *         &lt;element name="fieldsToRemove" type="{https://webapi.allegro.pl/service.php}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="previewOnly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "sessionId",
    "itemId",
    "fieldsToModify",
    "fieldsToRemove",
    "previewOnly",
    "variants",
    "tags",
    "afterSalesServiceConditions",
    "additionalServicesGroup"
})
@XmlRootElement(name = "DoChangeItemFieldsRequest")
public class DoChangeItemFieldsRequest {

    @XmlElement(required = true)
    protected String sessionId;
    protected long itemId;
    protected ArrayOfFieldsvalue fieldsToModify;
    protected ArrayOfInt fieldsToRemove;
    protected Integer previewOnly;
    protected ArrayOfVariantstruct variants;
    protected ArrayOfTagnamestruct tags;
    protected AfterSalesServiceConditionsStruct afterSalesServiceConditions;
    protected String additionalServicesGroup;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     */
    public long getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     */
    public void setItemId(long value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the fieldsToModify property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldsvalue }
     *     
     */
    public ArrayOfFieldsvalue getFieldsToModify() {
        return fieldsToModify;
    }

    /**
     * Sets the value of the fieldsToModify property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldsvalue }
     *     
     */
    public void setFieldsToModify(ArrayOfFieldsvalue value) {
        this.fieldsToModify = value;
    }

    /**
     * Gets the value of the fieldsToRemove property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getFieldsToRemove() {
        return fieldsToRemove;
    }

    /**
     * Sets the value of the fieldsToRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setFieldsToRemove(ArrayOfInt value) {
        this.fieldsToRemove = value;
    }

    /**
     * Gets the value of the previewOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviewOnly() {
        return previewOnly;
    }

    /**
     * Sets the value of the previewOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviewOnly(Integer value) {
        this.previewOnly = value;
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
