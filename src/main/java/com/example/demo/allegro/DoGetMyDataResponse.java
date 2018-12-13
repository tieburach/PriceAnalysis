
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
 *         &lt;element name="userData" type="{https://webapi.allegro.pl/service.php}UserDataStruct"/>
 *         &lt;element name="invoiceData" type="{https://webapi.allegro.pl/service.php}InvoiceDataStruct"/>
 *         &lt;element name="companyExtraData" type="{https://webapi.allegro.pl/service.php}CompanyExtraDataStruct"/>
 *         &lt;element name="companySecondAddress" type="{https://webapi.allegro.pl/service.php}CompanySecondAddressStruct"/>
 *         &lt;element name="pharmacyData" type="{https://webapi.allegro.pl/service.php}PharmacyDataStruct"/>
 *         &lt;element name="alcoholData" type="{https://webapi.allegro.pl/service.php}AlcoholDataStruct"/>
 *         &lt;element name="relatedPersons" type="{https://webapi.allegro.pl/service.php}RelatedPersonsStruct"/>
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
    "userData",
    "invoiceData",
    "companyExtraData",
    "companySecondAddress",
    "pharmacyData",
    "alcoholData",
    "relatedPersons"
})
@XmlRootElement(name = "doGetMyDataResponse")
public class DoGetMyDataResponse {

    @XmlElement(required = true)
    protected UserDataStruct userData;
    @XmlElement(required = true)
    protected InvoiceDataStruct invoiceData;
    @XmlElement(required = true)
    protected CompanyExtraDataStruct companyExtraData;
    @XmlElement(required = true)
    protected CompanySecondAddressStruct companySecondAddress;
    @XmlElement(required = true)
    protected PharmacyDataStruct pharmacyData;
    @XmlElement(required = true)
    protected AlcoholDataStruct alcoholData;
    @XmlElement(required = true)
    protected RelatedPersonsStruct relatedPersons;

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link UserDataStruct }
     *     
     */
    public UserDataStruct getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDataStruct }
     *     
     */
    public void setUserData(UserDataStruct value) {
        this.userData = value;
    }

    /**
     * Gets the value of the invoiceData property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDataStruct }
     *     
     */
    public InvoiceDataStruct getInvoiceData() {
        return invoiceData;
    }

    /**
     * Sets the value of the invoiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDataStruct }
     *     
     */
    public void setInvoiceData(InvoiceDataStruct value) {
        this.invoiceData = value;
    }

    /**
     * Gets the value of the companyExtraData property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyExtraDataStruct }
     *     
     */
    public CompanyExtraDataStruct getCompanyExtraData() {
        return companyExtraData;
    }

    /**
     * Sets the value of the companyExtraData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyExtraDataStruct }
     *     
     */
    public void setCompanyExtraData(CompanyExtraDataStruct value) {
        this.companyExtraData = value;
    }

    /**
     * Gets the value of the companySecondAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CompanySecondAddressStruct }
     *     
     */
    public CompanySecondAddressStruct getCompanySecondAddress() {
        return companySecondAddress;
    }

    /**
     * Sets the value of the companySecondAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanySecondAddressStruct }
     *     
     */
    public void setCompanySecondAddress(CompanySecondAddressStruct value) {
        this.companySecondAddress = value;
    }

    /**
     * Gets the value of the pharmacyData property.
     * 
     * @return
     *     possible object is
     *     {@link PharmacyDataStruct }
     *     
     */
    public PharmacyDataStruct getPharmacyData() {
        return pharmacyData;
    }

    /**
     * Sets the value of the pharmacyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PharmacyDataStruct }
     *     
     */
    public void setPharmacyData(PharmacyDataStruct value) {
        this.pharmacyData = value;
    }

    /**
     * Gets the value of the alcoholData property.
     * 
     * @return
     *     possible object is
     *     {@link AlcoholDataStruct }
     *     
     */
    public AlcoholDataStruct getAlcoholData() {
        return alcoholData;
    }

    /**
     * Sets the value of the alcoholData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlcoholDataStruct }
     *     
     */
    public void setAlcoholData(AlcoholDataStruct value) {
        this.alcoholData = value;
    }

    /**
     * Gets the value of the relatedPersons property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedPersonsStruct }
     *     
     */
    public RelatedPersonsStruct getRelatedPersons() {
        return relatedPersons;
    }

    /**
     * Sets the value of the relatedPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedPersonsStruct }
     *     
     */
    public void setRelatedPersons(RelatedPersonsStruct value) {
        this.relatedPersons = value;
    }

}
