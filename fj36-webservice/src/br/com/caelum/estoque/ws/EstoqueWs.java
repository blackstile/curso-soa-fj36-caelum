package br.com.caelum.estoque.ws;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;


@Stateless
@WebService
public class EstoqueWs {

	private Map<String, ItemEstoque> repositorio = new HashMap<String, ItemEstoque>();

	public EstoqueWs() {
		repositorio.put("ARQ", new ItemEstoque("ARQ", 5));
		repositorio.put("SOA", new ItemEstoque("SOA", 2));
		repositorio.put("TDD", new ItemEstoque("TDD", 3));
		repositorio.put("RES", new ItemEstoque("RES", 4));
		repositorio.put("LOG", new ItemEstoque("LOG", 3));
		repositorio.put("WEB", new ItemEstoque("WEB", 4));
	}
	
	@WebMethod
	public ItemEstoque getQuantidade(String codigo){
		return repositorio.get(codigo);
	}
	

}
