
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanySecondAddressStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanySecondAddressStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="companyWorkerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyWorkerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyPostcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyCountryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="companyStateId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanySecondAddressStruct", propOrder = {

})
public class CompanySecondAddressStruct {

    @XmlElement(required = true)
    protected String companyWorkerFirstName;
    @XmlElement(required = true)
    protected String companyWorkerLastName;
    @XmlElement(required = true)
    protected String companyAddress;
    @XmlElement(required = true)
    protected String companyPostcode;
    @XmlElement(required = true)
    protected String companyCity;
    protected int companyCountryId;
    protected int companyStateId;

    /**
     * Gets the value of the companyWorkerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWorkerFirstName() {
        return companyWorkerFirstName;
    }

    /**
     * Sets the value of the companyWorkerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWorkerFirstName(String value) {
        this.companyWorkerFirstName = value;
    }

    /**
     * Gets the value of the companyWorkerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWorkerLastName() {
        return companyWorkerLastName;
    }

    /**
     * Sets the value of the companyWorkerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWorkerLastName(String value) {
        this.companyWorkerLastName = value;
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
     * Gets the value of the companyCountryId property.
     * 
     */
    public int getCompanyCountryId() {
        return companyCountryId;
    }

    /**
     * Sets the value of the companyCountryId property.
     * 
     */
    public void setCompanyCountryId(int value) {
        this.companyCountryId = value;
    }

    /**
     * Gets the value of the companyStateId property.
     * 
     */
    public int getCompanyStateId() {
        return companyStateId;
    }

    /**
     * Sets the value of the companyStateId property.
     * 
     */
    public void setCompanyStateId(int value) {
        this.companyStateId = value;
    }

}
