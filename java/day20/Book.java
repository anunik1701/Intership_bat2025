package Day20.java;

public class Book {
	
	    String title;
	    String author;

	    // Parameterized constructor
	    Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    // Copy constructor
	    Book(Book other) {
	        this.title = other.title;
	        this.author = other.author;
	    }

	    void display() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	    }

	    public static void main(String[] args) {
	        Book original = new Book("1900", "WINGS OF FIRE");
	        Book copy = new Book(original);

	        original.display();
	        System.out.println("Copied Book:");
	        copy.display();
	    }
	}

