/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.data.jws;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import za.gov.data.business.ClientFacadeLocal;

/**
 *
 * @author LeratoMusa
 */
@WebService(serviceName = "DataCentreSOAPService")
@Stateless()
public class DataCentreSOAPService {
    @EJB
    private ClientFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "addClient")
    public void addClient(@WebParam(name = "clientXML") String clientXML) throws Exception {
        ejbRef.addClient(clientXML);
    }

    @WebMethod(operationName = "editClient")
    public void editClient(@WebParam(name = "clientXML") String clientXML) throws Exception {
        ejbRef.editClient(clientXML);
    }

    @WebMethod(operationName = "deleteClient")
    public void deleteClient(@WebParam(name = "id") Long id) throws Exception {
        ejbRef.deleteClient(id);
    }
    
}
