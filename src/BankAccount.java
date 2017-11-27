import javax.swing.JOptionPane;

public class BankAccount {
	//attributes
	private String holderName;
	private int currentBalence;
	private int lowestBalence;
	
	//methods
	//constructor
	public BankAccount (String hn, int cb, int lb) {
		holderName= hn;
		currentBalence = cb;
		lowestBalence = lb;
	}
	public BankAccount(String hn, int cb) {
		holderName= hn;
		currentBalence = cb;
	}
	//setters
	public void setLowestBalence(int lb) {
		if(lb <0) {
			System.out.println("Balence is not possible");
		}
		else {
			return; 
		}
	}
	private void setCurrentBalence(int cb){
		return;
	}
	
	//getters
	public String getholderName() {
		return holderName;
	}
	public int getcurrentBalence() {
		return currentBalence;
	}
	public int getlowestBalence() {
		return lowestBalence;
	}
	
	//deposit
	public void deposit () {
		String input= JOptionPane.showInputDialog("What would you like to deposit?");
		double amount= Double.parseDouble(input);
		currentBalence += amount;
	}
	//withdraw
	public void withdraw () {
		String input2= JOptionPane.showInputDialog("What would you like to withdraw?");
		double amount= Double.parseDouble(input2);
		if ((currentBalence - amount) <= lowestBalence) {
			String input3 = JOptionPane.showInputDialog("Are you sure? answer y or n");
			if (input3.equals("y")){
				currentBalence -= amount;
			}
		}
	}
	public String toString() {
		String BankAccount = "Holder Name: " + holderName + "\n" + "Current Balance:  " + currentBalence + "\n" + "Lowest Balance "+ lowestBalence;
		return BankAccount;
	}
}
