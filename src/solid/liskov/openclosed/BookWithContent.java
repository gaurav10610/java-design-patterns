package solid.liskov.openclosed;

public class BookWithContent extends Book {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BookWithContent [ content=" + content + ", name=" + getName() + ", getAuthor()=" + getAuthor() + " ]";
	}
}
