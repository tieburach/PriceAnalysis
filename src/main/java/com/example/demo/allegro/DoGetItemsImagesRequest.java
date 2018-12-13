
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
 *         &lt;element name="itemsArray" type="{https://webapi.allegro.pl/service.php}ArrayOfItemgetimage" minOccurs="0"/>
 *         &lt;element name="imageType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "itemsArray",
    "imageType"
})
@XmlRootElement(name = "DoGetItemsImagesRequest")
public class DoGetItemsImagesRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected ArrayOfItemgetimage itemsArray;
    protected int imageType;

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
     * Gets the value of the itemsArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemgetimage }
     *     
     */
    public ArrayOfItemgetimage getItemsArray() {
        return itemsArray;
    }

    /**
     * Sets the value of the itemsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemgetimage }
     *     
     */
    public void setItemsArray(ArrayOfItemgetimage value) {
        this.itemsArray = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     */
    public int getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     */
    public void setImageType(int value) {
        this.imageType = value;
    }

}
