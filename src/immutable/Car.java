package immutable;

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
		return new Engine(engine.getEngineName(), engine.getModelYear());
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
