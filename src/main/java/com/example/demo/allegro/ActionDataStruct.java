
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionDataStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="actionKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actionValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionDataStruct", propOrder = {

})
public class ActionDataStruct {

    @XmlElement(required = true)
    protected String actionKey;
    @XmlElement(required = true)
    protected String actionValue;

    /**
     * Gets the value of the actionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionKey() {
        return actionKey;
    }

    /**
     * Sets the value of the actionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionKey(String value) {
        this.actionKey = value;
    }

    /**
     * Gets the value of the actionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionValue() {
        return actionValue;
    }

    /**
     * Sets the value of the actionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionValue(String value) {
        this.actionValue = value;
    }

}
