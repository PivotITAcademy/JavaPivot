package methods;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account obj = new Account();
		
		String accountOwnerName = "";
			
		
		accountOwnerName = obj.getAccountName();
		
		System.out.println("Account Owner name : "+accountOwnerName);
		
		
		
		//Update Name in the account
		accountOwnerName = "Kate";
		obj.setAccountName("simar");
		
		System.out.println("Account Owner name : "+accountOwnerName);
		
		
		accountOwnerName = obj.getAccountName();
		System.out.println("Account Owner name : "+accountOwnerName);
		
		//Withdraw money		
		
			
		double withdrawMoney = obj.withDrawMoney(400, "4111111111111111", 1111);
		
		//Prints balance
		
		if(withdrawMoney>0) {
			
			System.out.println("Please collect your cash  "+withdrawMoney);
		}else {
			System.out.println("Withdrawl amount is "+withdrawMoney);
		}
		
		
		
		
	}
	
}
