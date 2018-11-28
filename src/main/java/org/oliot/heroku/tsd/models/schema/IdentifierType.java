
package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for IdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifierType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:gs1:shared:shared_common:xsd:3>String80Type">
 *       &lt;attribute name="identificationSchemeAgencyCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="80"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="identificationSchemeAgencyCodeCodeListVersion">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="35"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="identificationSchemeAgencyName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="80"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="identificationSchemeName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="80"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "value"
})
public class IdentifierType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "identificationSchemeAgencyCode")
    protected String identificationSchemeAgencyCode;
    @XmlAttribute(name = "identificationSchemeAgencyCodeCodeListVersion")
    protected String identificationSchemeAgencyCodeCodeListVersion;
    @XmlAttribute(name = "identificationSchemeAgencyName")
    protected String identificationSchemeAgencyName;
    @XmlAttribute(name = "identificationSchemeName")
    protected String identificationSchemeName;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the identificationSchemeAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationSchemeAgencyCode() {
        return identificationSchemeAgencyCode;
    }

    /**
     * Sets the value of the identificationSchemeAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationSchemeAgencyCode(String value) {
        this.identificationSchemeAgencyCode = value;
    }

    /**
     * Gets the value of the identificationSchemeAgencyCodeCodeListVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationSchemeAgencyCodeCodeListVersion() {
        return identificationSchemeAgencyCodeCodeListVersion;
    }

    /**
     * Sets the value of the identificationSchemeAgencyCodeCodeListVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationSchemeAgencyCodeCodeListVersion(String value) {
        this.identificationSchemeAgencyCodeCodeListVersion = value;
    }

    /**
     * Gets the value of the identificationSchemeAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationSchemeAgencyName() {
        return identificationSchemeAgencyName;
    }

    /**
     * Sets the value of the identificationSchemeAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationSchemeAgencyName(String value) {
        this.identificationSchemeAgencyName = value;
    }

    /**
     * Gets the value of the identificationSchemeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationSchemeName() {
        return identificationSchemeName;
    }

    /**
     * Sets the value of the identificationSchemeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationSchemeName(String value) {
        this.identificationSchemeName = value;
    }

}
