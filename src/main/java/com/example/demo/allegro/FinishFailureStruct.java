
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinishFailureStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinishFailureStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="finishItemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="finishErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finishErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinishFailureStruct", propOrder = {

})
public class FinishFailureStruct {

    protected long finishItemId;
    @XmlElement(required = true)
    protected String finishErrorCode;
    @XmlElement(required = true)
    protected String finishErrorMessage;

    /**
     * Gets the value of the finishItemId property.
     * 
     */
    public long getFinishItemId() {
        return finishItemId;
    }

    /**
     * Sets the value of the finishItemId property.
     * 
     */
    public void setFinishItemId(long value) {
        this.finishItemId = value;
    }

    /**
     * Gets the value of the finishErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishErrorCode() {
        return finishErrorCode;
    }

    /**
     * Sets the value of the finishErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishErrorCode(String value) {
        this.finishErrorCode = value;
    }

    /**
     * Gets the value of the finishErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishErrorMessage() {
        return finishErrorMessage;
    }

    /**
     * Sets the value of the finishErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishErrorMessage(String value) {
        this.finishErrorMessage = value;
    }

}
