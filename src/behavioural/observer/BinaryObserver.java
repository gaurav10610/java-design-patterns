package behavioural.observer;

public class BinaryObserver extends StateObserver {

	@Override
	public void update(int state) {
		System.out.println("Binary String: " + Integer.toBinaryString(state));
	}
}
