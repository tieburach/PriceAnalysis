
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
 *         &lt;element name="sessionHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finishItemsList" type="{https://webapi.allegro.pl/service.php}ArrayOfFinishitemsstruct" minOccurs="0"/>
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
    "sessionHandle",
    "finishItemsList"
})
@XmlRootElement(name = "DoFinishItemsRequest")
public class DoFinishItemsRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected ArrayOfFinishitemsstruct finishItemsList;

    /**
     * Gets the value of the sessionHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionHandle() {
        return sessionHandle;
    }

    /**
     * Sets the value of the sessionHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionHandle(String value) {
        this.sessionHandle = value;
    }

    /**
     * Gets the value of the finishItemsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFinishitemsstruct }
     *     
     */
    public ArrayOfFinishitemsstruct getFinishItemsList() {
        return finishItemsList;
    }

    /**
     * Sets the value of the finishItemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFinishitemsstruct }
     *     
     */
    public void setFinishItemsList(ArrayOfFinishitemsstruct value) {
        this.finishItemsList = value;
    }

}
