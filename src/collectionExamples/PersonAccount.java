package collectionExamples;

public class PersonAccount {

	private String cardNumber;
	
	private String accountHolderName;
	
	private int pin;
	
	private String password;

	public PersonAccount(String cardNumber, String accountHolderName, int pin,String password) {
		super();
		this.cardNumber = cardNumber;
		this.accountHolderName = accountHolderName;
		this.pin = pin;
		this.password =password;
	}

	

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
