package composition2;

public class Library {

	Book[] books = new Book[10];

	String libraryName;

	// Passing objects to method
	public void addBooksToLibrary(Book bookObj) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = bookObj;
				break;
			}
		}
	}

	public void setNameOfLibrary(String name) {
		libraryName = name;
	}

	public boolean issueBook(String bookName) {

		for (int i = 0; i < books.length; i++) {
			if (books[i].getName().equals(bookName)) {
				return true;
			}

		}
		return false;

	}
}
