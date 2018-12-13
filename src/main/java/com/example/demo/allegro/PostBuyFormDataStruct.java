
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostBuyFormDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostBuyFormDataStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postBuyFormId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="postBuyFormItems" type="{https://webapi.allegro.pl/service.php}ArrayOfPostbuyformitemstruct" minOccurs="0"/>
 *         &lt;element name="postBuyFormBuyerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="postBuyFormAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="postBuyFormPostageAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="postBuyFormInvoiceOption" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postBuyFormMsgToSeller" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormInvoiceData" type="{https://webapi.allegro.pl/service.php}PostBuyFormAddressStruct"/>
 *         &lt;element name="postBuyFormShipmentAddress" type="{https://webapi.allegro.pl/service.php}PostBuyFormAddressStruct"/>
 *         &lt;element name="postBuyFormPayType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormPayId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="postBuyFormPayStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormDateInit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormDateRecv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormDateCancel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormShipmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postBuyFormGdAddress" type="{https://webapi.allegro.pl/service.php}PostBuyFormAddressStruct"/>
 *         &lt;element name="postBuyFormShipmentTracking" type="{https://webapi.allegro.pl/service.php}ArrayOfPostbuyformshipmenttrackingstruct" minOccurs="0"/>
 *         &lt;element name="postBuyFormSurchargesList" type="{https://webapi.allegro.pl/service.php}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="postBuyFormGdAdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="postBuyFormSentBySeller" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postBuyFormBuyerLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormBuyerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormAdditionalServicesAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostBuyFormDataStruct", propOrder = {

})
public class PostBuyFormDataStruct {

    protected long postBuyFormId;
    protected ArrayOfPostbuyformitemstruct postBuyFormItems;
    protected long postBuyFormBuyerId;
    protected float postBuyFormAmount;
    protected float postBuyFormPostageAmount;
    protected int postBuyFormInvoiceOption;
    @XmlElement(required = true)
    protected String postBuyFormMsgToSeller;
    @XmlElement(required = true)
    protected PostBuyFormAddressStruct postBuyFormInvoiceData;
    @XmlElement(required = true)
    protected PostBuyFormAddressStruct postBuyFormShipmentAddress;
    @XmlElement(required = true)
    protected String postBuyFormPayType;
    protected long postBuyFormPayId;
    @XmlElement(required = true)
    protected String postBuyFormPayStatus;
    @XmlElement(required = true)
    protected String postBuyFormDateInit;
    @XmlElement(required = true)
    protected String postBuyFormDateRecv;
    @XmlElement(required = true)
    protected String postBuyFormDateCancel;
    protected int postBuyFormShipmentId;
    @XmlElement(required = true)
    protected PostBuyFormAddressStruct postBuyFormGdAddress;
    protected ArrayOfPostbuyformshipmenttrackingstruct postBuyFormShipmentTracking;
    protected ArrayOfLong postBuyFormSurchargesList;
    @XmlElement(required = true)
    protected String postBuyFormGdAdditionalInfo;
    protected float postBuyFormPaymentAmount;
    protected int postBuyFormSentBySeller;
    @XmlElement(required = true)
    protected String postBuyFormBuyerLogin;
    @XmlElement(required = true)
    protected String postBuyFormBuyerEmail;
    protected float postBuyFormAdditionalServicesAmount;

    /**
     * Gets the value of the postBuyFormId property.
     * 
     */
    public long getPostBuyFormId() {
        return postBuyFormId;
    }

