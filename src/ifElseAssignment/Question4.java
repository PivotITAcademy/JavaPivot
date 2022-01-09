package ifElseAssignment;

import dynamicInput.AddNumbers;

public class Question4 {

	/*
	 * Write an application that reads two integers, determines whether the first is
	 * a multiple of the second and prints the result.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 6;
		int num2=3;
		
		AddNumbers add = new AddNumbers();
		
		System.out.println("num1 : "+num1);
		
		System.out.println("num2 : "+num2);
		
		
		if(num1%num2==0) {
			System.out.println("num1 is multiple of num2 ");
		}else {
			System.out.println("num1 is not a multiple of num2");
		}
	}

}
