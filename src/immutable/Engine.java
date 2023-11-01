package immutable;

public class Engine implements Cloneable {

	private String engineName;
	private Integer modelYear;

	public Engine(String engineName, Integer modelYear) {
		this.engineName = engineName;
		this.modelYear = modelYear;
	}

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	public Integer getModelYear() {
		return modelYear;
	}

	public void setModelYear(Integer modelYear) {
		this.modelYear = modelYear;
	}

	@Override
	public Object clone() {
		return new Engine(engineName, modelYear);
	}

	@Override
	public String toString() {
		return "Engine [engineName=" + engineName + ", modelYear=" + modelYear + "]";
	}
}
