package br.com.caelum.estoque.payfast.rest;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.caelum.payfast.modelo.Pagamento;
import br.com.caelum.payfast.modelo.Transacao;

@Path("/pagamentos")
@Singleton
public class PagamentoResource {

	private Map<Integer, Pagamento> repositorio =  new HashMap<Integer, Pagamento>();
	private Integer idPagamento = 1;
	public PagamentoResource() {
		Pagamento pagamento = new Pagamento(idPagamento++);
		pagamento.setValor(BigDecimal.TEN);
		pagamento.comStatusCriado();
		addPagamento(pagamento);
	}
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Pagamento buscaPagamento(@PathParam("id") Integer id){
		return repositorio.get(id);
	}
	
	private void addPagamento(Pagamento pagamento) {
		repositorio.put(pagamento.getId(), pagamento);
	}
	
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Path("")
	public Response criarPagamento(Transacao transacao) throws URISyntaxException{
		Pagamento pagamento = new Pagamento();
		pagamento.setId(idPagamento++);
		pagamento.setValor(transacao.getValor());
		addPagamento(pagamento);
		System.out.println("PAGAMENTO CRIADO: " +  pagamento);
		
		return Response.created(new URI("/pagamentos/"+ pagamento.getId()))
				.entity(pagamento)
				.type(MediaType.APPLICATION_JSON_TYPE)
				.build();
				
	}
	
	
	
	
}