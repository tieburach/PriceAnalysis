
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
 *         &lt;element name="entryFees" type="{https://webapi.allegro.pl/service.php}ArrayOfItembilling" minOccurs="0"/>
 *         &lt;element name="endingFees" type="{https://webapi.allegro.pl/service.php}ArrayOfItembilling" minOccurs="0"/>
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
    "entryFees",
    "endingFees"
})
@XmlRootElement(name = "doMyBillingItemResponse")
public class DoMyBillingItemResponse {

    protected ArrayOfItembilling entryFees;
    protected ArrayOfItembilling endingFees;

    /**
     * Gets the value of the entryFees property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItembilling }
     *     
     */
    public ArrayOfItembilling getEntryFees() {
        return entryFees;
    }

    /**
     * Sets the value of the entryFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItembilling }
     *     
     */
    public void setEntryFees(ArrayOfItembilling value) {
        this.entryFees = value;
    }

    /**
     * Gets the value of the endingFees property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItembilling }
     *     
     */
    public ArrayOfItembilling getEndingFees() {
        return endingFees;
    }

    /**
     * Sets the value of the endingFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItembilling }
     *     
     */
    public void setEndingFees(ArrayOfItembilling value) {
        this.endingFees = value;
    }

}
