
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructSellFailed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructSellFailed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sellItemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sellFaultCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellFaultString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructSellFailed", propOrder = {

})
public class StructSellFailed {

    protected long sellItemId;
    @XmlElement(required = true)
    protected String sellFaultCode;
    @XmlElement(required = true)
    protected String sellFaultString;

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
     * Gets the value of the sellFaultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellFaultCode() {
        return sellFaultCode;
    }

    /**
     * Sets the value of the sellFaultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellFaultCode(String value) {
        this.sellFaultCode = value;
    }

    /**
     * Gets the value of the sellFaultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellFaultString() {
        return sellFaultString;
    }

    /**
     * Sets the value of the sellFaultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellFaultString(String value) {
        this.sellFaultString = value;
    }

}
