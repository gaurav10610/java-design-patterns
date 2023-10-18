package structural.proxy;

public class MainClass {

	public static void main(String[] args) {
		Image image = new ProxyImage("Gaurav.jpg");
		image.display();
	}

}
