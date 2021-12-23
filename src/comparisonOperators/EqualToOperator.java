package comparisonOperators;

public class EqualToOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=2 ; //Declaring and Initializing a variable
		int num2= 4;
		
		String name=null;
		System.out.println("Name ="+name);
		name ="Inderjit";
		System.out.println("Name ="+name);
				
		//Using a variable means i mean i am using it's value
		
		boolean isEqual =false;
				
		isEqual = (num1==num2); // RHS is a comparison - is num1 equals to num2 and the result is saved in isEqual
		// CHeck if two numbers are equal (==)
	
		System.out.println("num1 equals num2 "+isEqual);
		
		num2 = 5;
	//	isEqual = num1==num2;//Comparing two int values and saving result in a boolean variable
		System.out.println("isequal : "+isEqual);
		//Comparing two boolean values and printing it
		System.out.println("isEqual "+(isEqual==true));
		
		double d2 = num2;
		
		boolean isEqual3 = isEqual;
		System.out.println("isEqual3 = "+isEqual3);
		
		//isEqual = num1;
		
		name = "Singh";
		
		System.out.println("Name ="+name);
		
		
		
		

	}

}
