package constructors;

public class Account {

	String accountName;
	String accountNumber;
	double balance;

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	String cardNumber;

	String getCardNumber() {
		return cardNumber;
	}

	void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	double minBalance =50;
	
	int pinNumber;
	
	// No arg constructor
	Account() {

	}

	// Parameterized constructor
	Account(String accountName) {

		this.accountName = accountName;
	}

	// There can be any number of constructors in a class
	// given they have different input arguments
	Account(String acctName, String acctNumber, double bal) {

		accountName = acctName;
		accountNumber = acctNumber;
		balance = bal;
	}

	//Create a parameterized constructor to initialize cardnum and pin
	
	Account(String cardNumber, int pinNumber) {
		super();
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
	}

	Account(double bal) {
		balance = bal;
	}

	void setAccountName(String acctName) {

		String name;
		accountName = acctName;
	}
	
	boolean cardVerification(String cardNo, int pin) {
		if (cardNo.equals(cardNumber) && (pin == pinNumber)){
			return true;
		}
		return false;
	}
	double withDrawMoney(double amountToBeWithdrawn, String cardNo, int pin) {

		// Call method to verify card
			
			// Compare cardNumber
			if (cardVerification(cardNo, pin) && (balance - amountToBeWithdrawn) >= minBalance) {
				
				balance = balance - amountToBeWithdrawn;
				return amountToBeWithdrawn;

			}

			return 0;
		}
}
