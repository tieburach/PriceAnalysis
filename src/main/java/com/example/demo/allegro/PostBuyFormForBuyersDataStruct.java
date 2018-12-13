
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostBuyFormForBuyersDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostBuyFormForBuyersDataStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postBuyFormId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="postBuyFormBuyerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postBuyFormSellers" type="{https://webapi.allegro.pl/service.php}ArrayOfPostbuyformsellersstruct" minOccurs="0"/>
 *         &lt;element name="postBuyFormTotalAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="postBuyFormInvoiceOption" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postBuyFormInvoiceData" type="{https://webapi.allegro.pl/service.php}PostBuyFormAddressStruct" minOccurs="0"/>
 *         &lt;element name="postBuyFormShipmentAddress" type="{https://webapi.allegro.pl/service.php}PostBuyFormAddressStruct"/>
 *         &lt;element name="postBuyFormPayType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormPayId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="postBuyFormPayStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormDateInit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormDateRecv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormDateCancel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostBuyFormForBuyersDataStruct", propOrder = {

})
public class PostBuyFormForBuyersDataStruct {

    protected long postBuyFormId;
    protected int postBuyFormBuyerId;
    protected ArrayOfPostbuyformsellersstruct postBuyFormSellers;
    protected float postBuyFormTotalAmount;
    protected int postBuyFormInvoiceOption;
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
    protected float postBuyFormPaymentAmount;

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
     * Gets the value of the postBuyFormBuyerId property.
     * 
     */
    public int getPostBuyFormBuyerId() {
        return postBuyFormBuyerId;
    }

    /**
     * Sets the value of the postBuyFormBuyerId property.
     * 
     */
    public void setPostBuyFormBuyerId(int value) {
        this.postBuyFormBuyerId = value;
    }

    /**
     * Gets the value of the postBuyFormSellers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostbuyformsellersstruct }
     *     
     */
    public ArrayOfPostbuyformsellersstruct getPostBuyFormSellers() {
        return postBuyFormSellers;
    }

    /**
     * Sets the value of the postBuyFormSellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostbuyformsellersstruct }
     *     
     */
    public void setPostBuyFormSellers(ArrayOfPostbuyformsellersstruct value) {
        this.postBuyFormSellers = value;
    }

    /**
     * Gets the value of the postBuyFormTotalAmount property.
     * 
     */
    public float getPostBuyFormTotalAmount() {
        return postBuyFormTotalAmount;
    }

    /**
     * Sets the value of the postBuyFormTotalAmount property.
     * 
     */
    public void setPostBuyFormTotalAmount(float value) {
        this.postBuyFormTotalAmount = value;
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

}
