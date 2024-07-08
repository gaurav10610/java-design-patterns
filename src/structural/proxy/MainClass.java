package structural.proxy;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * original object
		 */
		RealImage realImage = new RealImage("gaurav.jpeg");

		/*
		 * proxy object
		 */
		Image imageProxy = new ProxyImage(realImage);
		imageProxy.display();
	}

}
