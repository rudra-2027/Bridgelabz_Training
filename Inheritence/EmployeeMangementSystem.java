package Inheritence;

class Employee{
	String name;
	String id;
	double Salary;
	Employee(String name,String id, double Salary){
		this.name = name;
		this.id = id;
		this.Salary = Salary;
		
	}
	void displayDetails() {
		System.out.println("Id: "+ id);
		System.out.println("Name: "+ name);
		System.out.println("Salary: "+ Salary);
	}
}
class Manager extends Employee{
	int teamSize;
	Manager(String id,String name, double salary,int teamSize){
		super(name,id,salary);
		this.teamSize = teamSize;
		
	}
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Team Size of the manager are "+teamSize);
		
	}
}
class Developer extends Employee{
	String programmingLanguage;
	Developer(String id,String name, double salary,String programmingLanguage){
		super(name,id,salary);
		this.programmingLanguage = programmingLanguage;
		
	}
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Programming Language  of the programmer are : "+programmingLanguage);
		
	}
}
class Intern extends Employee{
	String university;
	Intern(String id,String name, double salary,String university){
		super(name,id,salary);
		this.university = university;
		
	}
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("The itern comming from the university  : "+university);
		
	}
	
}
public class EmployeeMangementSystem {
	public static void main(String[] args) {
		Employee e1 = new Employee("Person1","P202025",50000);
		Employee e2 = new Manager("Person2","P20212025",1000000.0,20);
		Employee e3 = new Developer("Person3","P20282025",1000000.0,"Java");
		Employee e4 = new Intern("Person4","P20282025",50000,"IitChaumha");
		
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
		e4.displayDetails();
	}

}
