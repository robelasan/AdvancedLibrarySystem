package review;

import java.util.ArrayList;

public class Book {

	private String title;
	private String author;
	private int copy;
	
	//static ArrayList <Book> BookList = new ArrayList <Book> ();
	
	public Book(String title, String author, int copy) {
		this.title = title;
		this.author = author;
		this.copy = copy;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String setTitle(String title) {
		this.title = title;
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String setAuthor(String author) {
		this.author = author;
		return author;
	}
	
	public int getCopy() {
		return copy;
	}
	
	public int setCopy(int copy) {
		this.copy = copy;
		return copy;
	}
	
	public void rentBook() {
		
			if (copy > 0) {
				copy--;
				System.out.println("You rented: " + title);
			}
			else {
				System.out.println("Sorry, no copies available.");
			
		}
	}
}
