package methods;

public class MethodWithArgument {

	/*
	 *  Scope of a variable defined as an argument/parameters of a method is 
	 *  restricted to method body
	 */
	
	//Method with 2 arguments
	void addTwoNumbers(int num1, int num2) {

		System.out.println(" Sum of two numbers is " + (num1 + num2));
	}

	void multiplyTwoNumbers(int num1, int num2) {

	}
	
	//Method with 1 argument
	void printString(String name) {
		
		System.out.println("Name is : "+name);
	}
	
	//Method with 3 arguments
	void average(int a, int b,int c) {
		
		double average = (a+b+c)/3;
		
		System.out.println("Average "+average);
	}

}
