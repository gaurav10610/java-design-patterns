package behavioural.momento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

  private List<Momento> list = new ArrayList<Momento>();

  public void add(Momento momento) {
    list.add(momento);
  }

  public Momento getState(int index) {
    return list.get(index);
  }
}
