
package za.gov.validator.jws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the za.gov.validator.jws.client package. 
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

    private final static QName _Exception_QNAME = new QName("http://jws.data.gov.za/", "Exception");
    private final static QName _AddClient_QNAME = new QName("http://jws.data.gov.za/", "addClient");
    private final static QName _AddClientResponse_QNAME = new QName("http://jws.data.gov.za/", "addClientResponse");
    private final static QName _DeleteClient_QNAME = new QName("http://jws.data.gov.za/", "deleteClient");
    private final static QName _DeleteClientResponse_QNAME = new QName("http://jws.data.gov.za/", "deleteClientResponse");
    private final static QName _EditClient_QNAME = new QName("http://jws.data.gov.za/", "editClient");
    private final static QName _EditClientResponse_QNAME = new QName("http://jws.data.gov.za/", "editClientResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.gov.validator.jws.client
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
     * Create an instance of {@link AddClient }
     * 
     */
    public AddClient createAddClient() {
        return new AddClient();
    }

    /**
     * Create an instance of {@link AddClientResponse }
     * 
     */
    public AddClientResponse createAddClientResponse() {
        return new AddClientResponse();
    }

    /**
     * Create an instance of {@link DeleteClient }
     * 
     */
    public DeleteClient createDeleteClient() {
        return new DeleteClient();
    }

    /**
     * Create an instance of {@link DeleteClientResponse }
     * 
     */
    public DeleteClientResponse createDeleteClientResponse() {
        return new DeleteClientResponse();
    }

    /**
     * Create an instance of {@link EditClient }
     * 
     */
    public EditClient createEditClient() {
        return new EditClient();
    }

    /**
     * Create an instance of {@link EditClientResponse }
     * 
     */
    public EditClientResponse createEditClientResponse() {
        return new EditClientResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.data.gov.za/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.data.gov.za/", name = "addClient")
    public JAXBElement<AddClient> createAddClient(AddClient value) {
        return new JAXBElement<AddClient>(_AddClient_QNAME, AddClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.data.gov.za/", name = "addClientResponse")
    public JAXBElement<AddClientResponse> createAddClientResponse(AddClientResponse value) {
        return new JAXBElement<AddClientResponse>(_AddClientResponse_QNAME, AddClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.data.gov.za/", name = "deleteClient")
    public JAXBElement<DeleteClient> createDeleteClient(DeleteClient value) {
        return new JAXBElement<DeleteClient>(_DeleteClient_QNAME, DeleteClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.data.gov.za/", name = "deleteClientResponse")
    public JAXBElement<DeleteClientResponse> createDeleteClientResponse(DeleteClientResponse value) {
        return new JAXBElement<DeleteClientResponse>(_DeleteClientResponse_QNAME, DeleteClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.data.gov.za/", name = "editClient")
    public JAXBElement<EditClient> createEditClient(EditClient value) {
        return new JAXBElement<EditClient>(_EditClient_QNAME, EditClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.data.gov.za/", name = "editClientResponse")
    public JAXBElement<EditClientResponse> createEditClientResponse(EditClientResponse value) {
        return new JAXBElement<EditClientResponse>(_EditClientResponse_QNAME, EditClientResponse.class, null, value);
    }

}
