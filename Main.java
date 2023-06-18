package review;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	boolean rentAgain;
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
	ArrayList <Book> books = new ArrayList<>(); 	
		
	Book book1 = new Book("life", "robe", 2);
	Book book2 = new Book("death", "isha", 3);
	Book book3 = new Book("you", "me", 4);
	
	books.add(book1);
	books.add(book2);
	books.add(book3);
	
	for (int i = 0; i < books.size(); i++) {
		System.out.println(books.get(i).getTitle() + ", " + books.get(i).getAuthor() + ", " + books.get(i).getCopy());
	}
	
	
	int i = 1;
	while (i > 0) {
		System.out.print("\n========================\nChoose an index to rent: ");
		int choice = s.nextInt();
		books.get(choice).rentBook(); 
		System.out.print("\nWould you like to rent again? (0 = Yes) (1 = No): ");
		int ans = s.nextInt();

		
		if(ans == 0) {
			i++;
		}
		else if (ans == 1) {
			System.out.println("Thank you for renting in myLibrary, please come again.");
			i = 0;
		}
		if (book1.getCopy() + book2.getCopy() + book3.getCopy() == 0) {
			i = 0;
		}
	
		}
		
	}
}
	
	
