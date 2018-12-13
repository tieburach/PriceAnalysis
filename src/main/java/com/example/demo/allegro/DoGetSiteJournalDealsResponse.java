
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
 *         &lt;element name="siteJournalDeals" type="{https://webapi.allegro.pl/service.php}ArrayOfSitejournaldealsstruct" minOccurs="0"/>
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
    "siteJournalDeals"
})
@XmlRootElement(name = "doGetSiteJournalDealsResponse")
public class DoGetSiteJournalDealsResponse {

    protected ArrayOfSitejournaldealsstruct siteJournalDeals;

    /**
     * Gets the value of the siteJournalDeals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSitejournaldealsstruct }
     *     
     */
    public ArrayOfSitejournaldealsstruct getSiteJournalDeals() {
        return siteJournalDeals;
    }

    /**
     * Sets the value of the siteJournalDeals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSitejournaldealsstruct }
     *     
     */
    public void setSiteJournalDeals(ArrayOfSitejournaldealsstruct value) {
        this.siteJournalDeals = value;
    }

}
