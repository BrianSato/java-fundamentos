package POO.entities;

import POO.models.BaseNotification;

public class SmsNotification extends BaseNotification{
	
	
	public SmsNotification(String recipient) {
		super(recipient);
	}

	@Override
	public void send(String message) {
		System.out.println("Enviando SMS para: " + getRecipient());
		System.out.println("Mensagem: " + message);
	}

}
