package immutable;

public class MainClass {

	public static void main(String[] args) {
		Car car = new Car("Car Cover", "Fiat 1.5L", 2023);

		System.out.println(car);

		System.out.println("car cover: " + car.getCover());

		// update engine name which should not be reflected in immutable object
		Engine engine = car.getEngine();
		engine.setEngineName("Toyota 2.0L");
		engine.setModelYear(2021);

		System.out.println("car engine: " + car.getEngine());

		try {
			@SuppressWarnings("unused")
			Car cloneCar = (Car) car.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
