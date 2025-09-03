package Class_And_Object_Level_2;
//Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
//Depositing money.
//Withdrawing money (only if sufficient balance exists).
//Displaying the current balance.
//Explanation: The BankAccount class stores bank account details as attributes. The methods allow interaction with these attributes to modify
//and view the account's state.

public class BankAccount {
	String accountHolder; 
	Long accountNumber; 
	Double balance;
	
	BankAccount(String accountHolder, Long accountNumber, Double balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	void deposit(double depositMoney) {
		if (depositMoney > 0) {
            this.balance += depositMoney;
            System.out.println("Deposited: " + depositMoney);
        } else {
            System.out.println("Invalid deposit amount!");
        }
	}
	void withdraw(double withdrawMoney) {
		if (withdrawMoney > balance) {
            System.out.println("Insufficient balance!");
        } else if (withdrawMoney <= 0) {
            System.out.println("Invalid withdraw amount!");
        } else {
            balance -= withdrawMoney;
            System.out.println("Withdrew: " + withdrawMoney);
        }
	}
	 void displayBalance() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Current Balance: " + balance);
	    }
	 public static void main(String[] args) {
	        BankAccount acc1 = new BankAccount("Rahul Sharma", 1234567890L, 5000.0);

	        acc1.displayBalance();
	        acc1.deposit(2000);
	        acc1.withdraw(1000);
	        acc1.withdraw(8000);
	        acc1.displayBalance();
	    }
}