    /**
     * Sets the value of the postBuyFormId property.
     * 
     */
    public void setPostBuyFormId(long value) {
        this.postBuyFormId = value;
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
     * Gets the value of the postBuyFormBuyerId property.
     * 
     */
    public long getPostBuyFormBuyerId() {
        return postBuyFormBuyerId;
    }

    /**
     * Sets the value of the postBuyFormBuyerId property.
     * 
     */
    public void setPostBuyFormBuyerId(long value) {
        this.postBuyFormBuyerId = value;
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
     * Gets the value of the postBuyFormInvoiceOption property.
     * 
     */
    public int getPostBuyFormInvoiceOption() {
        return postBuyFormInvoiceOption;
    }

    /**
     * Sets the value of the postBuyFormInvoiceOption property.
     * 
     */
    public void setPostBuyFormInvoiceOption(int value) {
        this.postBuyFormInvoiceOption = value;
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
     * Gets the value of the postBuyFormInvoiceData property.
     * 
     * @return
     *     possible object is
     *     {@link PostBuyFormAddressStruct }
     *     
     */
    public PostBuyFormAddressStruct getPostBuyFormInvoiceData() {
        return postBuyFormInvoiceData;
    }

    /**
     * Sets the value of the postBuyFormInvoiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostBuyFormAddressStruct }
     *     
     */
    public void setPostBuyFormInvoiceData(PostBuyFormAddressStruct value) {
        this.postBuyFormInvoiceData = value;
    }

    /**
     * Gets the value of the postBuyFormShipmentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PostBuyFormAddressStruct }
     *     
     */
    public PostBuyFormAddressStruct getPostBuyFormShipmentAddress() {
        return postBuyFormShipmentAddress;
    }

    /**
     * Sets the value of the postBuyFormShipmentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostBuyFormAddressStruct }
     *     
     */
    public void setPostBuyFormShipmentAddress(PostBuyFormAddressStruct value) {
        this.postBuyFormShipmentAddress = value;
    }

    /**
     * Gets the value of the postBuyFormPayType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormPayType() {
        return postBuyFormPayType;
    }

    /**
     * Sets the value of the postBuyFormPayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormPayType(String value) {
        this.postBuyFormPayType = value;
    }

    /**
     * Gets the value of the postBuyFormPayId property.
     * 
     */
    public long getPostBuyFormPayId() {
        return postBuyFormPayId;
    }

    /**
     * Sets the value of the postBuyFormPayId property.
     * 
     */
    public void setPostBuyFormPayId(long value) {
        this.postBuyFormPayId = value;
    }

    /**
     * Gets the value of the postBuyFormPayStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormPayStatus() {
        return postBuyFormPayStatus;
    }

    /**
     * Sets the value of the postBuyFormPayStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormPayStatus(String value) {
        this.postBuyFormPayStatus = value;
    }

    /**
     * Gets the value of the postBuyFormDateInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormDateInit() {
        return postBuyFormDateInit;
    }

    /**
     * Sets the value of the postBuyFormDateInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormDateInit(String value) {
        this.postBuyFormDateInit = value;
    }

    /**
     * Gets the value of the postBuyFormDateRecv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormDateRecv() {
        return postBuyFormDateRecv;
    }

    /**
     * Sets the value of the postBuyFormDateRecv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormDateRecv(String value) {
        this.postBuyFormDateRecv = value;
    }

    /**
     * Gets the value of the postBuyFormDateCancel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormDateCancel() {
        return postBuyFormDateCancel;
    }

    /**
     * Sets the value of the postBuyFormDateCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormDateCancel(String value) {
        this.postBuyFormDateCancel = value;
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
     * Gets the value of the postBuyFormPaymentAmount property.
     * 
     */
    public float getPostBuyFormPaymentAmount() {
        return postBuyFormPaymentAmount;
    }

    /**
     * Sets the value of the postBuyFormPaymentAmount property.
     * 
     */
    public void setPostBuyFormPaymentAmount(float value) {
        this.postBuyFormPaymentAmount = value;
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

    /**
     * Gets the value of the postBuyFormBuyerLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormBuyerLogin() {
        return postBuyFormBuyerLogin;
    }

    /**
     * Sets the value of the postBuyFormBuyerLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormBuyerLogin(String value) {
        this.postBuyFormBuyerLogin = value;
    }

    /**
     * Gets the value of the postBuyFormBuyerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormBuyerEmail() {
        return postBuyFormBuyerEmail;
    }

    /**
     * Sets the value of the postBuyFormBuyerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormBuyerEmail(String value) {
        this.postBuyFormBuyerEmail = value;
    }

    /**
     * Gets the value of the postBuyFormAdditionalServicesAmount property.
     * 
     */
    public float getPostBuyFormAdditionalServicesAmount() {
        return postBuyFormAdditionalServicesAmount;
    }

    /**
     * Sets the value of the postBuyFormAdditionalServicesAmount property.
     * 
     */
    public void setPostBuyFormAdditionalServicesAmount(float value) {
        this.postBuyFormAdditionalServicesAmount = value;
    }

}
