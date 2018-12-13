
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedPersonsStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedPersonsStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="spouseFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="spouseLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedPersonsStruct", propOrder = {

})
public class RelatedPersonsStruct {

    @XmlElement(required = true)
    protected String spouseFirstName;
    @XmlElement(required = true)
    protected String spouseLastName;

    /**
     * Gets the value of the spouseFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseFirstName() {
        return spouseFirstName;
    }

    /**
     * Sets the value of the spouseFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseFirstName(String value) {
        this.spouseFirstName = value;
    }

    /**
     * Gets the value of the spouseLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseLastName() {
        return spouseLastName;
    }

    /**
     * Sets the value of the spouseLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseLastName(String value) {
        this.spouseLastName = value;
    }

}
