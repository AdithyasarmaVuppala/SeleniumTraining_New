package Assignments.April02_2026;

public class AreaCalculator {
	
	static double area(double radius)
	{
		double area = 22.7*radius*radius;
		return area;
	}
	static int area(int length, int breadth)
	{
		int area = length * breadth;
		return area;
	}
	static int area(int side)
	{
		int area = side*side;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle is:" + area(22));
		System.out.println("Area of Rectangle is:" + area(25,75));
		System.out.println("Area of Square is:" + area(33));

	}

}

