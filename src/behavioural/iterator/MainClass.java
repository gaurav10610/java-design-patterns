package behavioural.iterator;

public class MainClass {

  public static void main(String[] args) {
    NameRepository repo = new NameRepository();
    Iterator it = repo.getIterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

}
