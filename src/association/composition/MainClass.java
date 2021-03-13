package association.composition;

import java.util.Arrays;

public class MainClass {

  public static void main(String[] args) {
    Book book1 = new Book("Jungle Book", "Rudyard Kipling");
    Book book2 = new Book("I too had a love story", "Ravinder Singh");

    Library library = new Library(Arrays.asList(book1, book2));
    System.out.println("Below are all the books in the library: ");
    library.getTotalBooks().forEach((book) -> {
      System.out.println("Book --> title: " + book.getTitle() + " | author: " + book.getAuthor());
    });
  }
}
