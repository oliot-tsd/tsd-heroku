
package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/>
 *         &lt;element name="minimumMeasurement" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementRangeType", namespace = "urn:gs1:shared:shared_common:xsd:3", propOrder = {
    "maximumMeasurement",
    "minimumMeasurement"
})
public class MeasurementRangeType {

    protected MeasurementType maximumMeasurement;
    protected MeasurementType minimumMeasurement;

    /**
     * Gets the value of the maximumMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getMaximumMeasurement() {
        return maximumMeasurement;
    }

    /**
     * Sets the value of the maximumMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setMaximumMeasurement(MeasurementType value) {
        this.maximumMeasurement = value;
    }

    /**
     * Gets the value of the minimumMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getMinimumMeasurement() {
        return minimumMeasurement;
    }

    /**
     * Sets the value of the minimumMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setMinimumMeasurement(MeasurementType value) {
        this.minimumMeasurement = value;
    }

}
