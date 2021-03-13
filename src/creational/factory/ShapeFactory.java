package creational.factory;

public class ShapeFactory {

  public Shape getShape(String shapeId) {
    switch (shapeId) {
      case "circle":
        return new Circle();
      case "square":
        return new Square();
      default:
        return null;
    }
  }
}
