/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.data.business;

import javax.ejb.Local;

/**
 *
 * @author LeratoMusa
 */
@Local
public interface ClientFacadeLocal {

//    void create(Client client);
//
//    void edit(Client client);
//
//    void remove(Client client);
//
//    Client find(Object id);
//
//    List<Client> findAll();
//
//    List<Client> findRange(int[] range);
//
//    int count();
    public void addClient(String clientXML)throws Exception;
    
    public void editClient(String clientXML) throws Exception;
    
    public void deleteClient(Long id) throws Exception;
}
