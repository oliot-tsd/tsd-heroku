
package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllowanceOrChargeEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllowanceOrChargeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALLOWANCE"/>
 *     &lt;enumeration value="CHARGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllowanceOrChargeEnumerationType", namespace = "urn:gs1:shared:shared_common:xsd:3")
@XmlEnum
public enum AllowanceOrChargeEnumerationType {

    ALLOWANCE,
    CHARGE;

    public String value() {
        return name();
    }

    public static AllowanceOrChargeEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
