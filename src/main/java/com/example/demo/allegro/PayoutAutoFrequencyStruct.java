
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayoutAutoFrequencyStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayoutAutoFrequencyStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="frequencyType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="frequencyWeekValue" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="frequencyMonthValue" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayoutAutoFrequencyStruct", propOrder = {

})
public class PayoutAutoFrequencyStruct {

    protected short frequencyType;
    protected short frequencyWeekValue;
    protected short frequencyMonthValue;

    /**
     * Gets the value of the frequencyType property.
     * 
     */
    public short getFrequencyType() {
        return frequencyType;
    }

    /**
     * Sets the value of the frequencyType property.
     * 
     */
    public void setFrequencyType(short value) {
        this.frequencyType = value;
    }

    /**
     * Gets the value of the frequencyWeekValue property.
     * 
     */
    public short getFrequencyWeekValue() {
        return frequencyWeekValue;
    }

    /**
     * Sets the value of the frequencyWeekValue property.
     * 
     */
    public void setFrequencyWeekValue(short value) {
        this.frequencyWeekValue = value;
    }

    /**
     * Gets the value of the frequencyMonthValue property.
     * 
     */
    public short getFrequencyMonthValue() {
        return frequencyMonthValue;
    }

    /**
     * Sets the value of the frequencyMonthValue property.
     * 
     */
    public void setFrequencyMonthValue(short value) {
        this.frequencyMonthValue = value;
    }

}
