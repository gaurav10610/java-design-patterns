package creational.singleton;

import java.util.UUID;

public class SingletonClass implements Cloneable {

	private String instanceId;

	/**
	 * 
	 * volatile keyword is needed so that the variable should always be read/written
	 * from main memory
	 * 
	 */
	private static volatile SingletonClass instance;

	private SingletonClass(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public static SingletonClass getInstance() {
		if (instance == null) {
			synchronized (SingletonClass.class) {
				if (instance == null) {
					instance = new SingletonClass(UUID.randomUUID().toString());
				}
			}
			return instance;
		}
		return instance;
	}

	/**
	 * protect singleton class from cloning
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
