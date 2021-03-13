package behavioural.mediator;

public class MainClass {

  public static void main(String[] args) {
    User gaurav = new User("Gaurav");
    User paras = new User("Paras");
    
    gaurav.sendMessage("Hey everyone, gaurav here");
    paras.sendMessage("Hey gaurav");
  }

}
