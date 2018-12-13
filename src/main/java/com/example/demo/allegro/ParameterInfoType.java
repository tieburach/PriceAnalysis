
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParameterInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParameterInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="parameterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parameterValue" type="{https://webapi.allegro.pl/service.php}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="parameterUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parameterIsRange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterInfoType", propOrder = {

})
public class ParameterInfoType {

    @XmlElement(required = true)
    protected String parameterName;
    protected ArrayOfString parameterValue;
    @XmlElement(required = true)
    protected String parameterUnit;
    protected boolean parameterIsRange;

    /**
     * Gets the value of the parameterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * Sets the value of the parameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterName(String value) {
        this.parameterName = value;
    }

    /**
     * Gets the value of the parameterValue property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getParameterValue() {
        return parameterValue;
    }

    /**
     * Sets the value of the parameterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setParameterValue(ArrayOfString value) {
        this.parameterValue = value;
    }

    /**
     * Gets the value of the parameterUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterUnit() {
        return parameterUnit;
    }

    /**
     * Sets the value of the parameterUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterUnit(String value) {
        this.parameterUnit = value;
    }

    /**
     * Gets the value of the parameterIsRange property.
     * 
     */
    public boolean isParameterIsRange() {
        return parameterIsRange;
    }

    /**
     * Sets the value of the parameterIsRange property.
     * 
     */
    public void setParameterIsRange(boolean value) {
        this.parameterIsRange = value;
    }

}
