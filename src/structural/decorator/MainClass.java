package structural.decorator;

/**
 * A Decorator Pattern says that just "attach a flexible additional responsibilities to an object dynamically".
 * In other words, The Decorator Pattern uses composition instead of inheritance to extend the functionality of
 * an object at runtime.
 * The Decorator Pattern is also known as Wrapper.
 * <p></p>
 * Advantages:
 * 	- It provides greater flexibility than static inheritance.
 * 	- It enhances the extensibility of the object, because changes are made by coding new classes.
 * 	- It simplifies the coding by allowing you to develop a series of functionality from targeted classes instead
 * 		of coding all the behavior into the object.
 */
public class MainClass {

	public static void main(String[] args) {

		Shape redshape = new RedBorderShape(new Circle());

		// This will draw circle and also print red border as well
		redshape.draw();
	}
}
