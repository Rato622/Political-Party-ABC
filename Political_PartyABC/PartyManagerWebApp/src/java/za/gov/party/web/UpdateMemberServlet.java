/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.party.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import za.gov.party.jaxrs.client.NewJerseyClient;
import za.gov.party.jws.ExceptionException;
import za.gov.party.jws.Exception_Exception;
import za.gov.party.jws.PartyRESTService_Service;

/**
 *
 * @author Lerato
 */
public class UpdateMemberServlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/UZU-DESIGN05_8080/PartyRESTServiceApp/PartyRESTService.wsdl")
    private PartyRESTService_Service service;

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String ids = request.getParameter("id");
            Long id = Long.parseLong(request.getParameter("id"));
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String birthdate = request.getParameter("birthdate");
            String emailaddresses = request.getParameter("emailaddresses");
            String cellnumbers = request.getParameter("cellnumbers");
            String street = request.getParameter("street");
            String area = request.getParameter("area");
            String areaCode = request.getParameter("areaCode");
            
            String memberXML = generateMemberXML(id, name, surname, birthdate, emailaddresses, cellnumbers, street, area, areaCode);
            System.out.println("Detais " + memberXML);
            NewJerseyClient client = new NewJerseyClient();
            
            client.edit_XML(memberXML, ids);
            updateMember(memberXML);
            RequestDispatcher disp = request.getRequestDispatcher("update_member_outcome.jsp");
            disp.forward(request, response);
        } catch (Exception_Exception ex) {
            Logger.getLogger(UpdateMemberServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExceptionException ex) {
            Logger.getLogger(UpdateMemberServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String generateMemberXML(Long id, String name, String surname, String birthdate, String emailaddresses, String cellnumbers, String street, String area, String areaCode) {
        String memberXML = "<member>" +
                                "<id>"+id+"</id>" +
                                "<name>"+name+"</name>" +
                                "<surname>"+surname+"</surname>" +
                                "<birthdate>"+birthdate+"</birthdate>" +
                                "<emailaddresses>"+emailaddresses+"</emailaddresses>" +
                                "<cellnumbers>"+cellnumbers+"</cellnumbers>" +
                                "<address>" +
                                    "<street>"+street+"</street>" +
                                    "<area>"+area+"</area>" +
                                    "<areaCode>"+areaCode+"</areaCode>" +
                                "</address>" +
                            "</member>";
        
        return memberXML;
    }

    private void updateMember(java.lang.String memberXML) throws Exception_Exception, ExceptionException {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.gov.party.jws.PartyRESTService port = service.getPartyRESTServicePort();
        port.updateMember(memberXML);
    }
    

}
