
package org.oliot.heroku.tsd.models.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnableAssetIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnableAssetIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grai" type="{urn:gs1:shared:shared_common:xsd:3}GRAIType"/>
 *         &lt;element name="additionalReturnableAssetIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalReturnableAssetIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnableAssetIdentificationType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "grai",
    "additionalReturnableAssetIdentification"
})
public class ReturnableAssetIdentificationType {

    @XmlElement(required = true)
    protected String grai;
    protected List<AdditionalReturnableAssetIdentificationType> additionalReturnableAssetIdentification;

    /**
     * Gets the value of the grai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrai() {
        return grai;
    }

    /**
     * Sets the value of the grai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrai(String value) {
        this.grai = value;
    }

    /**
     * Gets the value of the additionalReturnableAssetIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalReturnableAssetIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalReturnableAssetIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReturnableAssetIdentificationType }
     * 
     * 
     */
    public List<AdditionalReturnableAssetIdentificationType> getAdditionalReturnableAssetIdentification() {
        if (additionalReturnableAssetIdentification == null) {
            additionalReturnableAssetIdentification = new ArrayList<AdditionalReturnableAssetIdentificationType>();
        }
        return this.additionalReturnableAssetIdentification;
    }

}