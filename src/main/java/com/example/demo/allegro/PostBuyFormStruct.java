
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostBuyFormStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostBuyFormStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="transactionPackageIds" type="{https://webapi.allegro.pl/service.php}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="transactionPayByLink" type="{https://webapi.allegro.pl/service.php}TransactionPayByLinkStruct"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostBuyFormStruct", propOrder = {

})
public class PostBuyFormStruct {

    protected long transactionId;
    protected ArrayOfLong transactionPackageIds;
    @XmlElement(required = true)
    protected TransactionPayByLinkStruct transactionPayByLink;

    /**
     * Gets the value of the transactionId property.
     * 
     */
    public long getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(long value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionPackageIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getTransactionPackageIds() {
        return transactionPackageIds;
    }

    /**
     * Sets the value of the transactionPackageIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setTransactionPackageIds(ArrayOfLong value) {
        this.transactionPackageIds = value;
    }

    /**
     * Gets the value of the transactionPayByLink property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionPayByLinkStruct }
     *     
     */
    public TransactionPayByLinkStruct getTransactionPayByLink() {
        return transactionPayByLink;
    }

    /**
     * Sets the value of the transactionPayByLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionPayByLinkStruct }
     *     
     */
    public void setTransactionPayByLink(TransactionPayByLinkStruct value) {
        this.transactionPayByLink = value;
    }

}
