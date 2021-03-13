package creational.factory;

public class MainClass {

  public static void main(String[] args) {
    ShapeFactory factory = new ShapeFactory();
    Shape obj1 = factory.getShape("circle");
    Shape obj2 = factory.getShape("square");
    obj1.draw();
    obj2.draw();
  }

}
