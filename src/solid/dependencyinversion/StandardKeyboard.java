package solid.dependencyinversion;

public class StandardKeyboard implements Keyboard {

	@Override
	public void pressKey(String key) {
		System.out.println("pressed key: " + key);

	}

}
