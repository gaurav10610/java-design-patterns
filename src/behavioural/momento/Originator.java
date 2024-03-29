package behavioural.momento;

public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Momento saveStateToMomento() {
		return new Momento(state);
	}

	public void restoreStateFromMomento(Momento momento) {
		state = momento.getState();
	}
}
