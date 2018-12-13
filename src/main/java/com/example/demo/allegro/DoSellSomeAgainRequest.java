
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
 *         &lt;element name="sellItemsArray" type="{https://webapi.allegro.pl/service.php}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="sellStartingTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sellAuctionDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellOptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="localIds" type="{https://webapi.allegro.pl/service.php}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="sellProlongOptions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "sellItemsArray",
    "sellStartingTime",
    "sellAuctionDuration",
    "sellOptions",
    "localIds",
    "sellProlongOptions"
})
@XmlRootElement(name = "DoSellSomeAgainRequest")
public class DoSellSomeAgainRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected ArrayOfLong sellItemsArray;
    protected Long sellStartingTime;
    protected int sellAuctionDuration;
    protected Integer sellOptions;
    protected ArrayOfInt localIds;
    protected Integer sellProlongOptions;

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
     * Gets the value of the sellItemsArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getSellItemsArray() {
        return sellItemsArray;
    }

    /**
     * Sets the value of the sellItemsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setSellItemsArray(ArrayOfLong value) {
        this.sellItemsArray = value;
    }

    /**
     * Gets the value of the sellStartingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSellStartingTime() {
        return sellStartingTime;
    }

    /**
     * Sets the value of the sellStartingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSellStartingTime(Long value) {
        this.sellStartingTime = value;
    }

    /**
     * Gets the value of the sellAuctionDuration property.
     * 
     */
    public int getSellAuctionDuration() {
        return sellAuctionDuration;
    }

    /**
     * Sets the value of the sellAuctionDuration property.
     * 
     */
    public void setSellAuctionDuration(int value) {
        this.sellAuctionDuration = value;
    }

    /**
     * Gets the value of the sellOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSellOptions() {
        return sellOptions;
    }

    /**
     * Sets the value of the sellOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSellOptions(Integer value) {
        this.sellOptions = value;
    }

    /**
     * Gets the value of the localIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getLocalIds() {
        return localIds;
    }

    /**
     * Sets the value of the localIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setLocalIds(ArrayOfInt value) {
        this.localIds = value;
    }

    /**
     * Gets the value of the sellProlongOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSellProlongOptions() {
        return sellProlongOptions;
    }

    /**
     * Sets the value of the sellProlongOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSellProlongOptions(Integer value) {
        this.sellProlongOptions = value;
    }

}
