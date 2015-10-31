package br.com.caelum.estoque.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import br.com.caelum.estoque.rmi.ItemEstoque;

public class TestaLeituraDeObjetos {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try(ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("itens.bin"))){
			List<ItemEstoque> itens = (List<ItemEstoque>) ois.readObject();
			itens.stream().forEach(item->{
				System.out.println("Código: " + item.getCodigo());
				System.out.println("Quantidade: " + item.getQuantidade());
				System.out.println("------------------------------");
			});
			
		}
	}
}
