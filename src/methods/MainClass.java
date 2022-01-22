package methods;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		//Instance of class
		Scanner sc = new Scanner(System.in);
	
		
		
		int number1 =10;
		int number2 =10;
		
		int a=30;
		
		int b=40;
		
		String s ="abc";
		
		boolean br = true;
		
		double d = 22.0;
		
		
		// TO use any class and its method, we need an object of it . 
		//Object of an class is also known as instance of the class.
		//Instantiation 
		// Syntax of creating an object : ClassName classVariableName  = new ClassName();
		
		SimpleMethod sMethod = new SimpleMethod(); 
		
		// Using the object to call method 
		sMethod.addTwoNumbers();
		
		/*
		 * Adding two number using a method with arguments
		 */
		
		//Instantiate a class
		MethodWithArgument methodWithArgument = new MethodWithArgument();
		
		//Calling the method with hard code values
		methodWithArgument.addTwoNumbers(10,20);
		
		//Value passed in the method should have the same datatype as the method arg
		//Calling the method with variables
		methodWithArgument.addTwoNumbers(a,b);
		
		//Calling the method with one hardCoded value and one variable
		methodWithArgument.addTwoNumbers(10,number1);
		
		
		
	}

}
