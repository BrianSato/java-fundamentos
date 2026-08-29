package POO.models;

import POO.services.Notification;

public abstract class BaseNotification implements Notification {

	private String recipient;
	
	public BaseNotification() {
	}
	
	public BaseNotification(String recipient) {
		this.recipient = recipient;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	public void showRecipient() {
		System.out.println("Destinatario:" + getRecipient());
	}

}
