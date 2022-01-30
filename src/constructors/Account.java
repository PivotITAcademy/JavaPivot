package constructors;

public class Account {

	String accountName;
	String accountNumber;
	double balance;
	
	//No arg constructor
	Account(){
		
	}


	
	
	Account(String accountName) {

		this.accountName = accountName;
	}



	Account(String acctName, String acctNumber, double bal){
		
		accountName = acctName;
		accountNumber = acctNumber;
		balance = bal;
	}
	
	Account(double bal){
		balance = bal;
	}
	
	void setAccountName(String acctName) {
		
		String name;
		accountName = acctName;
	}
}
