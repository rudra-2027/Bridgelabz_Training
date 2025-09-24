package Encapsulation;

import java.util.ArrayList;
import java.util.List;

/*
 * 4. Banking System
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.
*/
public class BankingSystem {
	 public static void main(String[] args) {
	        List<BankAccount> accounts = new ArrayList<>();

	        accounts.add(new SavingsAccount("SAV123", "Alice", 8000));
	        accounts.add(new CurrentAccount("CUR456", "Bob", 15000));

	        for (BankAccount acc : accounts) {
	            acc.displayDetails();
	            System.out.println("Interest: " + acc.calculateInterest());
	            
	            acc.applyForLoan(20000.0);
	           
	        }
	    }
}
abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

  
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

  
    protected void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

  
    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}


interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}


class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved for Savings Account: " + getAccountNumber());
        } else {
            System.out.println("Loan denied for Savings Account: " + getAccountNumber());
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000; 
    }
}


class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02; 

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved for Current Account: " + getAccountNumber());
        } else {
            System.out.println(" Current Account is not applicable for loan: " + getAccountNumber());
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000; 

    }
}
