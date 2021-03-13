package structural.decorator;

public class MainClass {

  public static void main(String[] args) {
    
    Shape redshape = new RedShapeDecorator(new Circle());
    
    //This will draw circle and also print red border as well
    redshape.draw();
  }
}
