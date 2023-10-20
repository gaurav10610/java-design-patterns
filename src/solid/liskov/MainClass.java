package solid.liskov;

public class MainClass {

	public static void main(String[] args) {
		
		BaseClass baseInstance = new BaseClass();
		baseInstance.doSomething();
		
		ChildClass childInstance = new ChildClass();
		childInstance.doSomething();
		childInstance.doSomethingElse();

	}

}
