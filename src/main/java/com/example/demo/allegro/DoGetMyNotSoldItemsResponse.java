
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
 *         &lt;element name="notSoldItemsCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="notSoldItemsList" type="{https://webapi.allegro.pl/service.php}ArrayOfNotsolditemstruct" minOccurs="0"/>
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
    "notSoldItemsCounter",
    "notSoldItemsList"
})
@XmlRootElement(name = "doGetMyNotSoldItemsResponse")
public class DoGetMyNotSoldItemsResponse {

    protected int notSoldItemsCounter;
    protected ArrayOfNotsolditemstruct notSoldItemsList;

    /**
     * Gets the value of the notSoldItemsCounter property.
     * 
     */
    public int getNotSoldItemsCounter() {
        return notSoldItemsCounter;
    }

    /**
     * Sets the value of the notSoldItemsCounter property.
     * 
     */
    public void setNotSoldItemsCounter(int value) {
        this.notSoldItemsCounter = value;
    }

    /**
     * Gets the value of the notSoldItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotsolditemstruct }
     *     
     */
    public ArrayOfNotsolditemstruct getNotSoldItemsList() {
        return notSoldItemsList;
    }

    /**
     * Sets the value of the notSoldItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotsolditemstruct }
     *     
     */
    public void setNotSoldItemsList(ArrayOfNotsolditemstruct value) {
        this.notSoldItemsList = value;
    }

}
