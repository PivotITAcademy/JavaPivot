package composition2;

public class Book {

	String name;
	String genre;
	String author;
	
	public String getName() {
		return name;
	}

	public String getGenre() {
		return genre;
	}

	public String getAuthor() {
		return author;
	}

	public Book(String name, String genre, String author) {
		super();
		this.name = name;
		this.genre = genre;
		this.author = author;
	}
	
	
}
