
public class Bank {

	public static void main(String[] args) {
		//create instance of bank account
		BankAccount ericasAccount = new BankAccount ("Erica Davis", 500, 150);
		BankAccount yumikasAccount = new BankAccount ("Yumika Amemiya", 300);

				
		//cash a check
		//ericasAccount.deposit();
		yumikasAccount.deposit();
				
				
		//withdraw
		ericasAccount.withdraw();
		yumikasAccount.withdraw();
		
		//display the balance
		System.out.println("Your balence is: " + ericasAccount);
		System.out.println("Your balence is: " + yumikasAccount);
	}

}
