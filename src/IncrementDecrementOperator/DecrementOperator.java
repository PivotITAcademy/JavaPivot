package IncrementDecrementOperator;

public class DecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 4;
		
		num1--; // Post Decrement operator num1 = num1-1;  or num1-=1
		// Use it and then decrease it
		
		
	
		System.out.println(num1);
		
		--num1 ; //PreDecrement operator num1 = num1 -1;
		// decrease it and use it
		
		int num2 =5 ;
		
		num2 = num1 + num1;
		
		/*
		 *  num2 +num1 = 5+2 = 7//use it
		 *  num2 = 7, num1 =2; 
		 *  then decrement it 
		 *  num1-- = num1 -1 = 2-1 =1
		 */
		
		System.out.println(num2);
		
		System.out.println(--num1);
		
		System.out.println(num1);
		
		int a = 10;
				
		System.out.println((a++)+(++a));	
		

	}

}
