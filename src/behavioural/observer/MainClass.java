package behavioural.observer;

public class MainClass {

	public static void main(String[] args) {
		Subject subject = new Subject();

		subject.subscribe(new OctalObserver());
		subject.subscribe(new BinaryObserver());

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}

}
