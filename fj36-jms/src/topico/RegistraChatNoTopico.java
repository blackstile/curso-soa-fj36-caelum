package topico;

import java.util.Scanner;

import javax.jms.ConnectionFactory;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.Topic;
import javax.naming.InitialContext;

import br.com.caelum.jms.TratadorDeMensagem;

public class RegistraChatNoTopico {
	
	private static final String JNDI_NAME = "jms/TOPICO.LIVRARIA";

	public static void main(String[] args) throws Exception {
		
		InitialContext initialContext = new InitialContext();
		ConnectionFactory factory = (ConnectionFactory) initialContext.lookup("jms/RemoteConnectionFactory");
		Topic topico =  (Topic) initialContext.lookup(JNDI_NAME);
		try(JMSContext context = factory.createContext("jms", "jms2")){
			context.setClientID("William-chat");
			JMSConsumer consumer = context.createDurableConsumer(topico, "AssinaturaNotas");
			consumer.setMessageListener(new TratadorDeMensagem());
			context.start();
			Scanner teclado =  new Scanner(System.in);
			System.out.println("Financeiro esperando as mensagens");
			System.out.println("Aperte enter para fechar a conexão");
			teclado.nextLine();
			teclado.close();
			context.stop();
		}

	}

}
