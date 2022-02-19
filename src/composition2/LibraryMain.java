package composition2;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library bramptonLibrary = new Library();

		Book book1 = new Book("FamousFive", "Mystery", "Enid blyton");

		Book book2 = new Book("Jungle Book", "children books", "Rudyard Kipling");

		Book book3 = new Book("Five point someone", "Bollywood", "Chetan Bhagat");

		bramptonLibrary.addBooksToLibrary(book1);

		bramptonLibrary.addBooksToLibrary(book2);
		bramptonLibrary.addBooksToLibrary(book3);

		// Retrieve the information about books

		// How many books are there is my library

		// Issue Five Point Some book

		boolean isBookIssued = bramptonLibrary.issueBook(book3.getName());

		System.out.println(" Book is issued " + isBookIssued);

		isBookIssued = bramptonLibrary.issueBook("Lord of the Rings");

		System.out.println(" Book is issued " + isBookIssued);

	}

}
