package static_this_Level_1;
//Create a BankAccount class with the following features:

//Static:
//○       A static variable bankName is shared across all accounts.
//○       A static method getTotalAccounts() to display the total number of accounts.
//This:
//○       Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
//Final:
//○       Use a final variable accountNumber to ensure it cannot be changed once assigned.
//Instanceof:
//○       Check if an account object is an instance of the BankAccount class before displaying its details.

public class BankAccount {
	private static String BankName = "State Bank Of India";
	private static int totalAccounts = 0;

	private final String accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		totalAccounts++;
	}

	public static void getTotalAccounts() {
		System.out.println("Total number of accounts: " + totalAccounts);
	}

	public void displayAccountDetails() {
		if (this instanceof BankAccount) {
			System.out.println("Bank Name: " + BankName);
			System.out.println("Account Holder: " + accountHolderName);
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Balance: $" + balance);
		} else {
			System.out.println("Invalid account instance.");
		}
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $" + amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}

	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: $" + amount);
		} else {
			System.err.println("Insufficient balance or invalid amount.");
		}
	}

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount("Rohan", "ACC12345", 1000.00);
		BankAccount account2 = new BankAccount("Prince", "ACC67890", 500.00);

		System.out.println("Account 1 Details:");
		account1.displayAccountDetails();
		System.out.println("Account 2 Details:");
		account2.displayAccountDetails();

		BankAccount.getTotalAccounts();

		System.out.println("Performing transactions on Account 1:");
		account1.deposit(200);
		account1.withdraw(150);
		account1.displayAccountDetails();
		account2.displayAccountDetails();
		account2.deposit(100);
		account2.withdraw(800);
	}

}
