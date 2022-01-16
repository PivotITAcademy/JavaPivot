package arrays;

import java.util.Scanner;
public class UsingForWithArray {

	
	public static void main(String[] args) {
		
		int[] numbersList =  {10,20,30,44,22,87, 88,21, 23,3989,33, 23 , 11,567};
		
		//To get the length of an array - arrayVariableName.length
		System.out.println("Length of an array : "+numbersList.length);
		
		//Printing an entire array 
		//for(int i=0; i< length ofArray; i++)
		
		for(int i=0;i<numbersList.length;i++) {
			
			System.out.println(numbersList[i]);
		}
		
		//Populate/Filling/Adding value in,  an array using for loop
		
		//Create an array to store 5 names
		String[] students = new String[5];
		
	
		
		Scanner sc = new Scanner(System.in);
				
		for(int i=0; i<students.length;i++) {
			
			System.out.println("enter next student name ");
			//Read the value from console and put/store it at the index specified by i 
			students[i] = sc.next();
		
		}
//		
//		
		//Print the students array
		for(int i=0;i<students.length;i++) {
			
			System.out.println(students[i]);
		}
//		
		// finding an element in an array - TO find an element in array we have to compare each value in the array with the value we are looking for
		//Find 23 in numbersList array
		boolean isFound = false;
		int counter=0;
		
		for(int i=0;i<numbersList.length;i++) {
			
			if(numbersList[i] ==23 ) {
				isFound = true;
				counter++;
			}
			
		}
		
		System.out.println(" number 23 is found "+counter+"  times");
		
		/*
		 * numbersList[0]==23 
		 * numbersList[1] ==23
]		 */
		
	}

}
