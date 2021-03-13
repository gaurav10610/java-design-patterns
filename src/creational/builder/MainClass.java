package creational.builder;

public class MainClass {

  public static void main(String[] args) {

    MealBuilder builder = new MealBuilder();

    Meal vegMeal = builder.prepareVegMeal();
    vegMeal.showItems();
    System.out.println("Veg meal cost: " + vegMeal.getCost());

    System.out.println("******************************************");
    
    Meal nonVegMeal = builder.prepareNonVegMeal();
    nonVegMeal.showItems();
    System.out.println("Non Veg meal cost: " + nonVegMeal.getCost());
  }

}
