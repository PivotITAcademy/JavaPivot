package comparisonOperators;

public class GreaternLessThanOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =5;
		int num2 = 6;
		
		boolean isGreater = num2>num1;
		System.out.println("isGreater = "+isGreater);
		
		boolean isSmaller = num1<num2;
		System.out.println("isSmaller :"+isSmaller);

		System.out.println(num1<=num2);
		
		System.out.println(num2>=num1);
	}

}
