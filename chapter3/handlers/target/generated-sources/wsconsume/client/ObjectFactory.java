
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _SayHiResponse_QNAME = new QName("http://hello.world.ns/", "sayHiResponse");
    private final static QName _Greetings_QNAME = new QName("http://hello.world.ns/", "greetings");
    private final static QName _GreetingsResponse_QNAME = new QName("http://hello.world.ns/", "greetingsResponse");
    private final static QName _SayHi_QNAME = new QName("http://hello.world.ns/", "sayHi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link Greetings }
     * 
     */
    public Greetings createGreetings() {
        return new Greetings();
    }

    /**
     * Create an instance of {@link GreetingsResponse }
     * 
     */
    public GreetingsResponse createGreetingsResponse() {
        return new GreetingsResponse();
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hello.world.ns/", name = "sayHiResponse")
    public JAXBElement<SayHiResponse> createSayHiResponse(SayHiResponse value) {
        return new JAXBElement<SayHiResponse>(_SayHiResponse_QNAME, SayHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Greetings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hello.world.ns/", name = "greetings")
    public JAXBElement<Greetings> createGreetings(Greetings value) {
        return new JAXBElement<Greetings>(_Greetings_QNAME, Greetings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hello.world.ns/", name = "greetingsResponse")
    public JAXBElement<GreetingsResponse> createGreetingsResponse(GreetingsResponse value) {
        return new JAXBElement<GreetingsResponse>(_GreetingsResponse_QNAME, GreetingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hello.world.ns/", name = "sayHi")
    public JAXBElement<SayHi> createSayHi(SayHi value) {
        return new JAXBElement<SayHi>(_SayHi_QNAME, SayHi.class, null, value);
    }

}
