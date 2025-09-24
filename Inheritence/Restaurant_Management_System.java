package Inheritence;
class Person2 {
    String name;
    int id;

   
    public Person2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
interface Worker {
    void performDuties(); 
    
}
class Chef extends Person implements Worker {
    String dish;

    public Chef(String name, int id, String dish) {
        super(name, id);
        this.dish = dish;
    }

    @Override
    public void performDuties() {
        displayDetails();
        System.out.println("Chef Can Cook "+dish);
        
    }
}
class Waiter extends Person implements Worker{
	String work;
	public Waiter(String name,int id,String work) {
		super(name,id);
		this.work = work;
	}
	@Override
	public void performDuties() {
		 displayDetails();
		 System.out.println("Waiter can do work hour "+work);
	}
}
public class Restaurant_Management_System {
	public static void main(String[] args) {
        Worker chef = new Chef("Chef", 101, "Italian");
        Worker waiter = new Waiter("Worker", 202, "Evening");

        chef.performDuties();
        waiter.performDuties();
    }
}
