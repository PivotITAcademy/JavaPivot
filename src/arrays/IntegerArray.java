package arrays;

public class IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=0;
		//Store same type of values in a single variable
		//DataTypeofArray[] arrayVariableName = Give all the values in one go
		//Integer array
		int[] numbersList =  {10,20,30,44,22};
		
		//String array
		String[] cities = {"Kingston","Toronto","London","Brampton","Ottawa","Mississauga"};
		
		
		//2nd way of declaring an array
		
		//DataType[] arrayVariableName = new DataType[5];
		
		int[] numbersList2 = new int[5]; //*****Length of array =5 i.e no of values i can store in this array =5
		
		double[] salary = new double[9];
		
		String[] cityList = new String[4];
		
		String city;
		
		// To access a value in an array we need two things 
		// array variable name
		// index where the value is stored
		
		//Access 2nd value in cities 
		
		System.out.println(cities[1]);
		
		System.out.println(cities[2]);
		
		System.out.println(cities[3]);
		
		System.out.println(cities[4]);
		
		System.out.println(numbersList[3]);
		
		System.out.println(numbersList2[1]);
		
		System.out.println(salary[0]);
		
		System.out.println(cityList[0]);
		
		//System.out.println(city);
		
		//Put a value in array
		
		
		salary[0] = 100000;
		salary[1]= 50000;
		salary[5]=45000;
		salary[8]=90000;
		
		
		
		
		
		System.out.println("Salary at index 2 : "+salary[2]);
		
		System.out.println("Salary of 9th person : "+salary[8]);
		
	}

}
