
package br.com.caelum.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.caelum.soap package. 
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

    private final static QName _TokenUsuario_QNAME = new QName("http://caelum.com.br/estoquews/v1", "tokenUsuario");
    private final static QName _ItensEstoqueResponse_QNAME = new QName("http://caelum.com.br/estoquews/v1", "itensEstoqueResponse");
    private final static QName _ItensEstoque_QNAME = new QName("http://caelum.com.br/estoquews/v1", "itensEstoque");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.caelum.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItensEstoque }
     * 
     */
    public ItensEstoque createItensEstoque() {
        return new ItensEstoque();
    }

    /**
     * Create an instance of {@link ItensEstoqueResponse }
     * 
     */
    public ItensEstoqueResponse createItensEstoqueResponse() {
        return new ItensEstoqueResponse();
    }

    /**
     * Create an instance of {@link ItemEstoque }
     * 
     */
    public ItemEstoque createItemEstoque() {
        return new ItemEstoque();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caelum.com.br/estoquews/v1", name = "tokenUsuario")
    public JAXBElement<String> createTokenUsuario(String value) {
        return new JAXBElement<String>(_TokenUsuario_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItensEstoqueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caelum.com.br/estoquews/v1", name = "itensEstoqueResponse")
    public JAXBElement<ItensEstoqueResponse> createItensEstoqueResponse(ItensEstoqueResponse value) {
        return new JAXBElement<ItensEstoqueResponse>(_ItensEstoqueResponse_QNAME, ItensEstoqueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItensEstoque }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caelum.com.br/estoquews/v1", name = "itensEstoque")
    public JAXBElement<ItensEstoque> createItensEstoque(ItensEstoque value) {
        return new JAXBElement<ItensEstoque>(_ItensEstoque_QNAME, ItensEstoque.class, null, value);
    }

}
