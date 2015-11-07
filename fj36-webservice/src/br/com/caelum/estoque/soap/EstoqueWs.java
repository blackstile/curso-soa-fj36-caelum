
package br.com.caelum.estoque.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EstoqueWs", targetNamespace = "http://caelum.com.br/estoquews/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EstoqueWs {


    /**
     * 
     * @param tokenUsuario
     * @param parameters
     * @return
     *     returns br.com.caelum.ws.implementation.ItensEstoqueResponse
     */
    @WebMethod
    @WebResult(name = "itensEstoqueResponse", targetNamespace = "http://caelum.com.br/estoquews/v1", partName = "parameters")
    public ItensEstoqueResponse itensEstoque(
        @WebParam(name = "itensEstoque", targetNamespace = "http://caelum.com.br/estoquews/v1", partName = "parameters")
        ItensEstoque parameters,
        @WebParam(name = "tokenUsuario", targetNamespace = "http://caelum.com.br/estoquews/v1", header = true, partName = "tokenUsuario")
        String tokenUsuario);

}