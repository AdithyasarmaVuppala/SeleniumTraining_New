package Assignments;

public class Assignment2_Program2 {

	public static void main(String[] args) {
//		Problem Statement:
//			Write a Java program that:
//			Takes a character input from the user (e.g., 'A').
//			Finds and prints its ASCII value.
//			Adds 5 to the ASCII value.
//			Converts the new value back to a character and prints it.
		
		//Solution:-
		
		char ch='S';
		int AsciiValue = ch;
		System.out.println("ASCII value of given character is: "+ AsciiValue);
		int sum = AsciiValue+5;
		char ch_new = (char)sum;
		System.out.println("Converted character value is: " +ch_new);

	}

}
