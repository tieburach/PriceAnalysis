
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
 *         &lt;element name="itemsSellAgain" type="{https://webapi.allegro.pl/service.php}ArrayOfStructsellagain" minOccurs="0"/>
 *         &lt;element name="itemsSellFailed" type="{https://webapi.allegro.pl/service.php}ArrayOfStructsellfailed" minOccurs="0"/>
 *         &lt;element name="itemsSellNotFound" type="{https://webapi.allegro.pl/service.php}ArrayOfLong" minOccurs="0"/>
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
    "itemsSellAgain",
    "itemsSellFailed",
    "itemsSellNotFound"
})
@XmlRootElement(name = "doSellSomeAgainResponse")
public class DoSellSomeAgainResponse {

    protected ArrayOfStructsellagain itemsSellAgain;
    protected ArrayOfStructsellfailed itemsSellFailed;
    protected ArrayOfLong itemsSellNotFound;

    /**
     * Gets the value of the itemsSellAgain property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStructsellagain }
     *     
     */
    public ArrayOfStructsellagain getItemsSellAgain() {
        return itemsSellAgain;
    }

    /**
     * Sets the value of the itemsSellAgain property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStructsellagain }
     *     
     */
    public void setItemsSellAgain(ArrayOfStructsellagain value) {
        this.itemsSellAgain = value;
    }

    /**
     * Gets the value of the itemsSellFailed property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStructsellfailed }
     *     
     */
    public ArrayOfStructsellfailed getItemsSellFailed() {
        return itemsSellFailed;
    }

    /**
     * Sets the value of the itemsSellFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStructsellfailed }
     *     
     */
    public void setItemsSellFailed(ArrayOfStructsellfailed value) {
        this.itemsSellFailed = value;
    }

    /**
     * Gets the value of the itemsSellNotFound property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getItemsSellNotFound() {
        return itemsSellNotFound;
    }

    /**
     * Sets the value of the itemsSellNotFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setItemsSellNotFound(ArrayOfLong value) {
        this.itemsSellNotFound = value;
    }

}
