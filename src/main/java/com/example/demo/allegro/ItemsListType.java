
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ItemsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leftCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bidsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="biddersCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timeToEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conditionInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promotionInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="additionalInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellerInfo" type="{https://webapi.allegro.pl/service.php}UserInfoType" minOccurs="0"/>
 *         &lt;element name="priceInfo" type="{https://webapi.allegro.pl/service.php}ArrayOfPriceinfotype" minOccurs="0"/>
 *         &lt;element name="photosInfo" type="{https://webapi.allegro.pl/service.php}ArrayOfPhotoinfotype" minOccurs="0"/>
 *         &lt;element name="parametersInfo" type="{https://webapi.allegro.pl/service.php}ArrayOfParameterinfotype" minOccurs="0"/>
 *         &lt;element name="advertInfo" type="{https://webapi.allegro.pl/service.php}AdvertInfoType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemsListType", propOrder = {

})
public class ItemsListType {

    protected long itemId;
    @XmlElement(required = true)
    protected String itemTitle;
    protected int leftCount;
    protected int bidsCount;
    protected int biddersCount;
    @XmlElement(required = true)
    protected String quantityType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endingTime;
    @XmlElement(required = true)
    protected String timeToEnd;
    protected int categoryId;
    @XmlElement(required = true)
    protected String conditionInfo;
    protected int promotionInfo;
    protected int additionalInfo;
    protected UserInfoType sellerInfo;
    protected ArrayOfPriceinfotype priceInfo;
    protected ArrayOfPhotoinfotype photosInfo;
    protected ArrayOfParameterinfotype parametersInfo;
    protected AdvertInfoType advertInfo;

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
     * Gets the value of the itemTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * Sets the value of the itemTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTitle(String value) {
        this.itemTitle = value;
    }

    /**
     * Gets the value of the leftCount property.
     * 
     */
    public int getLeftCount() {
        return leftCount;
    }

    /**
     * Sets the value of the leftCount property.
     * 
     */
    public void setLeftCount(int value) {
        this.leftCount = value;
    }

    /**
     * Gets the value of the bidsCount property.
     * 
     */
    public int getBidsCount() {
        return bidsCount;
    }

    /**
     * Sets the value of the bidsCount property.
     * 
     */
    public void setBidsCount(int value) {
        this.bidsCount = value;
    }

    /**
     * Gets the value of the biddersCount property.
     * 
     */
    public int getBiddersCount() {
        return biddersCount;
    }

    /**
     * Sets the value of the biddersCount property.
     * 
     */
    public void setBiddersCount(int value) {
        this.biddersCount = value;
    }

    /**
     * Gets the value of the quantityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityType() {
        return quantityType;
    }

    /**
     * Sets the value of the quantityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityType(String value) {
        this.quantityType = value;
    }

    /**
     * Gets the value of the endingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndingTime() {
        return endingTime;
    }

    /**
     * Sets the value of the endingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndingTime(XMLGregorianCalendar value) {
        this.endingTime = value;
    }

    /**
     * Gets the value of the timeToEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeToEnd() {
        return timeToEnd;
    }

    /**
     * Sets the value of the timeToEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeToEnd(String value) {
        this.timeToEnd = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     */
    public void setCategoryId(int value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the conditionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionInfo() {
        return conditionInfo;
    }

    /**
     * Sets the value of the conditionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionInfo(String value) {
        this.conditionInfo = value;
    }

    /**
     * Gets the value of the promotionInfo property.
     * 
     */
    public int getPromotionInfo() {
        return promotionInfo;
    }

    /**
     * Sets the value of the promotionInfo property.
     * 
     */
    public void setPromotionInfo(int value) {
        this.promotionInfo = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     */
    public int getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     */
    public void setAdditionalInfo(int value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the sellerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoType }
     *     
     */
    public UserInfoType getSellerInfo() {
        return sellerInfo;
    }

    /**
     * Sets the value of the sellerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoType }
     *     
     */
    public void setSellerInfo(UserInfoType value) {
        this.sellerInfo = value;
    }

    /**
     * Gets the value of the priceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceinfotype }
     *     
     */
    public ArrayOfPriceinfotype getPriceInfo() {
        return priceInfo;
    }

    /**
     * Sets the value of the priceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceinfotype }
     *     
     */
    public void setPriceInfo(ArrayOfPriceinfotype value) {
        this.priceInfo = value;
    }

    /**
     * Gets the value of the photosInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhotoinfotype }
     *     
     */
    public ArrayOfPhotoinfotype getPhotosInfo() {
        return photosInfo;
    }

    /**
     * Sets the value of the photosInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhotoinfotype }
     *     
     */
    public void setPhotosInfo(ArrayOfPhotoinfotype value) {
        this.photosInfo = value;
    }

    /**
     * Gets the value of the parametersInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParameterinfotype }
     *     
     */
    public ArrayOfParameterinfotype getParametersInfo() {
        return parametersInfo;
    }

    /**
     * Sets the value of the parametersInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParameterinfotype }
     *     
     */
    public void setParametersInfo(ArrayOfParameterinfotype value) {
        this.parametersInfo = value;
    }

    /**
     * Gets the value of the advertInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertInfoType }
     *     
     */
    public AdvertInfoType getAdvertInfo() {
        return advertInfo;
    }

    /**
     * Sets the value of the advertInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertInfoType }
     *     
     */
    public void setAdvertInfo(AdvertInfoType value) {
        this.advertInfo = value;
    }

}
