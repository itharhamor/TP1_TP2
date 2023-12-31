package TP1EX1;

class MainBank {
	public static void main(String[]args) {
		
		//Creating User.
		BankAccount userAccount=new BankAccount(1111,"USER1",1111);
		System.out.println("Account Number: " + userAccount.getAccountNumber());
        System.out.println("Account Holder: " + userAccount.getAccountHolderName());
        System.out.println("Balance: $" + userAccount.getBalance());
		
        //Depositing and withdrawing
        userAccount.deposit(500);
        userAccount.withdraw(200);
        
        //Updated balance
        System.out.println("New Balance: $" + userAccount.getBalance());
        
        //Testing invalid requests
        userAccount.deposit(-1);
        userAccount.withdraw(5000);
	}
}
