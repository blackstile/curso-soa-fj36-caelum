package br.com.caelum.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CAT")
public class Categoria {
	
	private String nome;
	
	public Categoria(String nome) {
		this.nome =  nome;
	}
	
	public Categoria() {
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Categoria [nome=" + nome + "]";
	}
	
}
