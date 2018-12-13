
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
 *         &lt;element name="get_items_images_result" type="{https://webapi.allegro.pl/service.php}ArrayOfItemimagesstruct" minOccurs="0"/>
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
    "getItemsImagesResult"
})
@XmlRootElement(name = "doGetItemsImagesResponse")
public class DoGetItemsImagesResponse {

    @XmlElement(name = "get_items_images_result")
    protected ArrayOfItemimagesstruct getItemsImagesResult;

    /**
     * Gets the value of the getItemsImagesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemimagesstruct }
     *     
     */
    public ArrayOfItemimagesstruct getGetItemsImagesResult() {
        return getItemsImagesResult;
    }

    /**
     * Sets the value of the getItemsImagesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemimagesstruct }
     *     
     */
    public void setGetItemsImagesResult(ArrayOfItemimagesstruct value) {
        this.getItemsImagesResult = value;
    }

}
