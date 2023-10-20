package solid.dependencyinversion;

public class DellMonitor implements Monitor {

	@Override
	public void display(String text) {
		System.out.println("displaying text: " + text);

	}

}
