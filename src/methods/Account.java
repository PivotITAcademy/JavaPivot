package methods;

public class Account {

	String accountName = "Ketaki";

	double accountNumber = 46646; // 46645

	double accountBalance = 500.0;
	int minBalance = 50;
	

	String cardNumber = "4111111111111111";

	int pinNumber = 1111;

	// Method with Return Type
	String getAccountName() {
		
		return accountName;
	}

	// Create a method to return accountNumber value

	double getAccountNumber() {
		
		String name = getAccountName();
		return accountNumber;
	}

	// Update or set the value

	void setAccountName(String name) {
		accountName = name;
	}

	// Create a method to set/update value of account number

	// Method with return type and input arguments
	// Money withDrawMoney(amountToBeWithdrawn,cardNo,pin,minBalance)

	double withDrawMoney(double amountToBeWithdrawn, String cardNo, int pin) {

		System.out.println("Welcome : "+getAccountName());
		
		// Compare cardNumber
		if (cardNo.equals(cardNumber) && (pin == pinNumber) && (accountBalance - amountToBeWithdrawn) >= minBalance) {
			
			accountBalance = accountBalance - amountToBeWithdrawn;
			return amountToBeWithdrawn;

		}

		return 0;
	}
}
