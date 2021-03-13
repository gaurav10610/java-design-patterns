package behavioural.momento;

public class MainClass {

  public static void main(String args[]) {
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();

    originator.setState("State #1");
    originator.setState("State #2");
    careTaker.add(originator.saveStateToMomento());

    originator.setState("State #3");
    careTaker.add(originator.saveStateToMomento());

    originator.setState("State #4");

    System.out.println("Current State: " + originator.getState());
    System.out.println("Previously Strored State: " + careTaker.getState(0).getState());
    System.out.println("Previously Strored State: " + careTaker.getState(1).getState());
  }
}
