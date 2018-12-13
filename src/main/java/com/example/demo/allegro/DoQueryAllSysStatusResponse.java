
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
 *         &lt;element name="sysCountryStatus" type="{https://webapi.allegro.pl/service.php}ArrayOfSysstatustype" minOccurs="0"/>
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
    "sysCountryStatus"
})
@XmlRootElement(name = "doQueryAllSysStatusResponse")
public class DoQueryAllSysStatusResponse {

    protected ArrayOfSysstatustype sysCountryStatus;

    /**
     * Gets the value of the sysCountryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSysstatustype }
     *     
     */
    public ArrayOfSysstatustype getSysCountryStatus() {
        return sysCountryStatus;
    }

    /**
     * Sets the value of the sysCountryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSysstatustype }
     *     
     */
    public void setSysCountryStatus(ArrayOfSysstatustype value) {
        this.sysCountryStatus = value;
    }

}
