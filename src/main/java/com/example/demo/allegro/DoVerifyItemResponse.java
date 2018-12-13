
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
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemListed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itemStartingTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "itemListed",
    "itemStartingTime"
})
@XmlRootElement(name = "doVerifyItemResponse")
public class DoVerifyItemResponse {

    protected long itemId;
    protected int itemListed;
    protected long itemStartingTime;

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
     * Gets the value of the itemListed property.
     * 
     */
    public int getItemListed() {
        return itemListed;
    }

    /**
     * Sets the value of the itemListed property.
     * 
     */
    public void setItemListed(int value) {
        this.itemListed = value;
    }

    /**
     * Gets the value of the itemStartingTime property.
     * 
     */
    public long getItemStartingTime() {
        return itemStartingTime;
    }

    /**
     * Sets the value of the itemStartingTime property.
     * 
     */
    public void setItemStartingTime(long value) {
        this.itemStartingTime = value;
    }

}
