
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="countryArray" type="{https://webapi.allegro.pl/service.php}ArrayOfCountryinfotype" minOccurs="0"/>
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
    "countryArray"
})
@XmlRootElement(name = "doGetCountriesResponse")
public class DoGetCountriesResponse {

    protected ArrayOfCountryinfotype countryArray;

    /**
     * Gets the value of the countryArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountryinfotype }
     *     
     */
    public ArrayOfCountryinfotype getCountryArray() {
        return countryArray;
    }

    /**
     * Sets the value of the countryArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountryinfotype }
     *     
     */
    public void setCountryArray(ArrayOfCountryinfotype value) {
        this.countryArray = value;
    }

}
