package Assignments.April17_2026;

class Vehicle
{
	String brand;
	int speed;
	static String company;
	 Vehicle(String brand, int speed) {
	        this.brand = brand;
	        this.speed = speed;
	    }
	 void Run()
	 {
		 System.out.println("---Solution 2---");
		 System.out.println("Vehicle is running");
	 }
	 static void displayCompany() {
		 System.out.println("---Solution 3---");
		 System.out.println("Autoworld LTD.");
	 }
	 final void engineType(String Enginetype)
	 {
		 System.out.println("---Solution 4----");
		 System.out.println(Enginetype);
	 }
}
class Car extends Vehicle
{
	String fuelType;
	  Car(String brand, int speed, String fuelType) {
	        super(brand, speed);
	        this.fuelType = fuelType;
	    }

	    void display() {
	    	System.out.println("---Solution 2 ---");
	        System.out.println("Brand: " + brand);
	        System.out.println("Speed: " + speed);
	        System.out.println("Fuel Type: " + fuelType);
	    }
	    void Run() {
	    	super.Run();
	    	System.out.println("Car is running smoothly");
	    }
//	    void engineType(String Enginetype) {
//	    	System.out.println("Cannot Override final method"); --- Solution 4
//	    }
	    void stringMethod(String brand) {
	    	String str1 = brand.replace("y","*");
	    	boolean str2 = brand.equals(brand);
	    	String Original = "Hyundai";
	    	StringBuilder sb = new StringBuilder(Original);
	    	sb.reverse();
	    	String ReversedString = sb.toString();
	    	System.out.println("---Solution 5---");
	    	System.out.println(str1);
	    	System.out.println(str2);
	    	System.out.println(ReversedString);
	    	
	    }
	}

public class Assignment_Question2 {

	public static void main(String[] args) {
		Car car = new Car("Swift",100,"CNG");
		car.display();
		car.Run();
		car.displayCompany();
		car.engineType("Standard Engine");
		car.stringMethod("Hyundai");
		
	}
}

