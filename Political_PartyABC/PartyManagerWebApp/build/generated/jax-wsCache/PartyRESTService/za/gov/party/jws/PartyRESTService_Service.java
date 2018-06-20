
package za.gov.party.jws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PartyRESTService", targetNamespace = "http://jws.party.gov.za/", wsdlLocation = "http://UZU-DESIGN05:8080/PartyRESTServiceApp/PartyRESTService?wsdl")
public class PartyRESTService_Service
    extends Service
{

    private final static URL PARTYRESTSERVICE_WSDL_LOCATION;
    private final static WebServiceException PARTYRESTSERVICE_EXCEPTION;
    private final static QName PARTYRESTSERVICE_QNAME = new QName("http://jws.party.gov.za/", "PartyRESTService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://UZU-DESIGN05:8080/PartyRESTServiceApp/PartyRESTService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PARTYRESTSERVICE_WSDL_LOCATION = url;
        PARTYRESTSERVICE_EXCEPTION = e;
    }

    public PartyRESTService_Service() {
        super(__getWsdlLocation(), PARTYRESTSERVICE_QNAME);
    }

    public PartyRESTService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PARTYRESTSERVICE_QNAME, features);
    }

    public PartyRESTService_Service(URL wsdlLocation) {
        super(wsdlLocation, PARTYRESTSERVICE_QNAME);
    }

    public PartyRESTService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PARTYRESTSERVICE_QNAME, features);
    }

    public PartyRESTService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PartyRESTService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PartyRESTService
     */
    @WebEndpoint(name = "PartyRESTServicePort")
    public PartyRESTService getPartyRESTServicePort() {
        return super.getPort(new QName("http://jws.party.gov.za/", "PartyRESTServicePort"), PartyRESTService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PartyRESTService
     */
    @WebEndpoint(name = "PartyRESTServicePort")
    public PartyRESTService getPartyRESTServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jws.party.gov.za/", "PartyRESTServicePort"), PartyRESTService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PARTYRESTSERVICE_EXCEPTION!= null) {
            throw PARTYRESTSERVICE_EXCEPTION;
        }
        return PARTYRESTSERVICE_WSDL_LOCATION;
    }

}