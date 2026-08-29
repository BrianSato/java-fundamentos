package POO.entities;

import POO.models.BaseNotification;

public class EmailNotification extends BaseNotification{

	public EmailNotification(String recipient) {
		super(recipient);
	}

	@Override
	public void send(String message) {
		System.out.println("Enviando email para: " + getRecipient());
		System.out.println("Mensagem: " + message);
		
	}

}
