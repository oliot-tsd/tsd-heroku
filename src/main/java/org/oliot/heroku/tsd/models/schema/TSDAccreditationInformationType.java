
package org.oliot.heroku.tsd.models.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSD_AccreditationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_AccreditationInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accreditationCode" type="{urn:gs1:tsd:product_claims_and_endorsements_module:xsd:1}TSD_AccreditationCodeType" minOccurs="0"/>
 *         &lt;element name="accreditationText" type="{urn:gs1:shared:shared_common:xsd:3}Description200Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="avpList" type="{urn:gs1:tsd:tsd_common:xsd:1}TSD_AttributeValuePairListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_AccreditationInformationType", namespace = "urn:gs1:tsd:product_claims_and_endorsements_module:xsd:1", propOrder = {
    "accreditationCode",
    "accreditationText",
    "avpList"
})
public class TSDAccreditationInformationType {

    protected TSDAccreditationCodeType accreditationCode;
    protected List<Description200Type> accreditationText;
    protected TSDAttributeValuePairListType avpList;

    /**
     * Gets the value of the accreditationCode property.
     * 
     * @return
     *     possible object is
     *     {@link TSDAccreditationCodeType }
     *     
     */
    public TSDAccreditationCodeType getAccreditationCode() {
        return accreditationCode;
    }

    /**
     * Sets the value of the accreditationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDAccreditationCodeType }
     *     
     */
    public void setAccreditationCode(TSDAccreditationCodeType value) {
        this.accreditationCode = value;
    }

    /**
     * Gets the value of the accreditationText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accreditationText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccreditationText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description200Type }
     * 
     * 
     */
    public List<Description200Type> getAccreditationText() {
        if (accreditationText == null) {
            accreditationText = new ArrayList<Description200Type>();
        }
        return this.accreditationText;
    }

    /**
     * Gets the value of the avpList property.
     * 
     * @return
     *     possible object is
     *     {@link TSDAttributeValuePairListType }
     *     
     */
    public TSDAttributeValuePairListType getAvpList() {
        return avpList;
    }

    /**
     * Sets the value of the avpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDAttributeValuePairListType }
     *     
     */
    public void setAvpList(TSDAttributeValuePairListType value) {
        this.avpList = value;
    }

}
