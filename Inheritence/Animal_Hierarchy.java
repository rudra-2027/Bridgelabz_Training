package Inheritence;

public class Animal_Hierarchy {
	public static void main(String[] args) {
		
		Animal dog = new Dog("Burno","52");
		Animal cat = new Cat("Kitty","10");
		Animal bird = new Bird("Tweety","5");
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
	}
	
	
	

}
class Animal{
	String name;
	String age;
	Animal(){
		
	}
	Animal(String name, String age){
		this.name = name;
		this.age = age ;
	}
	void makeSound() {}
	
}
class Dog extends Animal{
	Dog(String name, String age){
		super(name,age);
	}
	@Override
	void makeSound() {
		System.out.println(name  +" can make sound Barak....");
	}
	
}
class Cat extends Animal{
	Cat(String name, String age){
		super(name,age);
	}
	@Override
	void makeSound() {
		System.out.println(name + " can make sound  Mewooo...");
	}
}
class Bird extends Animal{
	Bird(String name, String age){
		super(name,age);
	}
	@Override
	void makeSound() {
		System.out.println(name + " can make sound Chirp......");
	}
}