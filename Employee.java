package Assignments.April06_2026;

public class Employee {

	private String name;
	private int id;
	private String department;

	 Employee(String name, int id, String department) {
	        this.name = name;
	        this.id = id;
	        this.department = department;
	    }

	    // Overloaded constructor
	    Employee(String name, int id) {
	        this.name = name;
	        this.id = id;
	        this.department = "General";
	    }
	    
	    // Getter methods
	    public String getName() {
	        return name;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    // Setter methods
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }
	
	public static void main(String[] args) {
		  Employee emp1 = new Employee("Adithya", 101, "IT");
	        Employee emp2 = new Employee("Sai", 102);
	        Employee emp3 = new Employee("Lakshmi", 103, "HR");

	        // Updating values using setters
	        emp2.setDepartment("Accounting");
	        emp3.setName("Sravani");

	        // Printing employee details using getters
	        System.out.println("Employee 1 Details:");
	        System.out.println("Name: " + emp1.getName());
	        System.out.println("ID: " + emp1.getId());
	        System.out.println("Department: " + emp1.getDepartment());

	        System.out.println("\nEmployee 2 Details:");
	        System.out.println("Name: " + emp2.getName());
	        System.out.println("ID: " + emp2.getId());
	        System.out.println("Department: " + emp2.getDepartment());

	        System.out.println("\nEmployee 3 Details:");
	        System.out.println("Name: " + emp3.getName());
	        System.out.println("ID: " + emp3.getId());
	        System.out.println("Department: " + emp3.getDepartment());
	    }
	}