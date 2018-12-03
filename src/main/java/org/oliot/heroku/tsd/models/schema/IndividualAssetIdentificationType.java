
package org.oliot.heroku.tsd.models.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualAssetIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualAssetIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="giai" type="{urn:gs1:shared:shared_common:xsd:3}GIAIType"/>
 *         &lt;element name="additionalIndividualAssetIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalIndividualAssetIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualAssetIdentificationType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "giai",
    "additionalIndividualAssetIdentification"
})
public class IndividualAssetIdentificationType {

    @XmlElement(required = true)
    protected String giai;
    protected List<AdditionalIndividualAssetIdentificationType> additionalIndividualAssetIdentification;

    /**
     * Gets the value of the giai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiai() {
        return giai;
    }

    /**
     * Sets the value of the giai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiai(String value) {
        this.giai = value;
    }

    /**
     * Gets the value of the additionalIndividualAssetIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalIndividualAssetIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalIndividualAssetIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalIndividualAssetIdentificationType }
     * 
     * 
     */
    public List<AdditionalIndividualAssetIdentificationType> getAdditionalIndividualAssetIdentification() {
        if (additionalIndividualAssetIdentification == null) {
            additionalIndividualAssetIdentification = new ArrayList<AdditionalIndividualAssetIdentificationType>();
        }
        return this.additionalIndividualAssetIdentification;
    }

}
