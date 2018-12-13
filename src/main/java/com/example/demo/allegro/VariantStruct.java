
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariantStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariantStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantities" type="{https://webapi.allegro.pl/service.php}ArrayOfVariantquantitystruct" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariantStruct", propOrder = {

})
public class VariantStruct {

    protected int fid;
    protected ArrayOfVariantquantitystruct quantities;

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
     * Gets the value of the quantities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVariantquantitystruct }
     *     
     */
    public ArrayOfVariantquantitystruct getQuantities() {
        return quantities;
    }

    /**
     * Sets the value of the quantities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVariantquantitystruct }
     *     
     */
    public void setQuantities(ArrayOfVariantquantitystruct value) {
        this.quantities = value;
    }

}
