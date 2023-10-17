package creational.singleton;

public class MainClass {

	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> {
			System.out.println("[Thread1] Singleton Instance value: " + SingletonClass.getInstance().getInstanceId());
		});

		Thread thread2 = new Thread(() -> {
			System.out.println("[Thread2] Singleton Instance value: " + SingletonClass.getInstance().getInstanceId());
		});

		Thread thread3 = new Thread(() -> {
			System.out.println("[Thread3] Singleton Instance value: " + SingletonClass.getInstance().getInstanceId());
		});

		Thread thread4 = new Thread(() -> {
			System.out.println("[Thread4] Singleton Instance value: " + SingletonClass.getInstance().getInstanceId());
		});

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
