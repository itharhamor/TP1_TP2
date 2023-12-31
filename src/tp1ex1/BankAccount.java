package TP1EX1;

class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount(int accountNumber, String accountHolderName, double initialBalance) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=initialBalance;
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposit successful. Your new balance is  $"+balance);
		}
		else {
			System.out.println("Invalid request. Please deposit a positive amount");
		}
		
	}
	public void withdraw(double amount) {
		if(amount >= 0) {
			if(amount<=balance) {
				balance-=amount;
				System.out.println("Withdrawal successful. New balance: $" + balance);
				
			}
			else {
				System.out.println("Invalid request. Please withdraw an amount in the limit of your current balance.");
			}
		}
		else {
			System.out.println("Invalid request. Please withdraw a positive amount.");
		}
	}
}
