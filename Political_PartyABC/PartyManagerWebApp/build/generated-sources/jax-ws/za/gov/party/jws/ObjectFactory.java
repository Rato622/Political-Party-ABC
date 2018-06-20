
package za.gov.party.jws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the za.gov.party.jws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://jws.party.gov.za/", "Exception");
    private final static QName _AddMember_QNAME = new QName("http://jws.party.gov.za/", "addMember");
    private final static QName _AddMemberResponse_QNAME = new QName("http://jws.party.gov.za/", "addMemberResponse");
    private final static QName _Address_QNAME = new QName("http://jws.party.gov.za/", "address");
    private final static QName _Count_QNAME = new QName("http://jws.party.gov.za/", "count");
    private final static QName _CountREST_QNAME = new QName("http://jws.party.gov.za/", "countREST");
    private final static QName _CountRESTResponse_QNAME = new QName("http://jws.party.gov.za/", "countRESTResponse");
    private final static QName _CountResponse_QNAME = new QName("http://jws.party.gov.za/", "countResponse");
    private final static QName _Create_QNAME = new QName("http://jws.party.gov.za/", "create");
    private final static QName _Edit_QNAME = new QName("http://jws.party.gov.za/", "edit");
    private final static QName _Edit1_QNAME = new QName("http://jws.party.gov.za/", "edit_1");
    private final static QName _Find_QNAME = new QName("http://jws.party.gov.za/", "find");
    private final static QName _FindAll_QNAME = new QName("http://jws.party.gov.za/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://jws.party.gov.za/", "findAllResponse");
    private final static QName _FindRange_QNAME = new QName("http://jws.party.gov.za/", "findRange");
    private final static QName _FindRangeResponse_QNAME = new QName("http://jws.party.gov.za/", "findRangeResponse");
    private final static QName _FindRange1_QNAME = new QName("http://jws.party.gov.za/", "findRange_1");
    private final static QName _FindRange1Response_QNAME = new QName("http://jws.party.gov.za/", "findRange_1Response");
    private final static QName _FindResponse_QNAME = new QName("http://jws.party.gov.za/", "findResponse");
    private final static QName _Find1_QNAME = new QName("http://jws.party.gov.za/", "find_1");
    private final static QName _Find1Response_QNAME = new QName("http://jws.party.gov.za/", "find_1Response");
    private final static QName _Member_QNAME = new QName("http://jws.party.gov.za/", "member");
    private final static QName _Remove_QNAME = new QName("http://jws.party.gov.za/", "remove");
    private final static QName _Remove1_QNAME = new QName("http://jws.party.gov.za/", "remove_1");
    private final static QName _Remove1Response_QNAME = new QName("http://jws.party.gov.za/", "remove_1Response");
    private final static QName _UpdateMember_QNAME = new QName("http://jws.party.gov.za/", "updateMember");
    private final static QName _UpdateMemberResponse_QNAME = new QName("http://jws.party.gov.za/", "updateMemberResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.gov.party.jws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link AddMember }
     * 
     */
    public AddMember createAddMember() {
        return new AddMember();
    }

    /**
     * Create an instance of {@link AddMemberResponse }
     * 
     */
    public AddMemberResponse createAddMemberResponse() {
        return new AddMemberResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link CountREST }
     * 
     */
    public CountREST createCountREST() {
        return new CountREST();
    }

    /**
     * Create an instance of {@link CountRESTResponse }
     * 
     */
    public CountRESTResponse createCountRESTResponse() {
        return new CountRESTResponse();
    }

    /**
     * Create an instance of {@link CountResponse }
     * 
     */
    public CountResponse createCountResponse() {
        return new CountResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link Edit1 }
     * 
     */
    public Edit1 createEdit1() {
        return new Edit1();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link FindRange }
     * 
     */
    public FindRange createFindRange() {
        return new FindRange();
    }

    /**
     * Create an instance of {@link FindRangeResponse }
     * 
     */
    public FindRangeResponse createFindRangeResponse() {
        return new FindRangeResponse();
    }

    /**
     * Create an instance of {@link FindRange1 }
     * 
     */
    public FindRange1 createFindRange1() {
        return new FindRange1();
    }

    /**
     * Create an instance of {@link FindRange1Response }
     * 
     */
    public FindRange1Response createFindRange1Response() {
        return new FindRange1Response();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link Find1 }
     * 
     */
    public Find1 createFind1() {
        return new Find1();
    }

    /**
     * Create an instance of {@link Find1Response }
     * 
     */
    public Find1Response createFind1Response() {
        return new Find1Response();
    }

    /**
     * Create an instance of {@link Member }
     * 
     */
    public Member createMember() {
        return new Member();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link Remove1 }
     * 
     */
    public Remove1 createRemove1() {
        return new Remove1();
    }

    /**
     * Create an instance of {@link Remove1Response }
     * 
     */
    public Remove1Response createRemove1Response() {
        return new Remove1Response();
    }

    /**
     * Create an instance of {@link UpdateMember }
     * 
     */
    public UpdateMember createUpdateMember() {
        return new UpdateMember();
    }

    /**
     * Create an instance of {@link UpdateMemberResponse }
     * 
     */
    public UpdateMemberResponse createUpdateMemberResponse() {
        return new UpdateMemberResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "addMember")
    public JAXBElement<AddMember> createAddMember(AddMember value) {
        return new JAXBElement<AddMember>(_AddMember_QNAME, AddMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "addMemberResponse")
    public JAXBElement<AddMemberResponse> createAddMemberResponse(AddMemberResponse value) {
        return new JAXBElement<AddMemberResponse>(_AddMemberResponse_QNAME, AddMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountREST }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "countREST")
    public JAXBElement<CountREST> createCountREST(CountREST value) {
        return new JAXBElement<CountREST>(_CountREST_QNAME, CountREST.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountRESTResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "countRESTResponse")
    public JAXBElement<CountRESTResponse> createCountRESTResponse(CountRESTResponse value) {
        return new JAXBElement<CountRESTResponse>(_CountRESTResponse_QNAME, CountRESTResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "edit_1")
    public JAXBElement<Edit1> createEdit1(Edit1 value) {
        return new JAXBElement<Edit1>(_Edit1_QNAME, Edit1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "findRange")
    public JAXBElement<FindRange> createFindRange(FindRange value) {
        return new JAXBElement<FindRange>(_FindRange_QNAME, FindRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "findRangeResponse")
    public JAXBElement<FindRangeResponse> createFindRangeResponse(FindRangeResponse value) {
        return new JAXBElement<FindRangeResponse>(_FindRangeResponse_QNAME, FindRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "findRange_1")
    public JAXBElement<FindRange1> createFindRange1(FindRange1 value) {
        return new JAXBElement<FindRange1>(_FindRange1_QNAME, FindRange1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "findRange_1Response")
    public JAXBElement<FindRange1Response> createFindRange1Response(FindRange1Response value) {
        return new JAXBElement<FindRange1Response>(_FindRange1Response_QNAME, FindRange1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "find_1")
    public JAXBElement<Find1> createFind1(Find1 value) {
        return new JAXBElement<Find1>(_Find1_QNAME, Find1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "find_1Response")
    public JAXBElement<Find1Response> createFind1Response(Find1Response value) {
        return new JAXBElement<Find1Response>(_Find1Response_QNAME, Find1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Member }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "member")
    public JAXBElement<Member> createMember(Member value) {
        return new JAXBElement<Member>(_Member_QNAME, Member.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "remove_1")
    public JAXBElement<Remove1> createRemove1(Remove1 value) {
        return new JAXBElement<Remove1>(_Remove1_QNAME, Remove1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "remove_1Response")
    public JAXBElement<Remove1Response> createRemove1Response(Remove1Response value) {
        return new JAXBElement<Remove1Response>(_Remove1Response_QNAME, Remove1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "updateMember")
    public JAXBElement<UpdateMember> createUpdateMember(UpdateMember value) {
        return new JAXBElement<UpdateMember>(_UpdateMember_QNAME, UpdateMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.party.gov.za/", name = "updateMemberResponse")
    public JAXBElement<UpdateMemberResponse> createUpdateMemberResponse(UpdateMemberResponse value) {
        return new JAXBElement<UpdateMemberResponse>(_UpdateMemberResponse_QNAME, UpdateMemberResponse.class, null, value);
    }

}
