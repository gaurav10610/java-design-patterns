package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private final List<StateObserver> observers = new ArrayList<>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void subscribe(StateObserver observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		observers.parallelStream().forEach((observer) -> {
			observer.update(state);
		});
	}
}
