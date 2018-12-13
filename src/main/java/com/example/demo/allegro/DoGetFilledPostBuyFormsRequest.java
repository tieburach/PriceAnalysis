
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userRole" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fillingTimeFrom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fillingTimeTo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "sessionId",
    "paymentType",
    "userRole",
    "fillingTimeFrom",
    "fillingTimeTo"
})
@XmlRootElement(name = "DoGetFilledPostBuyFormsRequest")
public class DoGetFilledPostBuyFormsRequest {

    @XmlElement(required = true)
    protected String sessionId;
    protected Integer paymentType;
    protected int userRole;
    protected Long fillingTimeFrom;
    protected Long fillingTimeTo;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentType(Integer value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     */
    public int getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     */
    public void setUserRole(int value) {
        this.userRole = value;
    }

    /**
     * Gets the value of the fillingTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFillingTimeFrom() {
        return fillingTimeFrom;
    }

    /**
     * Sets the value of the fillingTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFillingTimeFrom(Long value) {
        this.fillingTimeFrom = value;
    }

    /**
     * Gets the value of the fillingTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFillingTimeTo() {
        return fillingTimeTo;
    }

    /**
     * Sets the value of the fillingTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFillingTimeTo(Long value) {
        this.fillingTimeTo = value;
    }

}
