package Object_Modeling;

import java.util.ArrayList;
import java.util.List;

//Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition, where deleting a company should also delete all departments and employees.
//Tasks:
//Define a Company class that contains multiple Department objects.
//Define an Employee class within each Department.
//Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
//Goal: Understand composition by implementing a relationship where Department and Employee objects cannot exist without a Company.
public class Company {
	private String companyName;
	private List<Department> departments;
	public Company(String companyName){
		this.companyName = companyName;
		this.departments = new ArrayList<>();
	}
	public void addDepartments(Department dept) {
		departments.add(dept);
	}
	public void displayCompany() {
		System.out.println("Company: "+companyName);
		for (Department d : departments) {
            d.display();
        }
	}
	public static void main(String[] args) {
		Company company = new Company("TECH");
		Department department = new Department("IT");
		department.addEmployee("Rahul");
		department.addEmployee("Rohan");
		Department department2 = new Department("HR");
		department2.addEmployee("Charliee");
		company.addDepartments(department);
        company.addDepartments(department2);
        company.displayCompany();
		
		
	}
	
}
class Department{
	private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    public void display() {
        System.out.println(" Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}
class Employee{
	private String name;

    public Employee(String name) {
        this.name = name;
        
    }

    public void display() {
        System.out.println("Employee: " + name);
    }

}
