package conditionalStatements;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if(condition is true or false) { System.out.println(""); }
		 * 
		 * 
		 */

		// Find if a number is even
		int num = 8;
		
		boolean isEven = num%2==0;
		int sum = 2+2;
		//if(num%2==0)
		//if(false) skip the block
		// if( true) go inside the block
		
		if(isEven) {
			System.out.println("Number is even");
		}

	}

}
