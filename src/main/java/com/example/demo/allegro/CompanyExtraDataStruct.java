
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyExtraDataStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyExtraDataStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="companyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyNip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyRegon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyKrs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyActivitySort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyExtraDataStruct", propOrder = {

})
public class CompanyExtraDataStruct {

    @XmlElement(required = true)
    protected String companyType;
    @XmlElement(required = true)
    protected String companyNip;
    @XmlElement(required = true)
    protected String companyRegon;
    @XmlElement(required = true)
    protected String companyKrs;
    @XmlElement(required = true)
    protected String companyActivitySort;

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyType(String value) {
        this.companyType = value;
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

    /**
     * Gets the value of the companyRegon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegon() {
        return companyRegon;
    }

    /**
     * Sets the value of the companyRegon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegon(String value) {
        this.companyRegon = value;
    }

    /**
     * Gets the value of the companyKrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyKrs() {
        return companyKrs;
    }

    /**
     * Sets the value of the companyKrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyKrs(String value) {
        this.companyKrs = value;
    }

    /**
     * Gets the value of the companyActivitySort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyActivitySort() {
        return companyActivitySort;
    }

    /**
     * Sets the value of the companyActivitySort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyActivitySort(String value) {
        this.companyActivitySort = value;
    }

}
