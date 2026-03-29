package Assignments;

public class Assignment2_Program3 {

	public static void main(String[] args) {
//
//		Write a Java program to:
//			1.	Print Fibonacci series up to n terms 
//			2.	Stop printing using break if any number in the series becomes greater than 100 

		int num = 10;
		int num1=0;
		int num2=1;
		int num3;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=num;++i) {
			
			if(num1>=100) {
				break;
			}
			 num3=num1+num2;
			 System.out.println(num3);
			num1=num2;
			num2=num3;
		}
		
	}

}
