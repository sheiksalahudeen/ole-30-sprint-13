
package org.kuali.ole.docstore.model.xmlpojo.work.instance.oleml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.xml.bind.annotation.*;


/**
 * Created by IntelliJ IDEA.
 * User: Pranitha
 * Date: 8/17/12
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 * <p>Java class for shelvingScheme complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="shelvingScheme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fullValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typeOrSource" type="{http://ole.kuali.org/standards/ole-instance}typeOrSource"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shelvingScheme", namespace = "http://ole.kuali.org/standards/ole-instance", propOrder = {
        "codeValue",
        "fullValue",
        "typeOrSource"
})
@XStreamAlias("shelvingScheme")
@XmlRootElement(name = "shelvingScheme", namespace = "http://ole.kuali.org/standards/ole-instance")
public class ShelvingScheme {

    @XmlElement(namespace = "http://ole.kuali.org/standards/ole-instance", required = true)
    protected String codeValue;
    @XmlElement(namespace = "http://ole.kuali.org/standards/ole-instance", required = true)
    protected String fullValue;
    @XmlElement(namespace = "http://ole.kuali.org/standards/ole-instance", required = true)
    protected TypeOrSource typeOrSource;

    /**
     * Gets the value of the codeValue property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * Sets the value of the codeValue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodeValue(String value) {
        this.codeValue = value;
    }

    /**
     * Gets the value of the fullValue property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFullValue() {
        return fullValue;
    }

    /**
     * Sets the value of the fullValue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFullValue(String value) {
        this.fullValue = value;
    }

    /**
     * Gets the value of the typeOrSource property.
     *
     * @return possible object is
     *         {@link TypeOrSource }
     */
    public TypeOrSource getTypeOrSource() {
        return typeOrSource;
    }

    /**
     * Sets the value of the typeOrSource property.
     *
     * @param value allowed object is
     *              {@link TypeOrSource }
     */
    public void setTypeOrSource(TypeOrSource value) {
        this.typeOrSource = value;
    }

}
