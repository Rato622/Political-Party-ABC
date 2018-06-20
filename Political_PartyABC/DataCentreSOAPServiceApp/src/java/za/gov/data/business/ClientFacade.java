/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.data.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.gov.data.common.Utility;
import za.gov.data.entities.Client;

/**
 *
 * @author LeratoMusa
 */
@Stateless
public class ClientFacade extends AbstractFacade<Client> implements ClientFacadeLocal {

    @PersistenceContext(unitName = "DataCentreSOAPServiceAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientFacade() {
        super(Client.class);
    }

    @Override
    public void addClient(String clientXML) throws Exception {
        String clientXSDFile = "C:\\Users\\LeratoMusa\\Documents\\NetBeansProjects\\Re_Exam\\data\\clientXSDFile.xsd";

        if (Utility.validate(clientXML, clientXSDFile)) {
            Client client = (Client) Utility.unmarshal(clientXML, Client.class);
            create(client);
        } else {
            throw new Exception("This XML File is not Valid");
        }
    }

    @Override
    public void editClient(String clientXML) throws Exception {
        String clientXSDFile = "C:\\Users\\LeratoMusa\\Documents\\NetBeansProjects\\Re_Exam\\data\\clientXSDFile.xsd";

        if (Utility.validate(clientXML, clientXSDFile)) {
            Client client = (Client) Utility.unmarshal(clientXML, Client.class);

            edit(client);
        } else {
            throw new Exception("This XML File is not Valid");
        }
    }

    @Override
    public void deleteClient(Long id) throws Exception {
        Client client = em.find(Client.class, id);
        em.remove(client);
    }

}
