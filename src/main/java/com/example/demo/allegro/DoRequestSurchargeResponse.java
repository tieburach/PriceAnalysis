
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
 *         &lt;element name="surchargeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "surchargeResult"
})
@XmlRootElement(name = "doRequestSurchargeResponse")
public class DoRequestSurchargeResponse {

    protected int surchargeResult;

    /**
     * Gets the value of the surchargeResult property.
     * 
     */
    public int getSurchargeResult() {
        return surchargeResult;
    }

    /**
     * Sets the value of the surchargeResult property.
     * 
     */
    public void setSurchargeResult(int value) {
        this.surchargeResult = value;
    }

}
