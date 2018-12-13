
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyInfoStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="companyFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyPostcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyNip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyInfoStruct", propOrder = {

})
public class CompanyInfoStruct {

    @XmlElement(required = true)
    protected String companyFirstName;
    @XmlElement(required = true)
    protected String companyLastName;
    @XmlElement(required = true)
    protected String companyName;
    @XmlElement(required = true)
    protected String companyAddress;
    @XmlElement(required = true)
    protected String companyPostcode;
    @XmlElement(required = true)
    protected String companyCity;
    @XmlElement(required = true)
    protected String companyNip;

    /**
     * Gets the value of the companyFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyFirstName() {
        return companyFirstName;
    }

    /**
     * Sets the value of the companyFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyFirstName(String value) {
        this.companyFirstName = value;
    }

    /**
     * Gets the value of the companyLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyLastName() {
        return companyLastName;
    }

    /**
     * Sets the value of the companyLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyLastName(String value) {
        this.companyLastName = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * Sets the value of the companyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAddress(String value) {
        this.companyAddress = value;
    }

    /**
     * Gets the value of the companyPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPostcode() {
        return companyPostcode;
    }

    /**
     * Sets the value of the companyPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPostcode(String value) {
        this.companyPostcode = value;
    }

    /**
     * Gets the value of the companyCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCity() {
        return companyCity;
    }

    /**
     * Sets the value of the companyCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCity(String value) {
        this.companyCity = value;
    }

    /**
     * Gets the value of the companyNip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNip() {
        return companyNip;
    }

    /**
     * Sets the value of the companyNip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNip(String value) {
        this.companyNip = value;
    }

}
