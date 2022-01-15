package loopsAsignment;

import java.util.Scanner;

public class ValidateSignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String savedUserId = "pivotAdmin";
		String savedPassword = "Admin123";

		String userId = null;
		String password = null;

		int failedAttempt=0;

		Scanner sc = new Scanner(System.in);

		while(failedAttempt!=3) {

			System.out.println("Enter username");
			userId = sc.next();

			System.out.println("Enter password");
			password = sc.next();

			if (userId.equals(savedUserId) && password.equals(savedPassword)) {
				System.out.println("You are logged in to the application");
				break;
			} else {
				
				failedAttempt++;
				if(failedAttempt>2) {
					System.out.println("Account locked");
				}else {
					System.out.println("Incorrect User id or password.Try again");
				}
			}

			
			while(failedAttempt<3) {
				// reset Password
				System.out.println("enter new password");
				String newPassword = sc.next();
				savedPassword = newPassword;
			}
			
		}
	}

}
