package solid.liskov;

/**
 *
 * If class A is a subtype of class B, we should be able to replace B with A without disrupting the
 * behavior of our program.
 *
 */
public class MainClass {

	public static void main(String[] args) {
		
		BaseClass baseInstance = new BaseClass();
		baseInstance.doSomething();
		
		ChildClass childInstance = new ChildClass();
		childInstance.doSomething();
		childInstance.doSomethingElse();

	}

}
