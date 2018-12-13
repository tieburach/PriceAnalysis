
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemImagesStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemImagesStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemImages" type="{https://webapi.allegro.pl/service.php}ArrayOfItemimagelist" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemImagesStruct", propOrder = {

})
public class ItemImagesStruct {

    protected long itemId;
    protected ArrayOfItemimagelist itemImages;

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
     * Gets the value of the itemImages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemimagelist }
     *     
     */
    public ArrayOfItemimagelist getItemImages() {
        return itemImages;
    }

    /**
     * Sets the value of the itemImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemimagelist }
     *     
     */
    public void setItemImages(ArrayOfItemimagelist value) {
        this.itemImages = value;
    }

}
