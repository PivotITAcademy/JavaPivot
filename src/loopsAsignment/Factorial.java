package loopsAsignment;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BigInteger fact=BigInteger.ONE;
		long fact=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		
		int num = sc.nextInt();
		
		for(int i=1;i<num;i++) {
			fact =i*fact;
			//fact=fact.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
