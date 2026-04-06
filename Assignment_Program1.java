package Assignments;

public class Assignment_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1);
		System.out.print(num2);
		for (int i=2;i<=10;i++) {
			int num3 = num1 + num2;
			System.out.print(num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
