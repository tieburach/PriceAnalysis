
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
 *         &lt;element name="sellItemsCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellItemsList" type="{https://webapi.allegro.pl/service.php}ArrayOfSellitemstruct" minOccurs="0"/>
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
    "sellItemsCounter",
    "sellItemsList"
})
@XmlRootElement(name = "doGetMySellItemsResponse")
public class DoGetMySellItemsResponse {

    protected int sellItemsCounter;
    protected ArrayOfSellitemstruct sellItemsList;

    /**
     * Gets the value of the sellItemsCounter property.
     * 
     */
    public int getSellItemsCounter() {
        return sellItemsCounter;
    }

    /**
     * Sets the value of the sellItemsCounter property.
     * 
     */
    public void setSellItemsCounter(int value) {
        this.sellItemsCounter = value;
    }

    /**
     * Gets the value of the sellItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSellitemstruct }
     *     
     */
    public ArrayOfSellitemstruct getSellItemsList() {
        return sellItemsList;
    }

    /**
     * Sets the value of the sellItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSellitemstruct }
     *     
     */
    public void setSellItemsList(ArrayOfSellitemstruct value) {
        this.sellItemsList = value;
    }

}
