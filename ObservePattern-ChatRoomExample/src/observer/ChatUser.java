package observer;

import java.util.ArrayList;

import model.Message;
import observer.interfaces.Observer;
import observer.interfaces.User;
import subject.ChatRoom;

public class ChatUser implements Observer, User {
	private String username;
	private ChatRoom chatRoom;

	public ChatUser(String username, ChatRoom chatRoom) {
		super();
		this.username = username;
		this.chatRoom = chatRoom;
	}

	@Override
	public void sendGroupMessage(String text) {
		Message message = new Message(username + ": " + text);

		chatRoom.addMessage(this, message);

	}

	@Override
	public void displayMessages() {
		Message lastMessage = chatRoom.getMessages().get(chatRoom.getMessages().size() - 1);
		if(lastMessage.getRecipient() == this) {
			System.out.println(lastMessage.getText() + " (za : "+ lastMessage.getRecipient().getUsername() + ")");
		}else {
			if(lastMessage.getRecipient() == null) {
				System.out.println(lastMessage.getText());
			}
		}
	}

	@Override
	public void showAllMessages() {
		ArrayList<Message> allMessages = chatRoom.getMessages();
		for (Message message : allMessages) {
			if(message.getRecipient() == null || message.getRecipient() == this) {
			System.out.println(message.getText());
		}
		}
	}

	@Override
	public void update() {
		displayMessages();
	}

	@Override
	public void sendPrivateMessage(String text, ChatUser u) {
		Message message = new Message(username + ": " + text, u);

		chatRoom.addMessage((ChatUser)this, message);
	}

	public String getUsername() {
		return username;
	}
	
	

}
