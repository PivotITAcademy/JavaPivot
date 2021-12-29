package conditionalStatements;

public class FindNumberGreaterThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find greatest number of two numbers
		int num1 =100;
		
		int num2 = 55;
			
		boolean isGreater = num1>num2;
		
		//Print the greatest number
		if(isGreater) {
			System.out.println("num1 is greater than num2"+isGreater);
		}else {
			System.out.println("num2 is greater than num1");
		}
 
	}

}
