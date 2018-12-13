
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
 *         &lt;element name="arrayItemListInfo" type="{https://webapi.allegro.pl/service.php}ArrayOfIteminfostruct" minOccurs="0"/>
 *         &lt;element name="arrayItemsNotFound" type="{https://webapi.allegro.pl/service.php}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="arrayItemsAdminKilled" type="{https://webapi.allegro.pl/service.php}ArrayOfLong" minOccurs="0"/>
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
    "arrayItemListInfo",
    "arrayItemsNotFound",
    "arrayItemsAdminKilled"
})
@XmlRootElement(name = "doGetItemsInfoResponse")
public class DoGetItemsInfoResponse {

    protected ArrayOfIteminfostruct arrayItemListInfo;
    protected ArrayOfLong arrayItemsNotFound;
    protected ArrayOfLong arrayItemsAdminKilled;

    /**
     * Gets the value of the arrayItemListInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIteminfostruct }
     *     
     */
    public ArrayOfIteminfostruct getArrayItemListInfo() {
        return arrayItemListInfo;
    }

    /**
     * Sets the value of the arrayItemListInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIteminfostruct }
     *     
     */
    public void setArrayItemListInfo(ArrayOfIteminfostruct value) {
        this.arrayItemListInfo = value;
    }

    /**
     * Gets the value of the arrayItemsNotFound property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getArrayItemsNotFound() {
        return arrayItemsNotFound;
    }

    /**
     * Sets the value of the arrayItemsNotFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setArrayItemsNotFound(ArrayOfLong value) {
        this.arrayItemsNotFound = value;
    }

    /**
     * Gets the value of the arrayItemsAdminKilled property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getArrayItemsAdminKilled() {
        return arrayItemsAdminKilled;
    }

    /**
     * Sets the value of the arrayItemsAdminKilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setArrayItemsAdminKilled(ArrayOfLong value) {
        this.arrayItemsAdminKilled = value;
    }

}
