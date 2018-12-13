
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
 *         &lt;element name="refundsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refundsList" type="{https://webapi.allegro.pl/service.php}ArrayOfArchiverefundslisttypestruct" minOccurs="0"/>
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
    "refundsCount",
    "refundsList"
})
@XmlRootElement(name = "doGetArchiveRefundsListResponse")
public class DoGetArchiveRefundsListResponse {

    protected int refundsCount;
    protected ArrayOfArchiverefundslisttypestruct refundsList;

    /**
     * Gets the value of the refundsCount property.
     * 
     */
    public int getRefundsCount() {
        return refundsCount;
    }

    /**
     * Sets the value of the refundsCount property.
     * 
     */
    public void setRefundsCount(int value) {
        this.refundsCount = value;
    }

    /**
     * Gets the value of the refundsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArchiverefundslisttypestruct }
     *     
     */
    public ArrayOfArchiverefundslisttypestruct getRefundsList() {
        return refundsList;
    }

    /**
     * Sets the value of the refundsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArchiverefundslisttypestruct }
     *     
     */
    public void setRefundsList(ArrayOfArchiverefundslisttypestruct value) {
        this.refundsList = value;
    }

}
