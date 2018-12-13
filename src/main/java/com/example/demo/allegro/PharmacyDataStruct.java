
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PharmacyDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PharmacyDataStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="pharmacyOpeningDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pharmacyExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pharmacyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pharmacyPharmacistFullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pharmacyAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pharmacyPostcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pharmacyCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pharmacyCommune" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pharmacyCountryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pharmacyStateId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pharmacyPermitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pharmacyPermitInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PharmacyDataStruct", propOrder = {

})
public class PharmacyDataStruct {

    @XmlElement(required = true)
    protected String pharmacyOpeningDate;
    @XmlElement(required = true)
    protected String pharmacyExpirationDate;
    @XmlElement(required = true)
    protected String pharmacyName;
    @XmlElement(required = true)
    protected String pharmacyPharmacistFullName;
    @XmlElement(required = true)
    protected String pharmacyAddress;
    @XmlElement(required = true)
    protected String pharmacyPostcode;
    @XmlElement(required = true)
    protected String pharmacyCity;
    @XmlElement(required = true)
    protected String pharmacyCommune;
    protected int pharmacyCountryId;
    protected int pharmacyStateId;
    @XmlElement(required = true)
    protected String pharmacyPermitNumber;
    @XmlElement(required = true)
    protected String pharmacyPermitInfo;

    /**
     * Gets the value of the pharmacyOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyOpeningDate() {
        return pharmacyOpeningDate;
    }

    /**
     * Sets the value of the pharmacyOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyOpeningDate(String value) {
        this.pharmacyOpeningDate = value;
    }

    /**
     * Gets the value of the pharmacyExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyExpirationDate() {
        return pharmacyExpirationDate;
    }

    /**
     * Sets the value of the pharmacyExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyExpirationDate(String value) {
        this.pharmacyExpirationDate = value;
    }

    /**
     * Gets the value of the pharmacyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyName() {
        return pharmacyName;
    }

    /**
     * Sets the value of the pharmacyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyName(String value) {
        this.pharmacyName = value;
    }

    /**
     * Gets the value of the pharmacyPharmacistFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyPharmacistFullName() {
        return pharmacyPharmacistFullName;
    }

    /**
     * Sets the value of the pharmacyPharmacistFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyPharmacistFullName(String value) {
        this.pharmacyPharmacistFullName = value;
    }

    /**
     * Gets the value of the pharmacyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyAddress() {
        return pharmacyAddress;
    }

    /**
     * Sets the value of the pharmacyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyAddress(String value) {
        this.pharmacyAddress = value;
    }

    /**
     * Gets the value of the pharmacyPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyPostcode() {
        return pharmacyPostcode;
    }

    /**
     * Sets the value of the pharmacyPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyPostcode(String value) {
        this.pharmacyPostcode = value;
    }

    /**
     * Gets the value of the pharmacyCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyCity() {
        return pharmacyCity;
    }

    /**
     * Sets the value of the pharmacyCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyCity(String value) {
        this.pharmacyCity = value;
    }

    /**
     * Gets the value of the pharmacyCommune property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyCommune() {
        return pharmacyCommune;
    }

    /**
     * Sets the value of the pharmacyCommune property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyCommune(String value) {
        this.pharmacyCommune = value;
    }

    /**
     * Gets the value of the pharmacyCountryId property.
     * 
     */
    public int getPharmacyCountryId() {
        return pharmacyCountryId;
    }

    /**
     * Sets the value of the pharmacyCountryId property.
     * 
     */
    public void setPharmacyCountryId(int value) {
        this.pharmacyCountryId = value;
    }

    /**
     * Gets the value of the pharmacyStateId property.
     * 
     */
    public int getPharmacyStateId() {
        return pharmacyStateId;
    }

    /**
     * Sets the value of the pharmacyStateId property.
     * 
     */
    public void setPharmacyStateId(int value) {
        this.pharmacyStateId = value;
    }

    /**
     * Gets the value of the pharmacyPermitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyPermitNumber() {
        return pharmacyPermitNumber;
    }

    /**
     * Sets the value of the pharmacyPermitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyPermitNumber(String value) {
        this.pharmacyPermitNumber = value;
    }

    /**
     * Gets the value of the pharmacyPermitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacyPermitInfo() {
        return pharmacyPermitInfo;
    }

    /**
     * Sets the value of the pharmacyPermitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacyPermitInfo(String value) {
        this.pharmacyPermitInfo = value;
    }

}
