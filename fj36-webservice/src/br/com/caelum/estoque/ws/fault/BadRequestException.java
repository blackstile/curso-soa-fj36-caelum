package br.com.caelum.estoque.ws.fault;

import javax.xml.ws.WebFault;

@WebFault
public class BadRequestException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BadRequestException(String message) {
		super(message);
	}

}
