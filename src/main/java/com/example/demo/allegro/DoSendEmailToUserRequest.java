
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
 *         &lt;element name="mailToUserItemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mailToUserReceiverId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mailToUserSubjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mailToUserOption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mailToUserMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "mailToUserItemId",
    "mailToUserReceiverId",
    "mailToUserSubjectId",
    "mailToUserOption",
    "mailToUserMessage"
})
@XmlRootElement(name = "DoSendEmailToUserRequest")
public class DoSendEmailToUserRequest {

    @XmlElement(required = true)
    protected String sessionHandle;
    protected long mailToUserItemId;
    protected long mailToUserReceiverId;
    protected Integer mailToUserSubjectId;
    protected Integer mailToUserOption;
    @XmlElement(required = true)
    protected String mailToUserMessage;

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
     * Gets the value of the mailToUserItemId property.
     * 
     */
    public long getMailToUserItemId() {
        return mailToUserItemId;
    }

    /**
     * Sets the value of the mailToUserItemId property.
     * 
     */
    public void setMailToUserItemId(long value) {
        this.mailToUserItemId = value;
    }

    /**
     * Gets the value of the mailToUserReceiverId property.
     * 
     */
    public long getMailToUserReceiverId() {
        return mailToUserReceiverId;
    }

    /**
     * Sets the value of the mailToUserReceiverId property.
     * 
     */
    public void setMailToUserReceiverId(long value) {
        this.mailToUserReceiverId = value;
    }

    /**
     * Gets the value of the mailToUserSubjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMailToUserSubjectId() {
        return mailToUserSubjectId;
    }

    /**
     * Sets the value of the mailToUserSubjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMailToUserSubjectId(Integer value) {
        this.mailToUserSubjectId = value;
    }

    /**
     * Gets the value of the mailToUserOption property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMailToUserOption() {
        return mailToUserOption;
    }

    /**
     * Sets the value of the mailToUserOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMailToUserOption(Integer value) {
        this.mailToUserOption = value;
    }

    /**
     * Gets the value of the mailToUserMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailToUserMessage() {
        return mailToUserMessage;
    }

    /**
     * Sets the value of the mailToUserMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailToUserMessage(String value) {
        this.mailToUserMessage = value;
    }

}
