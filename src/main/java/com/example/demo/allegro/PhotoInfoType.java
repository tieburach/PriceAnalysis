
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhotoInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhotoInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="photoSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="photoUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="photoIsMain" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhotoInfoType", propOrder = {

})
public class PhotoInfoType {

    @XmlElement(required = true)
    protected String photoSize;
    @XmlElement(required = true)
    protected String photoUrl;
    protected boolean photoIsMain;

    /**
     * Gets the value of the photoSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoSize() {
        return photoSize;
    }

    /**
     * Sets the value of the photoSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoSize(String value) {
        this.photoSize = value;
    }

    /**
     * Gets the value of the photoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * Sets the value of the photoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoUrl(String value) {
        this.photoUrl = value;
    }

    /**
     * Gets the value of the photoIsMain property.
     * 
     */
    public boolean isPhotoIsMain() {
        return photoIsMain;
    }

    /**
     * Sets the value of the photoIsMain property.
     * 
     */
    public void setPhotoIsMain(boolean value) {
        this.photoIsMain = value;
    }

}
