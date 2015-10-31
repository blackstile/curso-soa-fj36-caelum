package br.com.caelum.estoque.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import br.com.caelum.estoque.rmi.ItemEstoque;

public class TestaEscritaDeObjetos {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
			ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("itens.bin"));
			ItemEstoque item1 = new ItemEstoque("ARQ", 2);
			ItemEstoque item2 = new ItemEstoque("SOA", 3);
			
			List<ItemEstoque> itens =  Arrays.asList(item1, item2);
			oos.writeObject(itens);
			System.out.println(" Serializado com sucesso !");
	}
	
}
