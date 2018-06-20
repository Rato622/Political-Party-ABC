/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.validator.jws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import za.gov.validator.common.Utility;
import za.gov.validator.jws.client.DataCentreSOAPService_Service;
import za.gov.validator.jws.client.Exception_Exception;

/**
 *
 * @author LeratoMusa
 */
@WebService(serviceName = "ValidatorConverterSOAPService")
@Stateless()
public class ValidatorConverterSOAPService {
    @WebServiceRef(wsdlLocation = "META-INF/wsdl/UZU-DESIGN05_8080/DataCentreSOAPService/DataCentreSOAPService.wsdl")
    private DataCentreSOAPService_Service service;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "forwardMember")
    public void forwardMember(@WebParam(name = "memberXML") String memberXML) throws Exception {
        String memberXSLTFile = "C:\\Users\\LeratoMusa\\Documents\\NetBeansProjects\\Re_Exam\\data\\memberXSLTFile.xsl";
        
        String clientXML = Utility.transform(memberXML, memberXSLTFile);
        addClient(clientXML);
    }

    private void addClient(java.lang.String clientXML) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.gov.validator.jws.client.DataCentreSOAPService port = service.getDataCentreSOAPServicePort();
        port.addClient(clientXML);
    }
    
    @WebMethod(operationName = "transformMember")
    public void transformMember(@WebParam(name = "memberXML") String memberXML) throws Exception {
        String memberXSLTFile = "C:\\Users\\LeratoMusa\\Documents\\NetBeansProjects\\Re_Exam\\data\\memberXSLTFile.xsl";
        
        String clientXML = Utility.transform(memberXML, memberXSLTFile);
        editClient(clientXML);
    }

    private void editClient(java.lang.String clientXML) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.gov.validator.jws.client.DataCentreSOAPService port = service.getDataCentreSOAPServicePort();
        port.editClient(clientXML);
    }
    
    @WebMethod(operationName = "editMember")
    public void editMember(@WebParam(name = "ids") String ids) throws Exception {
        Long id = Long.parseLong(ids);
   
        deleteClient(id);
    }

    private void deleteClient(java.lang.Long id) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.gov.validator.jws.client.DataCentreSOAPService port = service.getDataCentreSOAPServicePort();
        port.deleteClient(id);
    }
    
}
