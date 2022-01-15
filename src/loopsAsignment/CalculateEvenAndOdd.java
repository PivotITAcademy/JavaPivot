package loopsAsignment;

import java.util.Scanner;

public class CalculateEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of numbers u want to enter");
		int count = sc.nextInt();
		
		int evenCount=0;
		
		int oddCount =0;
		
		int number = 0;
		
		for(int i=0;i<count;i++) {
			
			System.out.println("Enter number ");
			
			number= sc.nextInt();
			
			if(number%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		
		System.out.println("No of even numbers entered :"+evenCount);
		
		System.out.println("No of odd numbers entered :"+oddCount);
	}

}
