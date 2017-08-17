
package org.oliot.heroku.tsd.models.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gln" type="{urn:gs1:shared:shared_common:xsd:3}GLNType"/>
 *         &lt;element name="additionalPartyIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalPartyIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "gln",
    "additionalPartyIdentification"
})
public class PartyIdentificationType {

    @XmlElement(required = true)
    protected String gln;
    protected List<AdditionalPartyIdentificationType> additionalPartyIdentification;

    /**
     * Gets the value of the gln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGln() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGln(String value) {
        this.gln = value;
    }

    /**
     * Gets the value of the additionalPartyIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalPartyIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalPartyIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalPartyIdentificationType }
     * 
     * 
     */
    public List<AdditionalPartyIdentificationType> getAdditionalPartyIdentification() {
        if (additionalPartyIdentification == null) {
            additionalPartyIdentification = new ArrayList<AdditionalPartyIdentificationType>();
        }
        return this.additionalPartyIdentification;
    }

}
