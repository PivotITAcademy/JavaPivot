package staticExamples;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Are you in canada");
		boolean isCanadianResident = sc.nextBoolean();
		
		System.out.println("Do you have valid id");
		boolean haveValidId = sc.nextBoolean();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		
		boolean isEligible = BankAccount.eligibilityToOpenAnAccount(isCanadianResident, haveValidId, age);

		if (isEligible) {
			// Open the BankAccount

			BankAccount ketakiAccount = new BankAccount();
			ketakiAccount.setAccountHolderName("ketaki");
			System.out.println("Enter the balance you want to add to account");
			double amount = sc.nextDouble();

			
			if (amount >= BankAccount.minBalance) {
				ketakiAccount.setBalance(amount);
			}else {
				System.out.println("Please enter an amount greater than "+BankAccount.minBalance);
			}
		}else {
			System.out.println("Not eligible to open an account");
		}

	}

}
