
package behavioural.mediator;

public class User {

  private String userName;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public User(String userName) {
    this.userName = userName;
  }

  public void sendMessage(String message) {
    ChatRoom.sendMessage(this, message);
  }
}
