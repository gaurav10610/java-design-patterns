package solid.singleresponsibility;

public class Book {

	private String name;

	private String author;

	private String content;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean isWrittenBy(String author) {
		return this.author.equalsIgnoreCase(author);
	}
}
