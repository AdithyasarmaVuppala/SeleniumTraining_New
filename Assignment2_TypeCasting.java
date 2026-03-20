package day1;

public class Assignment2_TypeCasting {

	public static void main(String[] args) {
		
		float variable = 97.8f;
		double variable_double = (double)variable;
		int variable_int = (int)variable;
		char ch = (char) variable_int;
		System.out.println("Converted to double: " + variable_double);
		System.out.println("Converted to int: "+ variable_int);
		System.out.println("Character value: " + ch);
		

	}

}
