package constructors;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Constructor is used to create object of the class . Java provides a default
		 * constructor if one is not declared Constructor has same name as class
		 * Constructor does not have a return type it is quite similar to method
		 */
		Account obj1 = new Account();
		obj1.setAccountName("Priya");

		System.out.println("Account Name 1:" + obj1.accountName);
		System.out.println("Account 1 balance : " + obj1.balance);

		Account obj2 = new Account("Manvir");

		System.out.println("Account Name 2:" + obj2.accountName);
		System.out.println("Account 2 balance : " + obj2.balance);

		Account obj3 = new Account("Thomas", "786868686", 10.0);
		System.out.println("Account Name 3 :" + obj3.accountName);
		System.out.println("Account 3 balance : " + obj3.balance);

		Account obj4 = new Account(500);
		System.out.println("Account Name 4 :" + obj4.accountName);
		System.out.println("Account 4 balance : " + obj4.balance);
		
		Account obj5 = new Account("4111111111111111", 1111);
		obj5.setBalance(500);
		obj5.withDrawMoney(100, obj5.getCardNumber(), obj5.pinNumber);

	}

}
