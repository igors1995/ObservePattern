package observer.interfaces;

import observer.ChatUser;

public interface User {
	public void sendGroupMessage(String text);

	public void displayMessages();
	
	public void showAllMessages();
	
	public void sendPrivateMessage(String text, ChatUser u);
}
