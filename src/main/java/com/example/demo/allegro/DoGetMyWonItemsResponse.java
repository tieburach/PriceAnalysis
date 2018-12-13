
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
 *         &lt;element name="wonItemsCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wonItemsList" type="{https://webapi.allegro.pl/service.php}ArrayOfWonitemstruct" minOccurs="0"/>
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
    "wonItemsCounter",
    "wonItemsList"
})
@XmlRootElement(name = "doGetMyWonItemsResponse")
public class DoGetMyWonItemsResponse {

    protected int wonItemsCounter;
    protected ArrayOfWonitemstruct wonItemsList;

    /**
     * Gets the value of the wonItemsCounter property.
     * 
     */
    public int getWonItemsCounter() {
        return wonItemsCounter;
    }

    /**
     * Sets the value of the wonItemsCounter property.
     * 
     */
    public void setWonItemsCounter(int value) {
        this.wonItemsCounter = value;
    }

    /**
     * Gets the value of the wonItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWonitemstruct }
     *     
     */
    public ArrayOfWonitemstruct getWonItemsList() {
        return wonItemsList;
    }

    /**
     * Sets the value of the wonItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWonitemstruct }
     *     
     */
    public void setWonItemsList(ArrayOfWonitemstruct value) {
        this.wonItemsList = value;
    }

}
