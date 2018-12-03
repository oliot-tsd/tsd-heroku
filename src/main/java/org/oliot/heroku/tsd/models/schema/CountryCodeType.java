
package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryCodeType">
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
@XmlType(name = "CountryCodeType", namespace = "urn:gs1:shared:shared_common:xsd:3")
public class CountryCodeType
    extends GS1CodeType
{


}
