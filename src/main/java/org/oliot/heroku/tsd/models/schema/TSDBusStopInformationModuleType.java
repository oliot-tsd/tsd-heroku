
package org.oliot.heroku.tsd.models.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSD_BusStopInformationModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSD_BusStopInformationModuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refBuses" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_MultipleStringValueMetaType"/>
 *         &lt;element name="shortID" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_SingleStringValueMetaType"/>
 *         &lt;element name="busStopCount" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_MultipleIntValueMetaType"/>
 *         &lt;element name="Name" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_SingleStringValueMetaType"/>
 *         &lt;element name="location" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_GeoJSONLocationType"/>
 *         &lt;element name="Address" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_AddressType"/>
 *         &lt;element name="dateModified" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_SingleStringValueMetaType"/>
 *         &lt;element name="refBusLines" type="{urn:gs1:tsd:bus_stop_information_module:xsd:1}TSD_MultipleStringValueMetaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSD_BusStopInformationModuleType", namespace = "urn:gs1:tsd:bus_stop_information_module:xsd:1", propOrder = {
    "refBuses",
    "shortID",
    "busStopCount",
    "name",
    "location",
    "address",
    "dateModified",
    "refBusLines"
})
public class TSDBusStopInformationModuleType {

    @XmlElement(required = true)
    protected TSDMultipleStringValueMetaType refBuses;
    @XmlElement(required = true)
    protected TSDSingleStringValueMetaType shortID;
    @XmlElement(required = true)
    protected TSDMultipleIntValueMetaType busStopCount;
    @XmlElement(name = "Name", required = true)
    protected TSDSingleStringValueMetaType name;
    @XmlElement(required = true)
    protected TSDGeoJSONLocationType location;
    @XmlElement(name = "Address", required = true)
    protected TSDAddressType address;
    @XmlElement(required = true)
    protected TSDSingleStringValueMetaType dateModified;
    @XmlElement(required = true)
    protected TSDMultipleStringValueMetaType refBusLines;

    /**
     * Gets the value of the refBuses property.
     * 
     * @return
     *     possible object is
     *     {@link TSDMultipleStringValueMetaType }
     *     
     */
    public TSDMultipleStringValueMetaType getRefBuses() {
        return refBuses;
    }

    /**
     * Sets the value of the refBuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDMultipleStringValueMetaType }
     *     
     */
    public void setRefBuses(TSDMultipleStringValueMetaType value) {
        this.refBuses = value;
    }

    /**
     * Gets the value of the shortID property.
     * 
     * @return
     *     possible object is
     *     {@link TSDSingleStringValueMetaType }
     *     
     */
    public TSDSingleStringValueMetaType getShortID() {
        return shortID;
    }

    /**
     * Sets the value of the shortID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDSingleStringValueMetaType }
     *     
     */
    public void setShortID(TSDSingleStringValueMetaType value) {
        this.shortID = value;
    }

    /**
     * Gets the value of the busStopCount property.
     * 
     * @return
     *     possible object is
     *     {@link TSDMultipleIntValueMetaType }
     *     
     */
    public TSDMultipleIntValueMetaType getBusStopCount() {
        return busStopCount;
    }

    /**
     * Sets the value of the busStopCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDMultipleIntValueMetaType }
     *     
     */
    public void setBusStopCount(TSDMultipleIntValueMetaType value) {
        this.busStopCount = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TSDSingleStringValueMetaType }
     *     
     */
    public TSDSingleStringValueMetaType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDSingleStringValueMetaType }
     *     
     */
    public void setName(TSDSingleStringValueMetaType value) {
        this.name = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link TSDGeoJSONLocationType }
     *     
     */
    public TSDGeoJSONLocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDGeoJSONLocationType }
     *     
     */
    public void setLocation(TSDGeoJSONLocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link TSDAddressType }
     *     
     */
    public TSDAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDAddressType }
     *     
     */
    public void setAddress(TSDAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the dateModified property.
     * 
     * @return
     *     possible object is
     *     {@link TSDSingleStringValueMetaType }
     *     
     */
    public TSDSingleStringValueMetaType getDateModified() {
        return dateModified;
    }

    /**
     * Sets the value of the dateModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDSingleStringValueMetaType }
     *     
     */
    public void setDateModified(TSDSingleStringValueMetaType value) {
        this.dateModified = value;
    }

    /**
     * Gets the value of the refBusLines property.
     * 
     * @return
     *     possible object is
     *     {@link TSDMultipleStringValueMetaType }
     *     
     */
    public TSDMultipleStringValueMetaType getRefBusLines() {
        return refBusLines;
    }

    /**
     * Sets the value of the refBusLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDMultipleStringValueMetaType }
     *     
     */
    public void setRefBusLines(TSDMultipleStringValueMetaType value) {
        this.refBusLines = value;
    }

}
