
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
 *         &lt;element name="sessionHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transCreateDateFrom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="transCreateDateTo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="transPageLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "sessionHandle",
    "transCreateDateFrom",
    "transCreateDateTo",
    "transPageLimit",
    "transOffset"
})
@XmlRootElement(name = "DoGetMyPayoutsRequest")
public class DoGetMyPayoutsRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected Long transCreateDateFrom;
    protected Long transCreateDateTo;
    protected Integer transPageLimit;
    protected Integer transOffset;

    /**
     * Gets the value of the sessionHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionHandle() {
        return sessionHandle;
    }

    /**
     * Sets the value of the sessionHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionHandle(String value) {
        this.sessionHandle = value;
    }

    /**
     * Gets the value of the transCreateDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransCreateDateFrom() {
        return transCreateDateFrom;
    }

    /**
     * Sets the value of the transCreateDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransCreateDateFrom(Long value) {
        this.transCreateDateFrom = value;
    }

    /**
     * Gets the value of the transCreateDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransCreateDateTo() {
        return transCreateDateTo;
    }

    /**
     * Sets the value of the transCreateDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransCreateDateTo(Long value) {
        this.transCreateDateTo = value;
    }

    /**
     * Gets the value of the transPageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransPageLimit() {
        return transPageLimit;
    }

    /**
     * Sets the value of the transPageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransPageLimit(Integer value) {
        this.transPageLimit = value;
    }

    /**
     * Gets the value of the transOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransOffset() {
        return transOffset;
    }

    /**
     * Sets the value of the transOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransOffset(Integer value) {
        this.transOffset = value;
    }

}
