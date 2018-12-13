
package com.example.demo.allegro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteJournalDealsInfoStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteJournalDealsInfoStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dealEventsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dealLastEventTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteJournalDealsInfoStruct", propOrder = {

})
public class SiteJournalDealsInfoStruct {

    protected int dealEventsCount;
    protected long dealLastEventTime;

    /**
     * Gets the value of the dealEventsCount property.
     * 
     */
    public int getDealEventsCount() {
        return dealEventsCount;
    }

    /**
     * Sets the value of the dealEventsCount property.
     * 
     */
    public void setDealEventsCount(int value) {
        this.dealEventsCount = value;
    }

    /**
     * Gets the value of the dealLastEventTime property.
     * 
     */
    public long getDealLastEventTime() {
        return dealLastEventTime;
    }

    /**
     * Sets the value of the dealLastEventTime property.
     * 
     */
    public void setDealLastEventTime(long value) {
        this.dealLastEventTime = value;
    }

}
