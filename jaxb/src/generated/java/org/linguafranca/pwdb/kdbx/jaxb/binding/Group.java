//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.09 at 03:20:50 PM BST 
//


package org.linguafranca.pwdb.kdbx.jaxb.binding;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{}uuid"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IconID" type="{}iconId"/&gt;
 *         &lt;element ref="{}Times"/&gt;
 *         &lt;element name="IsExpanded" type="{}keepassBoolean"/&gt;
 *         &lt;element name="DefaultAutoTypeSequence" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EnableAutoType" type="{}keepassBoolean"/&gt;
 *         &lt;element name="EnableSearching" type="{}keepassBoolean"/&gt;
 *         &lt;element name="LastTopVisibleEntry" type="{}uuidRef"/&gt;
 *         &lt;element ref="{}Entry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}Group" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uuid",
    "name",
    "notes",
    "iconID",
    "times",
    "isExpanded",
    "defaultAutoTypeSequence",
    "enableAutoType",
    "enableSearching",
    "lastTopVisibleEntry",
    "entry",
    "group"
})
@XmlRootElement(name = "Group")
public class Group {

    @XmlElement(name = "UUID", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "base64Binary")
    protected UUID uuid;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Notes", required = true)
    protected String notes;
    @XmlElement(name = "IconID")
    protected int iconID;
    @XmlElement(name = "Times", required = true)
    protected Times times;
    @XmlElement(name = "IsExpanded", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Boolean isExpanded;
    @XmlElement(name = "DefaultAutoTypeSequence", required = true)
    protected String defaultAutoTypeSequence;
    @XmlElement(name = "EnableAutoType", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Boolean enableAutoType;
    @XmlElement(name = "EnableSearching", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Boolean enableSearching;
    @XmlElement(name = "LastTopVisibleEntry", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "base64Binary")
    protected UUID lastTopVisibleEntry;
    @XmlElement(name = "Entry")
    protected List<Entry> entry;
    @XmlElement(name = "Group")
    protected List<Group> group;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the iconID property.
     * 
     */
    public int getIconID() {
        return iconID;
    }

    /**
     * Sets the value of the iconID property.
     * 
     */
    public void setIconID(int value) {
        this.iconID = value;
    }

    /**
     * Gets the value of the times property.
     * 
     * @return
     *     possible object is
     *     {@link Times }
     *     
     */
    public Times getTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     * @param value
     *     allowed object is
     *     {@link Times }
     *     
     */
    public void setTimes(Times value) {
        this.times = value;
    }

    /**
     * Gets the value of the isExpanded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean getIsExpanded() {
        return isExpanded;
    }

    /**
     * Sets the value of the isExpanded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsExpanded(Boolean value) {
        this.isExpanded = value;
    }

    /**
     * Gets the value of the defaultAutoTypeSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAutoTypeSequence() {
        return defaultAutoTypeSequence;
    }

    /**
     * Sets the value of the defaultAutoTypeSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAutoTypeSequence(String value) {
        this.defaultAutoTypeSequence = value;
    }

    /**
     * Gets the value of the enableAutoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean getEnableAutoType() {
        return enableAutoType;
    }

    /**
     * Sets the value of the enableAutoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableAutoType(Boolean value) {
        this.enableAutoType = value;
    }

    /**
     * Gets the value of the enableSearching property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean getEnableSearching() {
        return enableSearching;
    }

    /**
     * Sets the value of the enableSearching property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableSearching(Boolean value) {
        this.enableSearching = value;
    }

    /**
     * Gets the value of the lastTopVisibleEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public UUID getLastTopVisibleEntry() {
        return lastTopVisibleEntry;
    }

    /**
     * Sets the value of the lastTopVisibleEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTopVisibleEntry(UUID value) {
        this.lastTopVisibleEntry = value;
    }

    /**
     * Gets the value of the entry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entry }
     * 
     * 
     */
    public List<Entry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<Entry>();
        }
        return this.entry;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * 
     * 
     */
    public List<Group> getGroup() {
        if (group == null) {
            group = new ArrayList<Group>();
        }
        return this.group;
    }

}