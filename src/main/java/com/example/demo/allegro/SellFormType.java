
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sellFormId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellFormTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellFormCat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellFormType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellFormResType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellFormDefValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellFormOpt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellFormPos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellFormLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellMinValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellMaxValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellFormDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellFormOptsValues" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellFormFieldDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellFormParamId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellFormParamValues" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellFormParentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sellFormParentValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellFormUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellFormOptions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellFormType", propOrder = {

})
public class SellFormType {

    protected int sellFormId;
    @XmlElement(required = true)
    protected String sellFormTitle;
    protected int sellFormCat;
    protected int sellFormType;
    protected int sellFormResType;
    protected int sellFormDefValue;
    protected int sellFormOpt;
    protected int sellFormPos;
    protected int sellFormLength;
    @XmlElement(required = true)
    protected String sellMinValue;
    @XmlElement(required = true)
    protected String sellMaxValue;
    @XmlElement(required = true)
    protected String sellFormDesc;
    @XmlElement(required = true)
    protected String sellFormOptsValues;
    @XmlElement(required = true)
    protected String sellFormFieldDesc;
    protected int sellFormParamId;
    @XmlElement(required = true)
    protected String sellFormParamValues;
    protected int sellFormParentId;
    @XmlElement(required = true)
    protected String sellFormParentValue;
    @XmlElement(required = true)
    protected String sellFormUnit;
    protected int sellFormOptions;

    /**
     * Gets the value of the sellFormId property.
     * 
     */
    public int getSellFormId() {
        return sellFormId;
    }

    /**
     * Sets the value of the sellFormId property.
     * 
     */
    public void setSellFormId(int value) {
        this.sellFormId = value;
    }

    /**
     * Gets the value of the sellFormTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellFormTitle() {
        return sellFormTitle;
    }

    /**
     * Sets the value of the sellFormTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellFormTitle(String value) {
        this.sellFormTitle = value;
    }

    /**
     * Gets the value of the sellFormCat property.
     * 
     */
    public int getSellFormCat() {
        return sellFormCat;
    }

    /**
     * Sets the value of the sellFormCat property.
     * 
     */
    public void setSellFormCat(int value) {
        this.sellFormCat = value;
    }

    /**
     * Gets the value of the sellFormType property.
     * 
     */
    public int getSellFormType() {
        return sellFormType;
    }

    /**
     * Sets the value of the sellFormType property.
     * 
     */
    public void setSellFormType(int value) {
        this.sellFormType = value;
    }

    /**
     * Gets the value of the sellFormResType property.
     * 
     */
    public int getSellFormResType() {
        return sellFormResType;
    }

    /**
     * Sets the value of the sellFormResType property.
     * 
     */
    public void setSellFormResType(int value) {
        this.sellFormResType = value;
    }

    /**
     * Gets the value of the sellFormDefValue property.
     * 
     */
    public int getSellFormDefValue() {
        return sellFormDefValue;
    }

    /**
     * Sets the value of the sellFormDefValue property.
     * 
     */
    public void setSellFormDefValue(int value) {
        this.sellFormDefValue = value;
    }

    /**
     * Gets the value of the sellFormOpt property.
     * 
     */
    public int getSellFormOpt() {
        return sellFormOpt;
    }

    /**
     * Sets the value of the sellFormOpt property.
     * 
     */
    public void setSellFormOpt(int value) {
        this.sellFormOpt = value;
    }

    /**
     * Gets the value of the sellFormPos property.
     * 
     */
    public int getSellFormPos() {
        return sellFormPos;
    }

    /**
     * Sets the value of the sellFormPos property.
     * 
     */
    public void setSellFormPos(int value) {
        this.sellFormPos = value;
    }

    /**
     * Gets the value of the sellFormLength property.
     * 
     */
    public int getSellFormLength() {
        return sellFormLength;
    }

    /**
     * Sets the value of the sellFormLength property.
     * 
     */
    public void setSellFormLength(int value) {
        this.sellFormLength = value;
    }

    /**
     * Gets the value of the sellMinValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellMinValue() {
        return sellMinValue;
    }

    /**
     * Sets the value of the sellMinValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellMinValue(String value) {
        this.sellMinValue = value;
    }

    /**
     * Gets the value of the sellMaxValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellMaxValue() {
        return sellMaxValue;
    }

    /**
     * Sets the value of the sellMaxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellMaxValue(String value) {
        this.sellMaxValue = value;
    }

    /**
     * Gets the value of the sellFormDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellFormDesc() {
        return sellFormDesc;
    }

    /**
     * Sets the value of the sellFormDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellFormDesc(String value) {
        this.sellFormDesc = value;
    }

    /**
     * Gets the value of the sellFormOptsValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellFormOptsValues() {
        return sellFormOptsValues;
    }

    /**
     * Sets the value of the sellFormOptsValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellFormOptsValues(String value) {
        this.sellFormOptsValues = value;
    }

    /**
     * Gets the value of the sellFormFieldDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellFormFieldDesc() {
        return sellFormFieldDesc;
    }

    /**
     * Sets the value of the sellFormFieldDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellFormFieldDesc(String value) {
        this.sellFormFieldDesc = value;
    }

    /**
     * Gets the value of the sellFormParamId property.
     * 
     */
    public int getSellFormParamId() {
        return sellFormParamId;
    }

    /**
     * Sets the value of the sellFormParamId property.
     * 
     */
    public void setSellFormParamId(int value) {
        this.sellFormParamId = value;
    }

    /**
     * Gets the value of the sellFormParamValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellFormParamValues() {
        return sellFormParamValues;
    }

    /**
     * Sets the value of the sellFormParamValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellFormParamValues(String value) {
        this.sellFormParamValues = value;
    }

    /**
     * Gets the value of the sellFormParentId property.
     * 
     */
    public int getSellFormParentId() {
        return sellFormParentId;
    }

    /**
     * Sets the value of the sellFormParentId property.
     * 
     */
    public void setSellFormParentId(int value) {
        this.sellFormParentId = value;
    }

    /**
     * Gets the value of the sellFormParentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellFormParentValue() {
        return sellFormParentValue;
    }

    /**
     * Sets the value of the sellFormParentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellFormParentValue(String value) {
        this.sellFormParentValue = value;
    }

    /**
     * Gets the value of the sellFormUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellFormUnit() {
        return sellFormUnit;
    }

    /**
     * Sets the value of the sellFormUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellFormUnit(String value) {
        this.sellFormUnit = value;
    }

    /**
     * Gets the value of the sellFormOptions property.
     * 
     */
    public int getSellFormOptions() {
        return sellFormOptions;
    }

    /**
     * Sets the value of the sellFormOptions property.
     * 
     */
    public void setSellFormOptions(int value) {
        this.sellFormOptions = value;
    }

}
