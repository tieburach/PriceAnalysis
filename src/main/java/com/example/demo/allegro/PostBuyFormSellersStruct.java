
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostBuyFormSellersStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostBuyFormSellersStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postBuyFormSellerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postBuyFormSellerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormItems" type="{https://webapi.allegro.pl/service.php}ArrayOfPostbuyformitemstruct" minOccurs="0"/>
 *         &lt;element name="postBuyFormShipmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postBuyFormPostageAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="postBuyFormMsgToSeller" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="postBuyFormSurchargesList" type="{https://webapi.allegro.pl/service.php}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="postBuyFormShipmentTracking" type="{https://webapi.allegro.pl/service.php}ArrayOfPostbuyformshipmenttrackingstruct" minOccurs="0"/>
 *         &lt;element name="postBuyFormGdAddress" type="{https://webapi.allegro.pl/service.php}PostBuyFormAddressStruct"/>
 *         &lt;element name="postBuyFormGdAdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormSentBySeller" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostBuyFormSellersStruct", propOrder = {

})
public class PostBuyFormSellersStruct {

    protected int postBuyFormSellerId;
    @XmlElement(required = true)
    protected String postBuyFormSellerName;
    protected ArrayOfPostbuyformitemstruct postBuyFormItems;
    protected int postBuyFormShipmentId;
    protected float postBuyFormPostageAmount;
    @XmlElement(required = true)
    protected String postBuyFormMsgToSeller;
    protected float postBuyFormAmount;
    protected ArrayOfLong postBuyFormSurchargesList;
    protected ArrayOfPostbuyformshipmenttrackingstruct postBuyFormShipmentTracking;
    @XmlElement(required = true)
    protected PostBuyFormAddressStruct postBuyFormGdAddress;
    @XmlElement(required = true)
    protected String postBuyFormGdAdditionalInfo;
    protected int postBuyFormSentBySeller;

    /**
     * Gets the value of the postBuyFormSellerId property.
     * 
     */
    public int getPostBuyFormSellerId() {
        return postBuyFormSellerId;
    }

    /**
     * Sets the value of the postBuyFormSellerId property.
     * 
     */
    public void setPostBuyFormSellerId(int value) {
        this.postBuyFormSellerId = value;
    }

    /**
     * Gets the value of the postBuyFormSellerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormSellerName() {
        return postBuyFormSellerName;
    }

    /**
     * Sets the value of the postBuyFormSellerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormSellerName(String value) {
        this.postBuyFormSellerName = value;
    }

    /**
     * Gets the value of the postBuyFormItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostbuyformitemstruct }
     *     
     */
    public ArrayOfPostbuyformitemstruct getPostBuyFormItems() {
        return postBuyFormItems;
    }

    /**
     * Sets the value of the postBuyFormItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostbuyformitemstruct }
     *     
     */
    public void setPostBuyFormItems(ArrayOfPostbuyformitemstruct value) {
        this.postBuyFormItems = value;
    }

    /**
     * Gets the value of the postBuyFormShipmentId property.
     * 
     */
    public int getPostBuyFormShipmentId() {
        return postBuyFormShipmentId;
    }

    /**
     * Sets the value of the postBuyFormShipmentId property.
     * 
     */
    public void setPostBuyFormShipmentId(int value) {
        this.postBuyFormShipmentId = value;
    }

    /**
     * Gets the value of the postBuyFormPostageAmount property.
     * 
     */
    public float getPostBuyFormPostageAmount() {
        return postBuyFormPostageAmount;
    }

    /**
     * Sets the value of the postBuyFormPostageAmount property.
     * 
     */
    public void setPostBuyFormPostageAmount(float value) {
        this.postBuyFormPostageAmount = value;
    }

    /**
     * Gets the value of the postBuyFormMsgToSeller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormMsgToSeller() {
        return postBuyFormMsgToSeller;
    }

    /**
     * Sets the value of the postBuyFormMsgToSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormMsgToSeller(String value) {
        this.postBuyFormMsgToSeller = value;
    }

    /**
     * Gets the value of the postBuyFormAmount property.
     * 
     */
    public float getPostBuyFormAmount() {
        return postBuyFormAmount;
    }

    /**
     * Sets the value of the postBuyFormAmount property.
     * 
     */
    public void setPostBuyFormAmount(float value) {
        this.postBuyFormAmount = value;
    }

    /**
     * Gets the value of the postBuyFormSurchargesList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getPostBuyFormSurchargesList() {
        return postBuyFormSurchargesList;
    }

    /**
     * Sets the value of the postBuyFormSurchargesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setPostBuyFormSurchargesList(ArrayOfLong value) {
        this.postBuyFormSurchargesList = value;
    }

    /**
     * Gets the value of the postBuyFormShipmentTracking property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostbuyformshipmenttrackingstruct }
     *     
     */
    public ArrayOfPostbuyformshipmenttrackingstruct getPostBuyFormShipmentTracking() {
        return postBuyFormShipmentTracking;
    }

    /**
     * Sets the value of the postBuyFormShipmentTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostbuyformshipmenttrackingstruct }
     *     
     */
    public void setPostBuyFormShipmentTracking(ArrayOfPostbuyformshipmenttrackingstruct value) {
        this.postBuyFormShipmentTracking = value;
    }

    /**
     * Gets the value of the postBuyFormGdAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PostBuyFormAddressStruct }
     *     
     */
    public PostBuyFormAddressStruct getPostBuyFormGdAddress() {
        return postBuyFormGdAddress;
    }

    /**
     * Sets the value of the postBuyFormGdAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostBuyFormAddressStruct }
     *     
     */
    public void setPostBuyFormGdAddress(PostBuyFormAddressStruct value) {
        this.postBuyFormGdAddress = value;
    }

    /**
     * Gets the value of the postBuyFormGdAdditionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormGdAdditionalInfo() {
        return postBuyFormGdAdditionalInfo;
    }

    /**
     * Sets the value of the postBuyFormGdAdditionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormGdAdditionalInfo(String value) {
        this.postBuyFormGdAdditionalInfo = value;
    }

    /**
     * Gets the value of the postBuyFormSentBySeller property.
     * 
     */
    public int getPostBuyFormSentBySeller() {
        return postBuyFormSentBySeller;
    }

    /**
     * Sets the value of the postBuyFormSentBySeller property.
     * 
     */
    public void setPostBuyFormSentBySeller(int value) {
        this.postBuyFormSentBySeller = value;
    }

}
