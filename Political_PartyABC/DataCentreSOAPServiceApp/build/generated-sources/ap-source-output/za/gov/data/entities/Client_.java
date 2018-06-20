package za.gov.data.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.gov.data.entities.Address;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-20T10:34:57")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> firstname;
    public static volatile SingularAttribute<Client, Address> address;
    public static volatile SingularAttribute<Client, String> dob;
    public static volatile SingularAttribute<Client, String> cellnos;
    public static volatile SingularAttribute<Client, String> emailaddrs;
    public static volatile SingularAttribute<Client, Long> idno;
    public static volatile SingularAttribute<Client, String> lastname;

}