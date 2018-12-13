
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcoholDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlcoholDataStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="alcoholOpeningDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alcoholExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alcoholShopName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alcoholShopAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alcoholShopPostcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alcoholShopCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alcoholShopCommune" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alcoholShopCountryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alcoholShopStateId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alcoholPermitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alcoholPermitAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alcoholPermitInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcoholDataStruct", propOrder = {

})
public class AlcoholDataStruct {

    @XmlElement(required = true)
    protected String alcoholOpeningDate;
    @XmlElement(required = true)
    protected String alcoholExpirationDate;
    @XmlElement(required = true)
    protected String alcoholShopName;
    @XmlElement(required = true)
    protected String alcoholShopAddress;
    @XmlElement(required = true)
    protected String alcoholShopPostcode;
    @XmlElement(required = true)
    protected String alcoholShopCity;
    @XmlElement(required = true)
    protected String alcoholShopCommune;
    protected int alcoholShopCountryId;
    protected int alcoholShopStateId;
    @XmlElement(required = true)
    protected String alcoholPermitNumber;
    @XmlElement(required = true)
    protected String alcoholPermitAuthority;
    @XmlElement(required = true)
    protected String alcoholPermitInfo;

    /**
     * Gets the value of the alcoholOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlcoholOpeningDate() {
        return alcoholOpeningDate;
    }

    /**
     * Sets the value of the alcoholOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlcoholOpeningDate(String value) {
        this.alcoholOpeningDate = value;
    }

    /**
     * Gets the value of the alcoholExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlcoholExpirationDate() {
        return alcoholExpirationDate;
    }

    /**
     * Sets the value of the alcoholExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlcoholExpirationDate(String value) {
        this.alcoholExpirationDate = value;
    }

    /**
     * Gets the value of the alcoholShopName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlcoholShopName() {
        return alcoholShopName;
    }

    /**
     * Sets the value of the alcoholShopName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlcoholShopName(String value) {
        this.alcoholShopName = value;
    }

    /**
     * Gets the value of the alcoholShopAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlcoholShopAddress() {
        return alcoholShopAddress;
    }

    /**
     * Sets the value of the alcoholShopAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlcoholShopAddress(String value) {
        this.alcoholShopAddress = value;
    }

    /**
     * Gets the value of the alcoholShopPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlcoholShopPostcode() {
        return alcoholShopPostcode;
    }

    /**
     * Sets the value of the alcoholShopPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlcoholShopPostcode(String value) {
        this.alcoholShopPostcode = value;
    }

    /**
     * Gets the value of the alcoholShopCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlcoholShopCity() {
        return alcoholShopCity;
    }

    /**
     * Sets the value of the alcoholShopCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlcoholShopCity(String value) {
        this.alcoholShopCity = value;
    }

    /**
     * Gets the value of the alcoholShopCommune property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlcoholShopCommune() {
        return alcoholShopCommune;
    }

    /**
     * Sets the value of the alcoholShopCommune property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlcoholShopCommune(String value) {
        this.alcoholShopCommune = value;
    }

    /**
     * Gets the value of the alcoholShopCountryId property.
     * 
     */
    public int getAlcoholShopCountryId() {
        return alcoholShopCountryId;
    }

    /**
     * Sets the value of the alcoholShopCountryId property.
     * 
     */
    public void setAlcoholShopCountryId(int value) {
        this.alcoholShopCountryId = value;
    }

    /**
     * Gets the value of the alcoholShopStateId property.
     * 
     */
    public int getAlcoholShopStateId() {
        return alcoholShopStateId;
    }

    /**
     * Sets the value of the alcoholShopStateId property.
     * 
     */
    public void setAlcoholShopStateId(int value) {
        this.alcoholShopStateId = value;
    }

    /**
     * Gets the value of the alcoholPermitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlcoholPermitNumber() {
        return alcoholPermitNumber;
    }

    /**
     * Sets the value of the alcoholPermitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlcoholPermitNumber(String value) {
        this.alcoholPermitNumber = value;
    }

    /**
     * Gets the value of the alcoholPermitAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlcoholPermitAuthority() {
        return alcoholPermitAuthority;
    }

    /**
     * Sets the value of the alcoholPermitAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlcoholPermitAuthority(String value) {
        this.alcoholPermitAuthority = value;
    }

    /**
     * Gets the value of the alcoholPermitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlcoholPermitInfo() {
        return alcoholPermitInfo;
    }

    /**
     * Sets the value of the alcoholPermitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlcoholPermitInfo(String value) {
        this.alcoholPermitInfo = value;
    }

}
