/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.party.jaxrs;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.ws.WebServiceRef;
import za.gov.party.common.Utility;
import za.gov.party.entities.Member;
import za.gov.validator.jws.Exception_Exception;
import za.gov.validator.jws.ValidatorConverterSOAPService_Service;

/**
 *
 * @author Lerato
 */
@Stateless
@Path("za.gov.party.entities.member")
public class MemberFacadeREST extends AbstractFacade<Member> {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/UZU-DESIGN05_8080/ValidatorConverterSOAPService/ValidatorConverterSOAPService.wsdl")
    private ValidatorConverterSOAPService_Service service;
    @PersistenceContext(unitName = "PartyRESTServiceAppPU")
    private EntityManager em;

    public MemberFacadeREST() {
        super(Member.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Member entity) {
        super.create(entity);
    }
    
    public void addMember(String memberXML) throws Exception_Exception, Exception{
        String memberXSDFile = "C:\\Users\\LeratoMusa\\Documents\\NetBeansProjects\\Re_Exam\\data\\memberXSDFile.xsd";
        if(Utility.validate(memberXML, memberXSDFile))
        {
            Member member = (Member) Utility.unmarshal(memberXML, Member.class);
            forwardMember(memberXML);
        }
        
    }
    
    public void updateMember(String memberXML) throws Exception_Exception, Exception{
        String memberXSDFile = "C:\\Users\\LeratoMusa\\Documents\\NetBeansProjects\\Re_Exam\\data\\memberXSDFile.xsd";
        if(Utility.validate(memberXML, memberXSDFile))
        {
            Member member = (Member) Utility.unmarshal(memberXML, Member.class);
            transformMember(memberXML);
        }
        
    }
    
    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Long id, Member entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) throws Exception_Exception {
        String ids = id.toString();
        editMember(ids);
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Member find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Member> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Member> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    private void forwardMember(java.lang.String memberXML) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.gov.validator.jws.ValidatorConverterSOAPService port = service.getValidatorConverterSOAPServicePort();
        port.forwardMember(memberXML);
    }

    private void editMember(java.lang.String ids) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.gov.validator.jws.ValidatorConverterSOAPService port = service.getValidatorConverterSOAPServicePort();
        port.editMember(ids);
    }

    private void transformMember(java.lang.String memberXML) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.gov.validator.jws.ValidatorConverterSOAPService port = service.getValidatorConverterSOAPServicePort();
        port.transformMember(memberXML);
    }
    
}
