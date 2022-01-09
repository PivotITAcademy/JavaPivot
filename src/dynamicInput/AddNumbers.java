package dynamicInput;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 0;

		// Get Input at runtime
		// First Create an variable for scanner class - 
		//Use scanner to read from System.in aka console
		// Need to create sc variable 
		Scanner sc = new Scanner(System.in);
		
		//Prompting user to enter first number
		System.out.println("Enter first  number");
		
		//To read integer values from console we use nextInt() method
		 num1 = sc.nextInt();
		 
		//Prompting user to enter second number
		 System.out.println("Enter seecond  number");
		  num2 = sc.nextInt();

		int sum = num1 + num2;

		System.out.println("Addition result : " + sum);
	}

}
