
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangedItemStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangedItemStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemFields" type="{https://webapi.allegro.pl/service.php}ArrayOfFieldsvalue" minOccurs="0"/>
 *         &lt;element name="itemSurcharge" type="{https://webapi.allegro.pl/service.php}ArrayOfItemsurchargestruct" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangedItemStruct", propOrder = {

})
public class ChangedItemStruct {

    protected long itemId;
    protected ArrayOfFieldsvalue itemFields;
    protected ArrayOfItemsurchargestruct itemSurcharge;

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
     * Gets the value of the itemFields property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFieldsvalue }
     *     
     */
    public ArrayOfFieldsvalue getItemFields() {
        return itemFields;
    }

    /**
     * Sets the value of the itemFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFieldsvalue }
     *     
     */
    public void setItemFields(ArrayOfFieldsvalue value) {
        this.itemFields = value;
    }

    /**
     * Gets the value of the itemSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemsurchargestruct }
     *     
     */
    public ArrayOfItemsurchargestruct getItemSurcharge() {
        return itemSurcharge;
    }

    /**
     * Sets the value of the itemSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemsurchargestruct }
     *     
     */
    public void setItemSurcharge(ArrayOfItemsurchargestruct value) {
        this.itemSurcharge = value;
    }

}
