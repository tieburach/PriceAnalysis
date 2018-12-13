
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemCatList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemCatList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="catLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="catId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="catName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemCatList", propOrder = {

})
public class ItemCatList {

    protected int catLevel;
    protected long catId;
    @XmlElement(required = true)
    protected String catName;

    /**
     * Gets the value of the catLevel property.
     * 
     */
    public int getCatLevel() {
        return catLevel;
    }

    /**
     * Sets the value of the catLevel property.
     * 
     */
    public void setCatLevel(int value) {
        this.catLevel = value;
    }

    /**
     * Gets the value of the catId property.
     * 
     */
    public long getCatId() {
        return catId;
    }

    /**
     * Sets the value of the catId property.
     * 
     */
    public void setCatId(long value) {
        this.catId = value;
    }

    /**
     * Gets the value of the catName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatName() {
        return catName;
    }

    /**
     * Sets the value of the catName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatName(String value) {
        this.catName = value;
    }

}
