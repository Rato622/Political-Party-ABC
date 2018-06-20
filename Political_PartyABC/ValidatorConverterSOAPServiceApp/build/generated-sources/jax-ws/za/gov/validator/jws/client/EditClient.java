
package za.gov.validator.jws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editClient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editClient", propOrder = {
    "clientXML"
})
public class EditClient {

    protected String clientXML;

    /**
     * Gets the value of the clientXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientXML() {
        return clientXML;
    }

    /**
     * Sets the value of the clientXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientXML(String value) {
        this.clientXML = value;
    }

}
