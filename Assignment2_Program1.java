package Assignments;

public class Assignment2_Program1 {

	public static void main(String[] args) {	
//		Problem Statement:
//			A student scored 87.6 marks in an exam (stored in a float). Perform the following operations:
//			Convert the float marks into:
//			double
//			int
//			Print all three values.
//			Convert the final integer value into a character using ASCII and print it.

		
		// Soulution:-
		
		
		float Student_Marks = 87.6f;
		double D = (double)Student_Marks;
		int I = (int)Student_Marks;
		System.out.println("Float value of student marks: " + Student_Marks);
		System.out.println("Double value of student marks: " + D);
		System.out.println("Integer value of student marks: " + I );
		System.out.println("ASCII value of final interger: " + (char)I);
		
		
	}

}
