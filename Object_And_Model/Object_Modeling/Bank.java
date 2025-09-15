package Object_Modeling;

import java.util.*;

//Problem 2: Bank and Account Holders (Association)
//Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts,
//and each account is linked to a Bank.
//Tasks:
//Define a Bank class and a Customer class.
//Use an association relationship to show that each customer has an account in a bank.
//Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
//Goal: Illustrate association by setting up a relationship between customers and the bank.
public class Bank {
	private String bankName;
	private List<Customer> customers;  

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }
    public String getBankName() {
        return bankName;
    }
    
	public void openAccount(Customer customer) {
        customers.add(customer);
        customer.setBank(this);  
        System.out.println("Account opened for " + customer.getName() + " at " + bankName);
    }
	public static void main(String[] args) {
		Bank newBank = new 	Bank("SBI");
		Customer cst1 = new Customer("Rudra",50000);
		Customer cst2 = new Customer("Rohan",60000);
		newBank.openAccount(cst1);
		newBank.openAccount(cst2);
		cst1.viewBalance();
        cst2.deposit(2000);
        cst2.viewBalance();
        cst1.withdraw(1000);
        cst1.viewBalance();
		
	}
}
class Customer{
	private String name;
    private double balance;
    private Bank bank; 
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

  
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    	
    public String getName() {
    	return name;
    }
    public void viewBalance() {
        System.out.println(name + "'s balance at " + bank.getBankName() + " " + balance);
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }


}
