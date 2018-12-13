
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionPayByLinkStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionPayByLinkStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="actionHttpMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actionUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actionData" type="{https://webapi.allegro.pl/service.php}ArrayOfActiondatastruct" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionPayByLinkStruct", propOrder = {

})
public class TransactionPayByLinkStruct {

    @XmlElement(required = true)
    protected String actionHttpMethod;
    @XmlElement(required = true)
    protected String actionUrl;
    protected ArrayOfActiondatastruct actionData;

    /**
     * Gets the value of the actionHttpMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionHttpMethod() {
        return actionHttpMethod;
    }

    /**
     * Sets the value of the actionHttpMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionHttpMethod(String value) {
        this.actionHttpMethod = value;
    }

    /**
     * Gets the value of the actionUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionUrl() {
        return actionUrl;
    }

    /**
     * Sets the value of the actionUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionUrl(String value) {
        this.actionUrl = value;
    }

    /**
     * Gets the value of the actionData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActiondatastruct }
     *     
     */
    public ArrayOfActiondatastruct getActionData() {
        return actionData;
    }

    /**
     * Sets the value of the actionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActiondatastruct }
     *     
     */
    public void setActionData(ArrayOfActiondatastruct value) {
        this.actionData = value;
    }

}
