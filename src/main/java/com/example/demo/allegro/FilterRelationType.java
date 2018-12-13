
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterRelationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="relationAnd" type="{https://webapi.allegro.pl/service.php}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="relationOr" type="{https://webapi.allegro.pl/service.php}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="relationExclude" type="{https://webapi.allegro.pl/service.php}ArrayOfString" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterRelationType", propOrder = {

})
public class FilterRelationType {

    protected ArrayOfString relationAnd;
    protected ArrayOfString relationOr;
    protected ArrayOfString relationExclude;

    /**
     * Gets the value of the relationAnd property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRelationAnd() {
        return relationAnd;
    }

    /**
     * Sets the value of the relationAnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRelationAnd(ArrayOfString value) {
        this.relationAnd = value;
    }

    /**
     * Gets the value of the relationOr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRelationOr() {
        return relationOr;
    }

    /**
     * Sets the value of the relationOr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRelationOr(ArrayOfString value) {
        this.relationOr = value;
    }

    /**
     * Gets the value of the relationExclude property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRelationExclude() {
        return relationExclude;
    }

    /**
     * Sets the value of the relationExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRelationExclude(ArrayOfString value) {
        this.relationExclude = value;
    }

}
