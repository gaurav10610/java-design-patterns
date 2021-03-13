package creational.singleton;

public class MainClass {

  public static void main(String[] args) {
    SingletonClass obj = SingletonClass.getInstance();
    obj.setName("Gaurav Kumar Yadav");
    System.out.print("Singleton class name value: " + obj.getName());
  }

}
