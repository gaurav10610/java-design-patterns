package creational.singleton;

public class SingletonClass {

  private String name;

  private static SingletonClass obj = null;

  private SingletonClass() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static SingletonClass getInstance() {
    return obj == null ? new SingletonClass() : obj;
  }
}
