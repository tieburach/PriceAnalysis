
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
 *         &lt;element name="itemsIdArray" type="{https://webapi.allegro.pl/service.php}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="getDesc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getImageUrl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getAttribs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getPostageOptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getCompanyInfo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getProductInfo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getAfterSalesServiceConditions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getEan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getAdditionalServicesGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "itemsIdArray",
    "getDesc",
    "getImageUrl",
    "getAttribs",
    "getPostageOptions",
    "getCompanyInfo",
    "getProductInfo",
    "getAfterSalesServiceConditions",
    "getEan",
    "getAdditionalServicesGroup"
})
@XmlRootElement(name = "DoGetItemsInfoRequest")
public class DoGetItemsInfoRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected ArrayOfLong itemsIdArray;
    protected Integer getDesc;
    protected Integer getImageUrl;
    protected Integer getAttribs;
    protected Integer getPostageOptions;
    protected Integer getCompanyInfo;
    protected Integer getProductInfo;
    protected Integer getAfterSalesServiceConditions;
    protected Integer getEan;
    protected Integer getAdditionalServicesGroup;

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
     * Gets the value of the itemsIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getItemsIdArray() {
        return itemsIdArray;
    }

    /**
     * Sets the value of the itemsIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setItemsIdArray(ArrayOfLong value) {
        this.itemsIdArray = value;
    }

    /**
     * Gets the value of the getDesc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetDesc() {
        return getDesc;
    }

    /**
     * Sets the value of the getDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetDesc(Integer value) {
        this.getDesc = value;
    }

    /**
     * Gets the value of the getImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetImageUrl() {
        return getImageUrl;
    }

    /**
     * Sets the value of the getImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetImageUrl(Integer value) {
        this.getImageUrl = value;
    }

    /**
     * Gets the value of the getAttribs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetAttribs() {
        return getAttribs;
    }

    /**
     * Sets the value of the getAttribs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetAttribs(Integer value) {
        this.getAttribs = value;
    }

    /**
     * Gets the value of the getPostageOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetPostageOptions() {
        return getPostageOptions;
    }

    /**
     * Sets the value of the getPostageOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetPostageOptions(Integer value) {
        this.getPostageOptions = value;
    }

    /**
     * Gets the value of the getCompanyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetCompanyInfo() {
        return getCompanyInfo;
    }

    /**
     * Sets the value of the getCompanyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetCompanyInfo(Integer value) {
        this.getCompanyInfo = value;
    }

    /**
     * Gets the value of the getProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetProductInfo() {
        return getProductInfo;
    }

    /**
     * Sets the value of the getProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetProductInfo(Integer value) {
        this.getProductInfo = value;
    }

    /**
     * Gets the value of the getAfterSalesServiceConditions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetAfterSalesServiceConditions() {
        return getAfterSalesServiceConditions;
    }

    /**
     * Sets the value of the getAfterSalesServiceConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetAfterSalesServiceConditions(Integer value) {
        this.getAfterSalesServiceConditions = value;
    }

    /**
     * Gets the value of the getEan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetEan() {
        return getEan;
    }

    /**
     * Sets the value of the getEan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetEan(Integer value) {
        this.getEan = value;
    }

    /**
     * Gets the value of the getAdditionalServicesGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetAdditionalServicesGroup() {
        return getAdditionalServicesGroup;
    }

    /**
     * Sets the value of the getAdditionalServicesGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetAdditionalServicesGroup(Integer value) {
        this.getAdditionalServicesGroup = value;
    }

}
