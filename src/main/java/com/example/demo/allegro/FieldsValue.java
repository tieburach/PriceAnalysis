
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldsValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldsValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fvalueString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fvalueInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fvalueFloat" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="fvalueImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fvalueDatetime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fvalueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fvalueRangeInt" type="{https://webapi.allegro.pl/service.php}RangeIntValueStruct" minOccurs="0"/>
 *         &lt;element name="fvalueRangeFloat" type="{https://webapi.allegro.pl/service.php}RangeFloatValueStruct" minOccurs="0"/>
 *         &lt;element name="fvalueRangeDate" type="{https://webapi.allegro.pl/service.php}RangeDateValueStruct" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldsValue", propOrder = {

})
public class FieldsValue {

    protected int fid;
    protected String fvalueString;
    protected Integer fvalueInt;
    protected Float fvalueFloat;
    protected byte[] fvalueImage;
    protected Long fvalueDatetime;
    protected String fvalueDate;
    protected RangeIntValueStruct fvalueRangeInt;
    protected RangeFloatValueStruct fvalueRangeFloat;
    protected RangeDateValueStruct fvalueRangeDate;

    /**
     * Gets the value of the fid property.
     * 
     */
    public int getFid() {
        return fid;
    }

    /**
     * Sets the value of the fid property.
     * 
     */
    public void setFid(int value) {
        this.fid = value;
    }

    /**
     * Gets the value of the fvalueString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFvalueString() {
        return fvalueString;
    }

    /**
     * Sets the value of the fvalueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFvalueString(String value) {
        this.fvalueString = value;
    }

    /**
     * Gets the value of the fvalueInt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFvalueInt() {
        return fvalueInt;
    }

    /**
     * Sets the value of the fvalueInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFvalueInt(Integer value) {
        this.fvalueInt = value;
    }

    /**
     * Gets the value of the fvalueFloat property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFvalueFloat() {
        return fvalueFloat;
    }

    /**
     * Sets the value of the fvalueFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFvalueFloat(Float value) {
        this.fvalueFloat = value;
    }

    /**
     * Gets the value of the fvalueImage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFvalueImage() {
        return fvalueImage;
    }

    /**
     * Sets the value of the fvalueImage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFvalueImage(byte[] value) {
        this.fvalueImage = value;
    }

    /**
     * Gets the value of the fvalueDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFvalueDatetime() {
        return fvalueDatetime;
    }

    /**
     * Sets the value of the fvalueDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFvalueDatetime(Long value) {
        this.fvalueDatetime = value;
    }

    /**
     * Gets the value of the fvalueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFvalueDate() {
        return fvalueDate;
    }

    /**
     * Sets the value of the fvalueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFvalueDate(String value) {
        this.fvalueDate = value;
    }

    /**
     * Gets the value of the fvalueRangeInt property.
     * 
     * @return
     *     possible object is
     *     {@link RangeIntValueStruct }
     *     
     */
    public RangeIntValueStruct getFvalueRangeInt() {
        return fvalueRangeInt;
    }

    /**
     * Sets the value of the fvalueRangeInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeIntValueStruct }
     *     
     */
    public void setFvalueRangeInt(RangeIntValueStruct value) {
        this.fvalueRangeInt = value;
    }

    /**
     * Gets the value of the fvalueRangeFloat property.
     * 
     * @return
     *     possible object is
     *     {@link RangeFloatValueStruct }
     *     
     */
    public RangeFloatValueStruct getFvalueRangeFloat() {
        return fvalueRangeFloat;
    }

    /**
     * Sets the value of the fvalueRangeFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeFloatValueStruct }
     *     
     */
    public void setFvalueRangeFloat(RangeFloatValueStruct value) {
        this.fvalueRangeFloat = value;
    }

    /**
     * Gets the value of the fvalueRangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link RangeDateValueStruct }
     *     
     */
    public RangeDateValueStruct getFvalueRangeDate() {
        return fvalueRangeDate;
    }

    /**
     * Sets the value of the fvalueRangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeDateValueStruct }
     *     
     */
    public void setFvalueRangeDate(RangeDateValueStruct value) {
        this.fvalueRangeDate = value;
    }

}
