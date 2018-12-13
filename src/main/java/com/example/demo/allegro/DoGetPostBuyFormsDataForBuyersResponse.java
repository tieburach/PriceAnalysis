
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="postBuyFormDataForBuyers" type="{https://webapi.allegro.pl/service.php}ArrayOfPostbuyformforbuyersdatastruct" minOccurs="0"/>
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
    "postBuyFormDataForBuyers"
})
@XmlRootElement(name = "doGetPostBuyFormsDataForBuyersResponse")
public class DoGetPostBuyFormsDataForBuyersResponse {

    protected ArrayOfPostbuyformforbuyersdatastruct postBuyFormDataForBuyers;

    /**
     * Gets the value of the postBuyFormDataForBuyers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostbuyformforbuyersdatastruct }
     *     
     */
    public ArrayOfPostbuyformforbuyersdatastruct getPostBuyFormDataForBuyers() {
        return postBuyFormDataForBuyers;
    }

    /**
     * Sets the value of the postBuyFormDataForBuyers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostbuyformforbuyersdatastruct }
     *     
     */
    public void setPostBuyFormDataForBuyers(ArrayOfPostbuyformforbuyersdatastruct value) {
        this.postBuyFormDataForBuyers = value;
    }

}
