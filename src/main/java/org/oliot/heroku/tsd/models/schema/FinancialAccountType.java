
package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="financialAccountNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="financialAccountNumberTypeCode" type="{urn:gs1:shared:shared_common:xsd:3}FinancialAccountNumberTypeCodeType"/>
 *         &lt;element name="financialAccountName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAccountType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "financialAccountNumber",
    "financialAccountNumberTypeCode",
    "financialAccountName"
})
public class FinancialAccountType {

    @XmlElement(required = true)
    protected String financialAccountNumber;
    @XmlElement(required = true)
    protected FinancialAccountNumberTypeCodeType financialAccountNumberTypeCode;
    protected String financialAccountName;

    /**
     * Gets the value of the financialAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialAccountNumber() {
        return financialAccountNumber;
    }

    /**
     * Sets the value of the financialAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialAccountNumber(String value) {
        this.financialAccountNumber = value;
    }

    /**
     * Gets the value of the financialAccountNumberTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountNumberTypeCodeType }
     *     
     */
    public FinancialAccountNumberTypeCodeType getFinancialAccountNumberTypeCode() {
        return financialAccountNumberTypeCode;
    }

    /**
     * Sets the value of the financialAccountNumberTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountNumberTypeCodeType }
     *     
     */
    public void setFinancialAccountNumberTypeCode(FinancialAccountNumberTypeCodeType value) {
        this.financialAccountNumberTypeCode = value;
    }

    /**
     * Gets the value of the financialAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialAccountName() {
        return financialAccountName;
    }

    /**
     * Sets the value of the financialAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialAccountName(String value) {
        this.financialAccountName = value;
    }

}