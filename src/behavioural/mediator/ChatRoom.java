package behavioural.mediator;

import java.util.Date;

public class ChatRoom {

  public static void sendMessage(User user, String message) {
    System.out.println(new Date().toString() + " [" + user.getUserName() + " : " + message + "]");
  }
}
