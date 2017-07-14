package subject.interfaces;

import observer.interfaces.Observer;

public interface Observable {

	public void add(Observer o);

	public void remove(Observable o);

	/**
	 * 
	 * @param o
	 *            Object that won t be notified
	 */
	public void notifyObservers(Observer o);
}
