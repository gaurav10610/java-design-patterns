package solid.dependencyinversion;

/**
 *
 * The principle of dependency inversion refers to the decoupling of software modules. This way,
 * instead of high-level modules depending on low-level modules, both will depend on abstractions.
 *
 */
public class MainClass {

	public static void main(String[] args) {

		Monitor monitor = new DellMonitor();
		Keyboard keyboard = new StandardKeyboard();

		PersonalDesktop desktop = new PersonalDesktop(monitor, keyboard);
		
		desktop.pressKey("A");
		desktop.pressKey("C");
		desktop.pressKey("Z");
	}
}
