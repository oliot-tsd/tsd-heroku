
package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for GS1CodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GS1CodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:gs1:shared:shared_common:xsd:3>String80Type">
 *       &lt;attribute name="codeListVersion">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="35"/>
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
@XmlType(name = "GS1CodeType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "value"
})
@XmlSeeAlso({
    FinancialAccountNumberTypeCodeType.class,
    AdditionalTradeItemIdentificationTypeCodeType.class,
    IncotermsCodeType.class,
    AdditionalReturnableAssetIdentificationTypeCodeType.class,
    AdditionalShipmentIdentificationTypeCodeType.class,
    PaymentMethodCodeType.class,
    MeasurementUnitCodeType.class,
    FinancialRoutingNumberTypeCodeType.class,
    CommunicationChannelCodeType.class,
    AllowanceChargeTypeCodeType.class,
    TemperatureMeasurementUnitCodeType.class,
    AdditionalPartyIdentificationTypeCodeType.class,
    NutrientTypeCodeType.class,
    TimeMeasurementUnitCodeType.class,
    AdditionalIndividualAssetIdentificationTypeCodeType.class,
    AdditionalConsignmentIdentificationTypeCodeType.class,
    TaxCategoryCodeType.class,
    CountrySubdivisionCodeType.class,
    ContactTypeCodeType.class,
    LanguageCodeType.class,
    PaymentTermsTypeCodeType.class,
    AdditionalServiceRelationIdentificationTypeCodeType.class,
    EntityTypeCodeType.class,
    AdditionalLogisticUnitIdentificationTypeCodeType.class,
    CountryCodeType.class,
    CurrencyCodeType.class,
    BarCodeTypeCodeType.class,
    PartyRoleCodeType.class,
    DateFormatCodeType.class,
    TSDMeasurementPrecisionCodeType.class,
    TSDProductInformationTypeCodeType.class,
    TSDImageTypeCodeType.class,
    TSDPartyContactRoleCodeType.class,
    TSDPreparationTypeCodeType.class,
    TSDNutrientTypeCodeType.class,
    TSDPreparationStateCodeType.class,
    TSDAllergenTypeCodeType.class,
    TSDLevelOfContainmentCodeType.class,
    TSDDietaryClaimCodeType.class,
    TSDRegulatoryComplianceCodeType.class,
    TSDNutritionalClaimCodeType.class,
    TSDAccreditationCodeType.class,
    TSDProductActivityTypeCodeType.class
})
public class GS1CodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "codeListVersion")
    protected String codeListVersion;

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
     * Gets the value of the codeListVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListVersion() {
        return codeListVersion;
    }

    /**
     * Sets the value of the codeListVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListVersion(String value) {
        this.codeListVersion = value;
    }

}
