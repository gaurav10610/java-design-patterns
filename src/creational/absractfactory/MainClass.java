package creational.absractfactory;

public class MainClass {
	
	public static void main(String[] args) {
		
		String os = "MAC";
		
		AbstractGUIFactory guiFactory = new AbstractGUIFactory(os);
		
		guiFactory.paint();
	}
}
