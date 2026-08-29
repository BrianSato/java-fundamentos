package POO.applications;

import POO.entities.EmailNotification;
import POO.entities.SmsNotification;
import POO.services.Notification;

public class exercicio11Notification {

	public static void main(String[] args) {
		
		Notification notification;
		
		sendNotification(new EmailNotification("brian02@gmail.com"));
		sendNotification(new SmsNotification("(12) 9 99240-4647"));
		
	}
	
	public static void sendNotification(Notification notification) {
		notification.send("Seu pedido foi enviado!");
	}

}
