package loopsAsignment;

import java.util.Scanner;

public class Question3PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive no");
		
		double num = sc.nextDouble();
		
		boolean isPrime = true;
		if(num<40) {
			if(num>1 && num!=2 && num%2==0) {
				isPrime=false;
			}
		}else {
			if(!((num+1)%6 == 0 ||(num-1)%6==0)) {
				isPrime=false;
			}
		}
		System.out.println("num is prime :"+isPrime);
	}

}
