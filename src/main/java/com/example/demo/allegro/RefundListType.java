
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RefundListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dealId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dealDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="buyerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="buyerLogin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bidsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refundDetails" type="{https://webapi.allegro.pl/service.php}RefundDetailsType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundListType", propOrder = {

})
public class RefundListType {

    protected long dealId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dealDate;
    protected int buyerId;
    @XmlElement(required = true)
    protected String buyerLogin;
    protected long itemId;
    @XmlElement(required = true)
    protected String itemTitle;
    protected int bidsCount;
    @XmlElement(required = true)
    protected String quantityType;
    @XmlElement(required = true)
    protected RefundDetailsType refundDetails;

    /**
     * Gets the value of the dealId property.
     * 
     */
    public long getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     */
    public void setDealId(long value) {
        this.dealId = value;
    }

    /**
     * Gets the value of the dealDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDealDate() {
        return dealDate;
    }

    /**
     * Sets the value of the dealDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDealDate(XMLGregorianCalendar value) {
        this.dealDate = value;
    }

    /**
     * Gets the value of the buyerId property.
     * 
     */
    public int getBuyerId() {
        return buyerId;
    }

    /**
     * Sets the value of the buyerId property.
     * 
     */
    public void setBuyerId(int value) {
        this.buyerId = value;
    }

    /**
     * Gets the value of the buyerLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerLogin() {
        return buyerLogin;
    }

    /**
     * Sets the value of the buyerLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerLogin(String value) {
        this.buyerLogin = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     */
    public long getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     */
    public void setItemId(long value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itemTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * Sets the value of the itemTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTitle(String value) {
        this.itemTitle = value;
    }

    /**
     * Gets the value of the bidsCount property.
     * 
     */
    public int getBidsCount() {
        return bidsCount;
    }

    /**
     * Sets the value of the bidsCount property.
     * 
     */
    public void setBidsCount(int value) {
        this.bidsCount = value;
    }

    /**
     * Gets the value of the quantityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityType() {
        return quantityType;
    }

    /**
     * Sets the value of the quantityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityType(String value) {
        this.quantityType = value;
    }

    /**
     * Gets the value of the refundDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RefundDetailsType }
     *     
     */
    public RefundDetailsType getRefundDetails() {
        return refundDetails;
    }

    /**
     * Sets the value of the refundDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundDetailsType }
     *     
     */
    public void setRefundDetails(RefundDetailsType value) {
        this.refundDetails = value;
    }

}
