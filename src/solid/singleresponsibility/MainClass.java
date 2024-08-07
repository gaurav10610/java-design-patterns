package solid.singleresponsibility;

/**
 * A class should only have one responsibility. Furthermore, it should only have one reason to change.
 */
public class MainClass {

	public static void main(String[] args) {

		Book book = new Book();

		book.setName("Jungle Book");
		book.setAuthor("Rudyard Kipling");
		book.setContent("This is jungle book content.");

		String author = "Gaurav";

		System.out.printf("Is this book authored by %s? %s \n", author, book.isWrittenBy(author));

		author = "rudyard kipling";

		System.out.printf("Is this book authored by %s? %s \n", author, book.isWrittenBy(author));
	}
}
