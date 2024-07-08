package immutable;

/**
 * An immutable class is a class whose state cannot be modified after it is created. Once an object of an immutable
 * class is constructed, its internal data remains constant throughout its lifetime.
 */
public final class Car implements Cloneable {

	private final String cover;
	private final Engine engine;

	public Car(String cover, String engineName, Integer modelYear) {
		this.cover = cover;
		this.engine = new Engine(engineName, modelYear);
	}

	public String getCover() {
		return cover;
	}

	public Engine getEngine() {
		return (Engine) engine.clone();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	@Override
	public String toString() {
		return "Car [cover=" + cover + ", engine=" + engine + "]";
	}

}
