package javaSwing;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Inventory extends JFrame{

	private String title;
	private String author;
	private int copy;
	
	public Inventory(String title, String author, int copy) {
		this.title = title;
		this.author = author;
		this.copy = copy;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCopy() {
		return copy;
	}
	public void setCopy(int copy) {
		this.copy = copy;
	}
	
	 public void borrowBook(JLabel label) {
		    
         if(copy > 0) {
            copy--;
            label.setText("You rented "+ title +" by " + author + ".");
		
        } else {
        	label.setText("No copies available.");
        	
        }
	 }
	
	
	}


