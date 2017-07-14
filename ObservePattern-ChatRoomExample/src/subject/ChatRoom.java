package subject;

import java.util.ArrayList;

import model.Message;
import observer.interfaces.Observer;
import subject.interfaces.Observable;

public class ChatRoom implements Observable {
	ArrayList<Observer> observers;
	ArrayList<Message> messages;

	public ChatRoom() {
		observers = new ArrayList<>();
		messages = new ArrayList<>();
	}

	@Override
	public void add(Observer o) {
		observers.add(o);
	}

	@Override
	public void remove(Observable o) {
		if (observers.contains(o)) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers(Observer o) {
		for (Observer obs : observers) {
			if (obs != o) {
				obs.update();
			}
		}
	}

	public void addMessage(Observer o, Message message) {
		messages.add(message);
		notifyObservers(o);
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public ArrayList<Message> getMessages() {
		return messages;
	}

}
