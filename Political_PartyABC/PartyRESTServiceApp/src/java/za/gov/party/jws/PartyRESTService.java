/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.party.jws;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import za.gov.party.entities.Member;
import za.gov.party.jaxrs.MemberFacadeREST;
import za.gov.validator.jws.Exception_Exception;

/**
 *
 * @author LeratoMusa
 */
@WebService(serviceName = "PartyRESTService")
public class PartyRESTService {
    @EJB
    private MemberFacadeREST ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Member entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Member entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Member find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findRange")
    public List<Member> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Member entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "addMember")
    public void addMember(@WebParam(name = "memberXML") String memberXML) throws Exception_Exception, Exception {
        ejbRef.addMember(memberXML);
    }

    @WebMethod(operationName = "updateMember")
    public void updateMember(@WebParam(name = "memberXML") String memberXML) throws Exception_Exception, Exception {
        ejbRef.updateMember(memberXML);
    }

    @WebMethod(operationName = "edit_1")
    @RequestWrapper(className = "edit_1")
    @Oneway
    public void edit(@WebParam(name = "id") Long id, @WebParam(name = "entity") Member entity) {
        ejbRef.edit(id, entity);
    }

    @WebMethod(operationName = "remove_1")
    @RequestWrapper(className = "remove_1")
    public void remove(@WebParam(name = "id") Long id) throws Exception_Exception {
        ejbRef.remove(id);
    }

    @WebMethod(operationName = "find_1")
    @RequestWrapper(className = "find_1")
    @ResponseWrapper(className = "find_1Response")
    public Member find(@WebParam(name = "id") Long id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Member> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange_1")
    @RequestWrapper(className = "findRange_1")
    @ResponseWrapper(className = "findRange_1Response")
    public List<Member> findRange(@WebParam(name = "from") Integer from, @WebParam(name = "to") Integer to) {
        return ejbRef.findRange(from, to);
    }

    @WebMethod(operationName = "countREST")
    public String countREST() {
        return ejbRef.countREST();
    }
    
}
