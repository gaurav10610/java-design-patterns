package creational.prototype;

public class MainClass {

  public static void main(String[] args) {
    ShapeCache.loadCache();

    Shape shape1 = ShapeCache.getShape(1);
    System.out.println("Shape name: " + shape1.getName());

    Shape shape2 = ShapeCache.getShape(2);
    System.out.println("Shape name: " + shape2.getName());
  }
}
