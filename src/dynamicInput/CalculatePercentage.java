package dynamicInput;

import java.util.Scanner;

public class CalculatePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		double rate=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the amount");
		
		//TO read 
		double amount = sc.nextDouble();
		
		
		
		System.out.println("Enter the interest rate");
		
		rate = sc.nextDouble();
		
		System.out.println("enter the no of years");
		
		double noOfYears = sc.nextDouble();
		
		double simpleInterest = (amount*rate*noOfYears)/100;
		
		System.out.println("simple Interest :"+simpleInterest);
		
		
	}

}
