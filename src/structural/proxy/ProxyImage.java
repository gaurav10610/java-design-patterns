package structural.proxy;

public class ProxyImage implements Image {

	private RealImage realImage;

	public ProxyImage(String fileName) {
		this.realImage = new RealImage(fileName);
	}

	@Override
	public void display() {
		System.out.println("pre display method of proxy instance");
		realImage.display();
		System.out.println("post display method of proxy instance");
	}

}
