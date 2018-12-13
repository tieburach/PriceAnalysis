
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryTreeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryTreeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryParentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="categoryItemsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryTreeType", propOrder = {

})
public class CategoryTreeType {

    protected int categoryId;
    @XmlElement(required = true)
    protected String categoryName;
    protected int categoryParentId;
    protected int categoryItemsCount;

    /**
     * Gets the value of the categoryId property.
     * 
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     */
    public void setCategoryId(int value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the categoryParentId property.
     * 
     */
    public int getCategoryParentId() {
        return categoryParentId;
    }

    /**
     * Sets the value of the categoryParentId property.
     * 
     */
    public void setCategoryParentId(int value) {
        this.categoryParentId = value;
    }

    /**
     * Gets the value of the categoryItemsCount property.
     * 
     */
    public int getCategoryItemsCount() {
        return categoryItemsCount;
    }

    /**
     * Sets the value of the categoryItemsCount property.
     * 
     */
    public void setCategoryItemsCount(int value) {
        this.categoryItemsCount = value;
    }

}
