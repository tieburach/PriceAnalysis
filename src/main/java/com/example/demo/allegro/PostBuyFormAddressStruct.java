
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostBuyFormAddressStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostBuyFormAddressStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postBuyFormAdrCountry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postBuyFormAdrStreet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormAdrPostcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormAdrCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormAdrFullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormAdrCompany" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormAdrPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormAdrNip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormCreatedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postBuyFormAdrType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="postBuyFormAdrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostBuyFormAddressStruct", propOrder = {

})
public class PostBuyFormAddressStruct {

    protected int postBuyFormAdrCountry;
    @XmlElement(required = true)
    protected String postBuyFormAdrStreet;
    @XmlElement(required = true)
    protected String postBuyFormAdrPostcode;
    @XmlElement(required = true)
    protected String postBuyFormAdrCity;
    @XmlElement(required = true)
    protected String postBuyFormAdrFullName;
    @XmlElement(required = true)
    protected String postBuyFormAdrCompany;
    @XmlElement(required = true)
    protected String postBuyFormAdrPhone;
    @XmlElement(required = true)
    protected String postBuyFormAdrNip;
    @XmlElement(required = true)
    protected String postBuyFormCreatedDate;
    protected int postBuyFormAdrType;
    protected String postBuyFormAdrId;

    /**
     * Gets the value of the postBuyFormAdrCountry property.
     * 
     */
    public int getPostBuyFormAdrCountry() {
        return postBuyFormAdrCountry;
    }

    /**
     * Sets the value of the postBuyFormAdrCountry property.
     * 
     */
    public void setPostBuyFormAdrCountry(int value) {
        this.postBuyFormAdrCountry = value;
    }

    /**
     * Gets the value of the postBuyFormAdrStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormAdrStreet() {
        return postBuyFormAdrStreet;
    }

    /**
     * Sets the value of the postBuyFormAdrStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormAdrStreet(String value) {
        this.postBuyFormAdrStreet = value;
    }

    /**
     * Gets the value of the postBuyFormAdrPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormAdrPostcode() {
        return postBuyFormAdrPostcode;
    }

    /**
     * Sets the value of the postBuyFormAdrPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormAdrPostcode(String value) {
        this.postBuyFormAdrPostcode = value;
    }

    /**
     * Gets the value of the postBuyFormAdrCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormAdrCity() {
        return postBuyFormAdrCity;
    }

    /**
     * Sets the value of the postBuyFormAdrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormAdrCity(String value) {
        this.postBuyFormAdrCity = value;
    }

    /**
     * Gets the value of the postBuyFormAdrFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormAdrFullName() {
        return postBuyFormAdrFullName;
    }

    /**
     * Sets the value of the postBuyFormAdrFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormAdrFullName(String value) {
        this.postBuyFormAdrFullName = value;
    }

    /**
     * Gets the value of the postBuyFormAdrCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormAdrCompany() {
        return postBuyFormAdrCompany;
    }

    /**
     * Sets the value of the postBuyFormAdrCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormAdrCompany(String value) {
        this.postBuyFormAdrCompany = value;
    }

    /**
     * Gets the value of the postBuyFormAdrPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormAdrPhone() {
        return postBuyFormAdrPhone;
    }

    /**
     * Sets the value of the postBuyFormAdrPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormAdrPhone(String value) {
        this.postBuyFormAdrPhone = value;
    }

    /**
     * Gets the value of the postBuyFormAdrNip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormAdrNip() {
        return postBuyFormAdrNip;
    }

    /**
     * Sets the value of the postBuyFormAdrNip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormAdrNip(String value) {
        this.postBuyFormAdrNip = value;
    }

    /**
     * Gets the value of the postBuyFormCreatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormCreatedDate() {
        return postBuyFormCreatedDate;
    }

    /**
     * Sets the value of the postBuyFormCreatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormCreatedDate(String value) {
        this.postBuyFormCreatedDate = value;
    }

    /**
     * Gets the value of the postBuyFormAdrType property.
     * 
     */
    public int getPostBuyFormAdrType() {
        return postBuyFormAdrType;
    }

    /**
     * Sets the value of the postBuyFormAdrType property.
     * 
     */
    public void setPostBuyFormAdrType(int value) {
        this.postBuyFormAdrType = value;
    }

    /**
     * Gets the value of the postBuyFormAdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBuyFormAdrId() {
        return postBuyFormAdrId;
    }

    /**
     * Sets the value of the postBuyFormAdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBuyFormAdrId(String value) {
        this.postBuyFormAdrId = value;
    }

}
