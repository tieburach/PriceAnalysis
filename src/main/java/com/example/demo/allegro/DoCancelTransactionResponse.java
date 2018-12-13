
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
 *         &lt;element name="cancellationResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "cancellationResult"
})
@XmlRootElement(name = "doCancelTransactionResponse")
public class DoCancelTransactionResponse {

    protected int cancellationResult;

    /**
     * Gets the value of the cancellationResult property.
     * 
     */
    public int getCancellationResult() {
        return cancellationResult;
    }

    /**
     * Sets the value of the cancellationResult property.
     * 
     */
    public void setCancellationResult(int value) {
        this.cancellationResult = value;
    }

}
