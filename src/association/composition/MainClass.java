package association.composition;

import java.util.Arrays;

/**
 * 
 * Composition is a strong from of association.
 * 
 * In a composition relationship, the associated objects cannot exist
 * independently within the scope of the system.
 * 
 */
public class MainClass {

	public static void main(String[] args) {

		Library library = new Library(Arrays.asList(new Book("Jungle Book", "Rudyard Kipling"),
				new Book("I too had a love story", "Ravinder Singh")));

		System.out.println("Below are all the books in the library:");
		library.getTotalBooks().forEach((book) -> {
			System.out.printf("Book --> title: %s | author: %s \n", book.getTitle(), book.getAuthor());
		});
	}
}
