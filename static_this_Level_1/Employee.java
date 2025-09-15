package static_this_Level_1;
//Static:
//○       A static variable companyName shared by all employees.
//○       A static method displayTotalEmployees() to show the total number of employees.
//This:
//○       Use this to initialize name, id, and designation in the constructor.
//Final:
//○       Use a final variable id for the employee ID, which cannot be modified after assignment.
//Instanceof
//○       Check if a given object is an instance of the Employee class before printing the employee details.

public class Employee {
	private static String companyName;
	private static int totalEmployee;
	
	private String name;
	private final int id;
	private String designation;
	public Employee(String name, int id, String designation) {
		this.designation = designation;
		this.id = id;
		this.name = name;
		totalEmployee++;
	}
	public static void setCompanyName(String name) {
	       companyName = name;
	   }
	 public static void displayTotalEmployees() {
	       System.out.println("Total Employees: " + totalEmployee);
	   }
	 public void displayEmployeeDetails() {
	    
	       if (this instanceof Employee) {
	           System.out.println("Company Name: " + companyName);
	           System.out.println("Employee ID: " + id);
	           System.out.println("Name: " + name);
	           System.out.println("Designation: " + designation);
	       } else {
	           System.out.println("The object is not an instance of the Employee class.");
	       }
	 }
	       public String getName() {
	           return name;
	       }
	       public int getId() {
	           return id;
	       }
	       public String getDesignation() {
	           return designation;
	       }

	       public static void main(String[] args) {
			Employee.setCompanyName("Tech Solution etc");
			Employee emp1 = new Employee("Thamarai", 101, "Software Engineer");
	        Employee emp2 = new Employee("Rohan", 102, "Project Manager");
	        Employee.displayTotalEmployees();
		       emp1.displayEmployeeDetails();
		       emp2.displayEmployeeDetails();
		}

}	
