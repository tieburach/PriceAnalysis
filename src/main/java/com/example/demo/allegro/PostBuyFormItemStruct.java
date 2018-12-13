
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostBuyFormItemStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostBuyFormItemStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postBuyFormItQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postBuyFormItAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="postBuyFormItId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="postBuyFormItTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormItCountry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postBuyFormItPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="postBuyFormItDeals" type="{https://webapi.allegro.pl/service.php}ArrayOfPostbuyformitemdealsstruct" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostBuyFormItemStruct", propOrder = {

})
public class PostBuyFormItemStruct {

    protected int postBuyFormItQuantity;
    protected float postBuyFormItAmount;
    protected long postBuyFormItId;
    @XmlElement(required = true)
    protected String postBuyFormItTitle;
    protected int postBuyFormItCountry;
    protected float postBuyFormItPrice;
    protected ArrayOfPostbuyformitemdealsstruct postBuyFormItDeals;

    /**
     * Gets the value of the postBuyFormItQuantity property.
     * 
     */
    public int getPostBuyFormItQuantity() {
        return postBuyFormItQuantity;
    }

    /**
     * Sets the value of the postBuyFormItQuantity property.
     * 
     */
    public void setPostBuyFormItQuantity(int value) {
        this.postBuyFormItQuantity = value;
    }

    /**
     * Gets the value of the postBuyFormItAmount property.
     * 
     */
    public float getPostBuyFormItAmount() {
        return postBuyFormItAmount;
    }

    /**
     * Sets the value of the postBuyFormItAmount property.
     * 
     */
    public void setPostBuyFormItAmount(float value) {
        this.postBuyFormItAmount = value;
    }

    /**
     * Gets the value of the postBuyFormItId property.
     * 
     */
    public long getPostBuyFormItId() {
        return postBuyFormItId;
    }

    /**
     * Sets the value of the postBuyFormItId property.
     * 
     */
    public void setPostBuyFormItId(long value) {
        this.postBuyFormItId = value;
    }

    /**
     * Gets the value of the postBuyFormItTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormItTitle() {
        return postBuyFormItTitle;
    }

    /**
     * Sets the value of the postBuyFormItTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormItTitle(String value) {
        this.postBuyFormItTitle = value;
    }

    /**
     * Gets the value of the postBuyFormItCountry property.
     * 
     */
    public int getPostBuyFormItCountry() {
        return postBuyFormItCountry;
    }

    /**
     * Sets the value of the postBuyFormItCountry property.
     * 
     */
    public void setPostBuyFormItCountry(int value) {
        this.postBuyFormItCountry = value;
    }

    /**
     * Gets the value of the postBuyFormItPrice property.
     * 
     */
    public float getPostBuyFormItPrice() {
        return postBuyFormItPrice;
    }

    /**
     * Sets the value of the postBuyFormItPrice property.
     * 
     */
    public void setPostBuyFormItPrice(float value) {
        this.postBuyFormItPrice = value;
    }

    /**
     * Gets the value of the postBuyFormItDeals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostbuyformitemdealsstruct }
     *     
     */
    public ArrayOfPostbuyformitemdealsstruct getPostBuyFormItDeals() {
        return postBuyFormItDeals;
    }

    /**
     * Sets the value of the postBuyFormItDeals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostbuyformitemdealsstruct }
     *     
     */
    public void setPostBuyFormItDeals(ArrayOfPostbuyformitemdealsstruct value) {
        this.postBuyFormItDeals = value;
    }

}
