package Class_And_Object_Level_1;
//Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.
public class Employee {
	String name;
	Long id;
	Double salary;
	Employee(String name, Long id, Double salary){
		this.name = name;
		this.id  = id;
		this.salary = salary;
	}
	void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ravi", 101L, 55000.0);
        emp1.displayDetails();
    }
}
