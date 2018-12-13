
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
 *         &lt;element name="changedItem" type="{https://webapi.allegro.pl/service.php}ChangedItemStruct"/>
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
    "changedItem"
})
@XmlRootElement(name = "doChangeItemFieldsResponse")
public class DoChangeItemFieldsResponse {

    @XmlElement(required = true)
    protected ChangedItemStruct changedItem;

    /**
     * Gets the value of the changedItem property.
     * 
     * @return
     *     possible object is
     *     {@link ChangedItemStruct }
     *     
     */
    public ChangedItemStruct getChangedItem() {
        return changedItem;
    }

    /**
     * Sets the value of the changedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangedItemStruct }
     *     
     */
    public void setChangedItem(ChangedItemStruct value) {
        this.changedItem = value;
    }

}
