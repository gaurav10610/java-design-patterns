package immutable;

public class MainClass {

	public static void main(String[] args) {
		Car car = new Car("Car Cover", "Fiat 1.5L", 2023);

		System.out.println(car);

		try {
			@SuppressWarnings("unused")
			Car cloneCar = (Car) car.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("car is an immutable object, clone not supported");
			e.printStackTrace();
		}
	}
}
