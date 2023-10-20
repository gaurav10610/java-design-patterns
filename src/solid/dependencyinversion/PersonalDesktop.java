package solid.dependencyinversion;

public class PersonalDesktop {

	private Monitor monitor;

	private Keyboard keyboard;

	public PersonalDesktop(Monitor monitor, Keyboard keyboard) {
		this.monitor = monitor;
		this.keyboard = keyboard;
	}

	public void pressKey(String key) {
		keyboard.pressKey(key);
		monitor.display(key);
	}
}
