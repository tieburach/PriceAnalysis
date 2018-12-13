
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
 *         &lt;element name="siteJournalDealsInfo" type="{https://webapi.allegro.pl/service.php}SiteJournalDealsInfoStruct"/>
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
    "siteJournalDealsInfo"
})
@XmlRootElement(name = "doGetSiteJournalDealsInfoResponse")
public class DoGetSiteJournalDealsInfoResponse {

    @XmlElement(required = true)
    protected SiteJournalDealsInfoStruct siteJournalDealsInfo;

    /**
     * Gets the value of the siteJournalDealsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SiteJournalDealsInfoStruct }
     *     
     */
    public SiteJournalDealsInfoStruct getSiteJournalDealsInfo() {
        return siteJournalDealsInfo;
    }

    /**
     * Sets the value of the siteJournalDealsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteJournalDealsInfoStruct }
     *     
     */
    public void setSiteJournalDealsInfo(SiteJournalDealsInfoStruct value) {
        this.siteJournalDealsInfo = value;
    }

}
