
package za.gov.validator.jws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the za.gov.validator.jws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://jws.validator.gov.za/", "Exception");
    private final static QName _EditMember_QNAME = new QName("http://jws.validator.gov.za/", "editMember");
    private final static QName _EditMemberResponse_QNAME = new QName("http://jws.validator.gov.za/", "editMemberResponse");
    private final static QName _ForwardMember_QNAME = new QName("http://jws.validator.gov.za/", "forwardMember");
    private final static QName _ForwardMemberResponse_QNAME = new QName("http://jws.validator.gov.za/", "forwardMemberResponse");
    private final static QName _TransformMember_QNAME = new QName("http://jws.validator.gov.za/", "transformMember");
    private final static QName _TransformMemberResponse_QNAME = new QName("http://jws.validator.gov.za/", "transformMemberResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.gov.validator.jws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link EditMember }
     * 
     */
    public EditMember createEditMember() {
        return new EditMember();
    }

    /**
     * Create an instance of {@link EditMemberResponse }
     * 
     */
    public EditMemberResponse createEditMemberResponse() {
        return new EditMemberResponse();
    }

    /**
     * Create an instance of {@link ForwardMember }
     * 
     */
    public ForwardMember createForwardMember() {
        return new ForwardMember();
    }

    /**
     * Create an instance of {@link ForwardMemberResponse }
     * 
     */
    public ForwardMemberResponse createForwardMemberResponse() {
        return new ForwardMemberResponse();
    }

    /**
     * Create an instance of {@link TransformMember }
     * 
     */
    public TransformMember createTransformMember() {
        return new TransformMember();
    }

    /**
     * Create an instance of {@link TransformMemberResponse }
     * 
     */
    public TransformMemberResponse createTransformMemberResponse() {
        return new TransformMemberResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.gov.za/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.gov.za/", name = "editMember")
    public JAXBElement<EditMember> createEditMember(EditMember value) {
        return new JAXBElement<EditMember>(_EditMember_QNAME, EditMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.gov.za/", name = "editMemberResponse")
    public JAXBElement<EditMemberResponse> createEditMemberResponse(EditMemberResponse value) {
        return new JAXBElement<EditMemberResponse>(_EditMemberResponse_QNAME, EditMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.gov.za/", name = "forwardMember")
    public JAXBElement<ForwardMember> createForwardMember(ForwardMember value) {
        return new JAXBElement<ForwardMember>(_ForwardMember_QNAME, ForwardMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.gov.za/", name = "forwardMemberResponse")
    public JAXBElement<ForwardMemberResponse> createForwardMemberResponse(ForwardMemberResponse value) {
        return new JAXBElement<ForwardMemberResponse>(_ForwardMemberResponse_QNAME, ForwardMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.gov.za/", name = "transformMember")
    public JAXBElement<TransformMember> createTransformMember(TransformMember value) {
        return new JAXBElement<TransformMember>(_TransformMember_QNAME, TransformMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.gov.za/", name = "transformMemberResponse")
    public JAXBElement<TransformMemberResponse> createTransformMemberResponse(TransformMemberResponse value) {
        return new JAXBElement<TransformMemberResponse>(_TransformMemberResponse_QNAME, TransformMemberResponse.class, null, value);
    }

}
