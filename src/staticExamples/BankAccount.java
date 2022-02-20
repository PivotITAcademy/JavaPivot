package staticExamples;

public class BankAccount {

	public static double minBalance =1000;
	
	private String accountHolderName;
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
	
		this.balance = balance;
	}
	
	//Common process in a bank account 
	
	public static boolean eligibilityToOpenAnAccount(boolean personisInCanada, boolean hasValidId, int age) {
		
		if(personisInCanada && hasValidId && (age>16)) {
			return true;
		}
		
		return false;
	}
}
