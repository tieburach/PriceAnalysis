
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostageStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostageStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postageAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="postageAmountAdd" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="postagePackSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postageFreeShipping" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postageFreeReturn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="postageFulfillmentTime" type="{https://webapi.allegro.pl/service.php}FulfillmentTimeStruct"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostageStruct", propOrder = {

})
public class PostageStruct {

    protected float postageAmount;
    protected float postageAmountAdd;
    protected int postagePackSize;
    protected int postageId;
    protected int postageFreeShipping;
    protected Integer postageFreeReturn;
    @XmlElement(required = true)
    protected FulfillmentTimeStruct postageFulfillmentTime;

    /**
     * Gets the value of the postageAmount property.
     * 
     */
    public float getPostageAmount() {
        return postageAmount;
    }

    /**
     * Sets the value of the postageAmount property.
     * 
     */
    public void setPostageAmount(float value) {
        this.postageAmount = value;
    }

    /**
     * Gets the value of the postageAmountAdd property.
     * 
     */
    public float getPostageAmountAdd() {
        return postageAmountAdd;
    }

    /**
     * Sets the value of the postageAmountAdd property.
     * 
     */
    public void setPostageAmountAdd(float value) {
        this.postageAmountAdd = value;
    }

    /**
     * Gets the value of the postagePackSize property.
     * 
     */
    public int getPostagePackSize() {
        return postagePackSize;
    }

    /**
     * Sets the value of the postagePackSize property.
     * 
     */
    public void setPostagePackSize(int value) {
        this.postagePackSize = value;
    }

    /**
     * Gets the value of the postageId property.
     * 
     */
    public int getPostageId() {
        return postageId;
    }

    /**
     * Sets the value of the postageId property.
     * 
     */
    public void setPostageId(int value) {
        this.postageId = value;
    }

    /**
     * Gets the value of the postageFreeShipping property.
     * 
     */
    public int getPostageFreeShipping() {
        return postageFreeShipping;
    }

    /**
     * Sets the value of the postageFreeShipping property.
     * 
     */
    public void setPostageFreeShipping(int value) {
        this.postageFreeShipping = value;
    }

    /**
     * Gets the value of the postageFreeReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPostageFreeReturn() {
        return postageFreeReturn;
    }

    /**
     * Sets the value of the postageFreeReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPostageFreeReturn(Integer value) {
        this.postageFreeReturn = value;
    }

    /**
     * Gets the value of the postageFulfillmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentTimeStruct }
     *     
     */
    public FulfillmentTimeStruct getPostageFulfillmentTime() {
        return postageFulfillmentTime;
    }

    /**
     * Sets the value of the postageFulfillmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentTimeStruct }
     *     
     */
    public void setPostageFulfillmentTime(FulfillmentTimeStruct value) {
        this.postageFulfillmentTime = value;
    }

}
