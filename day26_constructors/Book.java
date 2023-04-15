package day26_constructors;

// creating instance variable
public class Book {
	String title;
	String author;
	int year;
	int isbn;
	int pages;
	
	// creating parameterized constructor
	public Book (String title1, String author1, int year1, int isbn1, int pages1) {
		title = title1;
		author = author1;
		year = year1;
		isbn = isbn1;
		pages = pages1;
	}
	
	// creating no argument constructor
	public Book () {
		title = "Gardening";
		author = "John Smith";
		year = 2023;
		isbn = 3434;
		pages = 45;
	}
	// creating instance method
	public void read() {
		System.out.println(title + " was written by " + author + " in the year " + year + ". Its ISBN is " + isbn + " and it has " + pages + " pages." );
		
	}
	
	// creating object
	public static void main(String[] args) {
		Book JAVA = new Book("JAVA", "Oracle", 1995, 726338, 34);
		
		JAVA.read();
	}
	
	
	
	
}
