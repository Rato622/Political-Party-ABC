package za.gov.party.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.gov.party.entities.Address;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-20T11:54:46")
@StaticMetamodel(Member.class)
public class Member_ { 

    public static volatile SingularAttribute<Member, String> birthdate;
    public static volatile SingularAttribute<Member, String> cellnumbers;
    public static volatile SingularAttribute<Member, Address> address;
    public static volatile SingularAttribute<Member, String> emailaddresses;
    public static volatile SingularAttribute<Member, String> surname;
    public static volatile SingularAttribute<Member, String> name;
    public static volatile SingularAttribute<Member, Long> id;

}