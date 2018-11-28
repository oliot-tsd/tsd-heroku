
package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeekendDayEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeekendDayEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SATURDAY"/>
 *     &lt;enumeration value="SUNDAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WeekendDayEnumerationType", namespace = "urn:gs1:shared:shared_common:xsd:3")
@XmlEnum
public enum WeekendDayEnumerationType {

    SATURDAY,
    SUNDAY;

    public String value() {
        return name();
    }

    public static WeekendDayEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
