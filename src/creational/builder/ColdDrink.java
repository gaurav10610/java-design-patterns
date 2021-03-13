package creational.builder;

public abstract class ColdDrink implements Item {

  public Packing getPacking() {
    return new Bottle();
  }
}
