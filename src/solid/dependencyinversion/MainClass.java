package solid.dependencyinversion;

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
