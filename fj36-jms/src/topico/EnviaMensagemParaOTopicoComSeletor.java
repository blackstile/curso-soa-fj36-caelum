package topico;

import java.util.Scanner;

import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Topic;
import javax.naming.InitialContext;

public class EnviaMensagemParaOTopicoComSeletor {

	public static void main(String[] args) throws Exception {

		InitialContext ic = new InitialContext();
		ConnectionFactory factory = (ConnectionFactory) ic.lookup("jms/RemoteConnectionFactory");
		
		Topic topico = (Topic) ic.lookup("jms/TOPICO.LIVRARIA");
		try(JMSContext context = factory.createContext("jms", "jms2")){
			JMSProducer producer =  context.createProducer();
			producer.setProperty("formato", "ebook");
			Scanner scanner =  new Scanner(System.in);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				producer.send(topico, line);
			}
			scanner.close();
		}
		
	}

}
