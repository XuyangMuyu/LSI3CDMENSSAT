//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.04 at 10:12:58 PM CET 
//


package fr.enssat.beans;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}orgUnit"/>
 *         &lt;element ref="{}program"/>
 *         &lt;element ref="{}course" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="language" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orgUnit",
    "program",
    "course"
})
@XmlRootElement(name = "CDM")
@Entity(name = "CDM")
@Table(name = "CDM")
@Inheritance(strategy = InheritanceType.JOINED)
public class CDM
    implements Equals, HashCode
{

    @XmlElement(required = true)
    protected OrgUnit orgUnit;
    @XmlElement(required = true)
    protected Program program;
    @XmlElement(required = true)
    protected List<Course> course;
    @XmlAttribute(name = "language", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String language;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the orgUnit property.
     * 
     * @return
     *     possible object is
     *     {@link OrgUnit }
     *     
     */
    @ManyToOne(targetEntity = OrgUnit.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORGUNIT_CDM_HJID")
    public OrgUnit getOrgUnit() {
        return orgUnit;
    }

    /**
     * Sets the value of the orgUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgUnit }
     *     
     */
    public void setOrgUnit(OrgUnit value) {
        this.orgUnit = value;
    }

    /**
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link Program }
     *     
     */
    @ManyToOne(targetEntity = Program.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROGRAM_CDM_HJID")
    public Program getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link Program }
     *     
     */
    public void setProgram(Program value) {
        this.program = value;
    }

    /**
     * Gets the value of the course property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the course property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Course }
     * 
     * 
     */
    @OneToMany(targetEntity = Course.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COURSE_CDM_HJID")
    public List<Course> getCourse() {
        if (course == null) {
            course = new ArrayList<Course>();
        }
        return this.course;
    }

    /**
     * 
     * 
     */
    public void setCourse(List<Course> course) {
        this.course = course;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LANGUAGE_", length = 255)
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CDM)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CDM that = ((CDM) object);
        {
            OrgUnit lhsOrgUnit;
            lhsOrgUnit = this.getOrgUnit();
            OrgUnit rhsOrgUnit;
            rhsOrgUnit = that.getOrgUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgUnit", lhsOrgUnit), LocatorUtils.property(thatLocator, "orgUnit", rhsOrgUnit), lhsOrgUnit, rhsOrgUnit)) {
                return false;
            }
        }
        {
            Program lhsProgram;
            lhsProgram = this.getProgram();
            Program rhsProgram;
            rhsProgram = that.getProgram();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "program", lhsProgram), LocatorUtils.property(thatLocator, "program", rhsProgram), lhsProgram, rhsProgram)) {
                return false;
            }
        }
        {
            List<Course> lhsCourse;
            lhsCourse = (((this.course!= null)&&(!this.course.isEmpty()))?this.getCourse():null);
            List<Course> rhsCourse;
            rhsCourse = (((that.course!= null)&&(!that.course.isEmpty()))?that.getCourse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "course", lhsCourse), LocatorUtils.property(thatLocator, "course", rhsCourse), lhsCourse, rhsCourse)) {
                return false;
            }
        }
        {
            String lhsLanguage;
            lhsLanguage = this.getLanguage();
            String rhsLanguage;
            rhsLanguage = that.getLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "language", lhsLanguage), LocatorUtils.property(thatLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            OrgUnit theOrgUnit;
            theOrgUnit = this.getOrgUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgUnit", theOrgUnit), currentHashCode, theOrgUnit);
        }
        {
            Program theProgram;
            theProgram = this.getProgram();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "program", theProgram), currentHashCode, theProgram);
        }
        {
            List<Course> theCourse;
            theCourse = (((this.course!= null)&&(!this.course.isEmpty()))?this.getCourse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "course", theCourse), currentHashCode, theCourse);
        }
        {
            String theLanguage;
            theLanguage = this.getLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "language", theLanguage), currentHashCode, theLanguage);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
