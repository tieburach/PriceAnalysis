
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SysStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SysStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="programVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="catsVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apiVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attribVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="formSellVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="siteVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="verKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SysStatusType", propOrder = {

})
public class SysStatusType {

    protected int countryId;
    @XmlElement(required = true)
    protected String programVersion;
    @XmlElement(required = true)
    protected String catsVersion;
    @XmlElement(required = true)
    protected String apiVersion;
    @XmlElement(required = true)
    protected String attribVersion;
    @XmlElement(required = true)
    protected String formSellVersion;
    @XmlElement(required = true)
    protected String siteVersion;
    protected long verKey;

    /**
     * Gets the value of the countryId property.
     * 
     */
    public int getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    public void setCountryId(int value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the programVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramVersion() {
        return programVersion;
    }

    /**
     * Sets the value of the programVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramVersion(String value) {
        this.programVersion = value;
    }

    /**
     * Gets the value of the catsVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatsVersion() {
        return catsVersion;
    }

    /**
     * Sets the value of the catsVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatsVersion(String value) {
        this.catsVersion = value;
    }

    /**
     * Gets the value of the apiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiVersion(String value) {
        this.apiVersion = value;
    }

    /**
     * Gets the value of the attribVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribVersion() {
        return attribVersion;
    }

    /**
     * Sets the value of the attribVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribVersion(String value) {
        this.attribVersion = value;
    }

    /**
     * Gets the value of the formSellVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormSellVersion() {
        return formSellVersion;
    }

    /**
     * Sets the value of the formSellVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormSellVersion(String value) {
        this.formSellVersion = value;
    }

    /**
     * Gets the value of the siteVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteVersion() {
        return siteVersion;
    }

    /**
     * Sets the value of the siteVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteVersion(String value) {
        this.siteVersion = value;
    }

    /**
     * Gets the value of the verKey property.
     * 
     */
    public long getVerKey() {
        return verKey;
    }

    /**
     * Sets the value of the verKey property.
     * 
     */
    public void setVerKey(long value) {
        this.verKey = value;
    }

}
