package assignment2Operators;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		x = x++ + ++x + x++ + ++x + ++x;
		System.out.println("Value of x : " + x);
		//Even number is completely divisble by two - remainder is zero 
		
		boolean isEven = (x%2==0);
		System.out.println("x is even :"+isEven);
	}

}
