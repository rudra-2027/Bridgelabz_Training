package Inheritence;
class BankAccount{
	String accountNumber;
	double balance;
	public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
	  public String getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println(" Deposited: " + amount + ", \n New Balance: " + balance);
	    }
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println(" Withdrawn: " + amount + ", \n Remaining Balance: " + balance);
	        } else {
	            System.out.println("Insufficient Balance!");
	        }
	    }
	    public void displayAccount() {}

	
}
class SavingsAccount extends BankAccount{
	double interestRate;
	 public SavingsAccount(String accountNumber, double balance, double interestRate) {
	        super(accountNumber, balance);
	        this.interestRate = interestRate;
	    }
	 public void addInterest() {
	        double interest = balance * (interestRate / 100);
	        deposit(interest);
	        System.out.println(" Interest Added: " + interest);
	    }
	 @Override
	 public void displayAccount() {
	        System.out.println("This is a Savings Account.");
	    }

	
}
class CheckingAccount extends BankAccount{
	double withdrawalLimit;
	public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
	@Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println(" Withdrawal exceeds the limit of: " + withdrawalLimit);
        } else {
            super.withdraw(amount);
        }
    }

	 @Override
	 public void displayAccount() {
	        System.out.println("This is a Checking Account.");
	    }
}
class FixedDepositAccount extends BankAccount{
	 int durationInMonths;
     public FixedDepositAccount(String accountNumber, double balance, int durationInMonths) {
		super(accountNumber, balance);
		this.durationInMonths = durationInMonths;
	}

   
    public void displayDuration() {
        System.out.println(" Fixed Deposit Duration: " + durationInMonths + " months.");
    }

    @Override
    public void displayAccount() {
        System.out.println("This is a Fixed Deposit Account.");
    }
}
public class Bank_Account {
	public static void main(String[] args) {
		 SavingsAccount sa = new SavingsAccount("S1", 1000, 5);
	        sa.displayAccount();
	        sa.addInterest();

	        CheckingAccount ca = new CheckingAccount("C1", 2000, 500);
	        ca.displayAccount();
	        ca.withdraw(600);
	        ca.withdraw(300);

	        
	        FixedDepositAccount fda = new FixedDepositAccount("F1", 5000, 12);
	        fda.displayAccount();
	        fda.displayDuration();
	}
}
