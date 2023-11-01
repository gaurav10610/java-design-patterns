package behavioural.iterator;

public class MainClass {

	public static void main(String[] args) {
		NameRepository repo = new NameRepository(new String[] { "Gaurav", "Robert", "John", "Julie", "Lora" });
		Iterator it = repo.getIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
