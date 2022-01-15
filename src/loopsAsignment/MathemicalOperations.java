package loopsAsignment;

import java.util.Scanner;

public class MathemicalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;

		int num2 = 0;

		String operation = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1");

		num1 = sc.nextInt();

		System.out.println("Enter num2");

		num2 = sc.nextInt();

		System.out.println("Enter operation you want to perform on these numbers");

		operation = sc.next();
		
		boolean isValid = true;

		switch (operation) {

		case "Add":
			System.out.println("Addition of two nums : " + (num1 + num2));
			break;

		case "Substract":
			System.out.println("num1 - num2 = " + (num1 - num2));
			break;

		default:
			System.out.println(operation+" is not a valid operation");

		}
		
		
		
		for(int i=0;i<10;i++) {
			System.out.println("num ="+i);
		}
		
	
		

//		if (operation.equals("Add")) {
//			System.out.println("Addition of two nums : " + (num1 + num2));
//		} else if (operation.equals("Substract")) {
//			System.out.println("num1 - num2 = " + (num1 - num2));
//		} else {
//			System.out.println("Not a valid operation");
//		}
//		
//		String s1 = "Add";
//		String s2 = "add";
//		
//		System.out.println(s1.equals(s2));
	}

}
