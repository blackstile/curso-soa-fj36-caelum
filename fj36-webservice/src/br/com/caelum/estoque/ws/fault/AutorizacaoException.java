package br.com.caelum.estoque.ws.fault;

import javax.xml.ws.WebFault;

@WebFault(messageName="autoriazacaoError")
public class AutorizacaoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AutorizacaoException(String message) {
		super(message);
	}

}
