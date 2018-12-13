
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewPostBuyFormSellerStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewPostBuyFormSellerStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sellerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellerItemIds" type="{https://webapi.allegro.pl/service.php}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="sellerShipmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellerGdId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sellerShipmentAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sellerMessageTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewPostBuyFormSellerStruct", propOrder = {

})
public class NewPostBuyFormSellerStruct {

    protected int sellerId;
    protected ArrayOfLong sellerItemIds;
    protected int sellerShipmentId;
    protected Integer sellerGdId;
    protected Float sellerShipmentAmount;
    protected String sellerMessageTo;

    /**
     * Gets the value of the sellerId property.
     * 
     */
    public int getSellerId() {
        return sellerId;
    }

    /**
     * Sets the value of the sellerId property.
     * 
     */
    public void setSellerId(int value) {
        this.sellerId = value;
    }

    /**
     * Gets the value of the sellerItemIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getSellerItemIds() {
        return sellerItemIds;
    }

    /**
     * Sets the value of the sellerItemIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setSellerItemIds(ArrayOfLong value) {
        this.sellerItemIds = value;
    }

    /**
     * Gets the value of the sellerShipmentId property.
     * 
     */
    public int getSellerShipmentId() {
        return sellerShipmentId;
    }

    /**
     * Sets the value of the sellerShipmentId property.
     * 
     */
    public void setSellerShipmentId(int value) {
        this.sellerShipmentId = value;
    }

    /**
     * Gets the value of the sellerGdId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSellerGdId() {
        return sellerGdId;
    }

    /**
     * Sets the value of the sellerGdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSellerGdId(Integer value) {
        this.sellerGdId = value;
    }

    /**
     * Gets the value of the sellerShipmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSellerShipmentAmount() {
        return sellerShipmentAmount;
    }

    /**
     * Sets the value of the sellerShipmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSellerShipmentAmount(Float value) {
        this.sellerShipmentAmount = value;
    }

    /**
     * Gets the value of the sellerMessageTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerMessageTo() {
        return sellerMessageTo;
    }

    /**
     * Sets the value of the sellerMessageTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerMessageTo(String value) {
        this.sellerMessageTo = value;
    }

}
