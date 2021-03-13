package creational.prototype;

import java.util.*;

public class ShapeCache {

  private static Map<Integer, Shape> cache = new HashMap<Integer, Shape>();

  public static Shape getShape(int shapeId) {
    Shape shape = cache.get(shapeId);
    return (Shape) shape.clone();
  }

  // load cache or make db call
  public static void loadCache() {
    Circle c = new Circle();
    c.setId(1);
    cache.put(1, c);

    Square s = new Square();
    s.setId(2);
    cache.put(2, s);
  }
}
