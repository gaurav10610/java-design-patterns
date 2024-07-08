package behavioural.observer;

public class OctalObserver extends StateObserver {

	@Override
	public void update(int state) {
		System.out.println("Octal String: " + Integer.toOctalString(state));
	}
}
