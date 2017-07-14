package model;

import observer.ChatUser;

public class Message {
	private String text;
	private ChatUser recipient;

	public Message(String text, ChatUser recipient) {
		this.text = text;
		this.recipient = recipient;
	}

	public Message(String text) {
		this.text = text;
		this.recipient = null;
	}

	public String getText() {
		return text;
	}

	public ChatUser getRecipient() {
		return recipient;
	}

}
