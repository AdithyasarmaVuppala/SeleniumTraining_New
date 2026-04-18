package Assignments.April17_2026;

//Base class
class Book {
 String title;
 String author;
 static String libraryName = "City Library";
 final int ISBN = 12345;
 String bookTitle;

 Book(String title, String author) {
     this.title = title;
     this.author = author;
 }

 void display() {
	 System.out.println("---Assignment 1 Solution---");
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
 }
 void getDescription() {
		System.out.println("---Assignment 2 Solution---");
		System.out.println("This is a Physical Book");
	}
 static void showLibrary() {
	 System.out.println("---Assignment 3 Solution---");
	 System.out.println(libraryName);
 }
 void checkBook(String bookTitle) {
	 System.out.println("---Assignment 5 Solution---");
	 String str2 = bookTitle.toUpperCase();
	 System.out.println(str2);
	 int str3 = bookTitle.length();
	 System.out.println(str3);
	 boolean str4 = bookTitle.contains("java"); 
	 System.out.println(str4);

 }
}

class EBook extends Book {
 String fileSize;

 EBook(String title, String author, String fileSize) {
     super(title, author);
     this.fileSize = fileSize;
 }

 void display() {
     super.display();
     System.out.println("File Size: " + fileSize);
 }
 void getDescription() {
	 super.getDescription();
		System.out.println("This is an Electronic Book");
	}
}

//Main class
public class Assignment_Question1 {
 public static void main(String[] args) {
     EBook ebook = new EBook("Atomic Habits", "James Clear", "5MB");
     ebook.display();
     ebook.getDescription();
     ebook.showLibrary();
     //ebook.ISBN=23456; // Assignment 4 solution
     
     ebook.checkBook("java programming");
     
 }
}

