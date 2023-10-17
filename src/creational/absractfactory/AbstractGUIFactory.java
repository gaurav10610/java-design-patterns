package creational.absractfactory;

public class AbstractGUIFactory {

	private final Button button;
	private final Checkbox checkbox;
	private final GUIFactory guiFactory;

	public AbstractGUIFactory(String os) {
		 
		/**
		 * 
		 * choose concrete factory instance based on OS type
		 * 
		 */
		if(os.equalsIgnoreCase("Mac")) {
			
			guiFactory = new MacOSFactory();
		} else {
			
			// OS === 'Windows'
			guiFactory = new WindowsFactory();
		}
		
		button = guiFactory.createButton();
		checkbox = guiFactory.createCheckbox();
	}

	public void paint() {
		button.paint();
		checkbox.paint();
	}
}
