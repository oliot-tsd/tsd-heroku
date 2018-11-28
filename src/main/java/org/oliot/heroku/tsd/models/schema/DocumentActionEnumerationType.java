
package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentActionEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentActionEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="CHANGE_BY_REFRESH"/>
 *     &lt;enumeration value="DELETE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentActionEnumerationType", namespace = "urn:gs1:shared:shared_common:xsd:3")
@XmlEnum
public enum DocumentActionEnumerationType {

    ADD,
    CHANGE_BY_REFRESH,
    DELETE;

    public String value() {
        return name();
    }

    public static DocumentActionEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
