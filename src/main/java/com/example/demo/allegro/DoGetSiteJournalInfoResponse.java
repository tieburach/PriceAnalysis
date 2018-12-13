
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
 *         &lt;element name="siteJournalInfo" type="{https://webapi.allegro.pl/service.php}SiteJournalInfo"/>
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
    "siteJournalInfo"
})
@XmlRootElement(name = "doGetSiteJournalInfoResponse")
public class DoGetSiteJournalInfoResponse {

    @XmlElement(required = true)
    protected SiteJournalInfo siteJournalInfo;

    /**
     * Gets the value of the siteJournalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SiteJournalInfo }
     *     
     */
    public SiteJournalInfo getSiteJournalInfo() {
        return siteJournalInfo;
    }

    /**
     * Sets the value of the siteJournalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteJournalInfo }
     *     
     */
    public void setSiteJournalInfo(SiteJournalInfo value) {
        this.siteJournalInfo = value;
    }

}
