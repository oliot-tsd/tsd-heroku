
package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSD_RegulatoryComplianceCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_RegulatoryComplianceCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:gs1:shared:shared_common:xsd:3>GS1CodeType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_RegulatoryComplianceCodeType", namespace = "urn:gs1:tsd:product_claims_and_endorsements_module:xsd:1")
public class TSDRegulatoryComplianceCodeType
    extends GS1CodeType
{


}
