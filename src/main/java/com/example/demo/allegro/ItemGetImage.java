
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemGetImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemGetImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itSellerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itFotoCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemGetImage", propOrder = {

})
public class ItemGetImage {

    protected long itId;
    protected long itSellerId;
    protected int itFotoCount;

    /**
     * Gets the value of the itId property.
     * 
     */
    public long getItId() {
        return itId;
    }

    /**
     * Sets the value of the itId property.
     * 
     */
    public void setItId(long value) {
        this.itId = value;
    }

    /**
     * Gets the value of the itSellerId property.
     * 
     */
    public long getItSellerId() {
        return itSellerId;
    }

    /**
     * Sets the value of the itSellerId property.
     * 
     */
    public void setItSellerId(long value) {
        this.itSellerId = value;
    }

    /**
     * Gets the value of the itFotoCount property.
     * 
     */
    public int getItFotoCount() {
        return itFotoCount;
    }

    /**
     * Sets the value of the itFotoCount property.
     * 
     */
    public void setItFotoCount(int value) {
        this.itFotoCount = value;
    }

}
