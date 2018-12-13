
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructSellAgain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructSellAgain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sellItemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sellItemInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellItemLocalId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructSellAgain", propOrder = {

})
public class StructSellAgain {

    protected long sellItemId;
    @XmlElement(required = true)
    protected String sellItemInfo;
    protected int sellItemLocalId;

    /**
     * Gets the value of the sellItemId property.
     * 
     */
    public long getSellItemId() {
        return sellItemId;
    }

    /**
     * Sets the value of the sellItemId property.
     * 
     */
    public void setSellItemId(long value) {
        this.sellItemId = value;
    }

    /**
     * Gets the value of the sellItemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellItemInfo() {
        return sellItemInfo;
    }

    /**
     * Sets the value of the sellItemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellItemInfo(String value) {
        this.sellItemInfo = value;
    }

    /**
     * Gets the value of the sellItemLocalId property.
     * 
     */
    public int getSellItemLocalId() {
        return sellItemLocalId;
    }

    /**
     * Sets the value of the sellItemLocalId property.
     * 
     */
    public void setSellItemLocalId(int value) {
        this.sellItemLocalId = value;
    }

}
