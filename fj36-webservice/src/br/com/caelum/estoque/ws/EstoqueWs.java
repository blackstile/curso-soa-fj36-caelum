package br.com.caelum.estoque.ws;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ws.rs.BadRequestException;

import br.com.caelum.estoque.ws.fault.AutorizacaoException;


@Stateless
@WebService(targetNamespace="http://caelum.com.br/estoquews/v1")
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
	
	@WebMethod(operationName="itensEstoque")
	@WebResult(name="itemEstoque")
	public List<ItemEstoque> getQuantidade(
			@WebParam(name="codigos") List<String> codigos, 
			@WebParam(name="tokenUsuario", header=true) String token){
		if (token == null || !token.equalsIgnoreCase("token123")){
			throw new AutorizacaoException("Não autorizado");
		}
		if (codigos == null || codigos.isEmpty()){
			throw new BadRequestException("Informe ao menos um código do livro por favor!");
		}
		return codigos.stream()
				.map(codigo->repositorio.get(codigo))
				.collect(Collectors.toList());

	}
	

}
