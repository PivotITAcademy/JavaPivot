package arrays;

import java.util.Scanner;

public class PopulateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Populate/Filling/Adding value in, an array using for loop

		// Create an array to store 5 names
		String[] students = new String[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < students.length; i++) {

			System.out.println("enter next student name ");
			// Read the value from console and put/store it at the index specified by i
			students[i] = sc.next();

		}
				
		// Print the students array
		for (int i = 0; i < students.length; i++) {

			System.out.println(students[i]);
		}
	}

}
