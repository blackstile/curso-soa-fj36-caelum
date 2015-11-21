package br.com.caelum.jaxb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class TesteUnmarshal {

	public static void main(String[] args) throws FileNotFoundException, JAXBException {

		
		JAXBContext context = JAXBContext.newInstance(Livro.class);
		Unmarshaller unmarshal =  context.createUnmarshaller();
		Livro livro = (Livro) unmarshal.unmarshal(new File("livro.xml"));
		System.out.println(livro);

	}

}
