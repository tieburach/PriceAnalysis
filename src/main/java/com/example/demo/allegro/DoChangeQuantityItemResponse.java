
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
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemQuantityLeft" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemQuantitySold" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "itemId",
    "itemInfo",
    "itemQuantityLeft",
    "itemQuantitySold"
})
@XmlRootElement(name = "doChangeQuantityItemResponse")
public class DoChangeQuantityItemResponse {

    protected long itemId;
    @XmlElement(required = true)
    protected String itemInfo;
    protected int itemQuantityLeft;
    protected int itemQuantitySold;

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
     * Gets the value of the itemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemInfo() {
        return itemInfo;
    }

    /**
     * Sets the value of the itemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemInfo(String value) {
        this.itemInfo = value;
    }

    /**
     * Gets the value of the itemQuantityLeft property.
     * 
     */
    public int getItemQuantityLeft() {
        return itemQuantityLeft;
    }

    /**
     * Sets the value of the itemQuantityLeft property.
     * 
     */
    public void setItemQuantityLeft(int value) {
        this.itemQuantityLeft = value;
    }

    /**
     * Gets the value of the itemQuantitySold property.
     * 
     */
    public int getItemQuantitySold() {
        return itemQuantitySold;
    }

    /**
     * Sets the value of the itemQuantitySold property.
     * 
     */
    public void setItemQuantitySold(int value) {
        this.itemQuantitySold = value;
    }

}
