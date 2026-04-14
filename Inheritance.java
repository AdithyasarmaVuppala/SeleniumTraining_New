package Assignments.April10_2026;

 class Person {
	String name;
	int age;
	Person(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
 }
class Student extends Person
{
	int marks;
	Student(int age, String name,int marks)
	{
		super(age,name); 
		this.marks=marks;
	}
	void display()
	{
		System.out.println(age+":"+name+":"+marks);
	}
}
public  class Inheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(25,"Adithya",100);
		student.display();
	}
}
