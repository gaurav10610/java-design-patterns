package solid.liskov.openclosed;

/**
 *
 * Classes should be open for extension but closed for modification. In doing so, we stop ourselves from
 * modifying existing code and causing potential new bugs in an otherwise happy application.
 *
 */
public class MainClass {

	public static void main(String[] args) {
		BookWithContent book = new BookWithContent();

		book.setName("Jungle Book");
		book.setAuthor("Rudyard Kipling");
		book.setContent("This is jungle book content.");

		System.out.print(book);
	}
}
