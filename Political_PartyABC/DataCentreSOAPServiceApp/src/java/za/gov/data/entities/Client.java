/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.data.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LeratoMusa
 */
@Entity
@XmlRootElement
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "CLIENT_ID")
    private Long idno;
    private String firstname;
    private String lastname;
    private String dob;
    private String emailaddrs;
    private String cellnos;
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "addr_fk")
    private Address address;

    public Client() {
    }

    public Client(Long idno, String firstname, String lastname, String dob, String emailaddrs, String cellnos, Address address) {
        this.idno = idno;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.emailaddrs = emailaddrs;
        this.cellnos = cellnos;
        this.address = address;
    }

    public Long getIdno() {
        return idno;
    }

    public void setIdno(Long idno) {
        this.idno = idno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmailaddrs() {
        return emailaddrs;
    }

    public void setEmailaddrs(String emailaddrs) {
        this.emailaddrs = emailaddrs;
    }

    public String getCellnos() {
        return cellnos;
    }

    public void setCellnos(String cellnos) {
        this.cellnos = cellnos;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address Address) {
        this.address = Address;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idno != null ? idno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.idno == null && other.idno != null) || (this.idno != null && !this.idno.equals(other.idno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.gov.data.entities.Client[ id=" + idno + " ]";
    }
    
}
