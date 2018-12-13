
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
 *         &lt;element name="newPostBuyFormSeller" type="{https://webapi.allegro.pl/service.php}ArrayOfNewpostbuyformsellerstruct" minOccurs="0"/>
 *         &lt;element name="newPostBuyFormCommon" type="{https://webapi.allegro.pl/service.php}NewPostBuyFormCommonStruct"/>
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
    "newPostBuyFormSeller",
    "newPostBuyFormCommon"
})
@XmlRootElement(name = "DoSendPostBuyFormRequest")
public class DoSendPostBuyFormRequest {

    @XmlElement(required = true)
    protected String sessionId;
    protected ArrayOfNewpostbuyformsellerstruct newPostBuyFormSeller;
    @XmlElement(required = true)
    protected NewPostBuyFormCommonStruct newPostBuyFormCommon;

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
     * Gets the value of the newPostBuyFormSeller property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNewpostbuyformsellerstruct }
     *     
     */
    public ArrayOfNewpostbuyformsellerstruct getNewPostBuyFormSeller() {
        return newPostBuyFormSeller;
    }

    /**
     * Sets the value of the newPostBuyFormSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNewpostbuyformsellerstruct }
     *     
     */
    public void setNewPostBuyFormSeller(ArrayOfNewpostbuyformsellerstruct value) {
        this.newPostBuyFormSeller = value;
    }

    /**
     * Gets the value of the newPostBuyFormCommon property.
     * 
     * @return
     *     possible object is
     *     {@link NewPostBuyFormCommonStruct }
     *     
     */
    public NewPostBuyFormCommonStruct getNewPostBuyFormCommon() {
        return newPostBuyFormCommon;
    }

    /**
     * Sets the value of the newPostBuyFormCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewPostBuyFormCommonStruct }
     *     
     */
    public void setNewPostBuyFormCommon(NewPostBuyFormCommonStruct value) {
        this.newPostBuyFormCommon = value;
    }

}
