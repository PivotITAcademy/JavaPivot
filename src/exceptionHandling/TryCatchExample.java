package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import collectionExamples.PersonAccount;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> employeeIds = new ArrayList<Integer>();

		employeeIds.add(1);
		employeeIds.add(2);
		employeeIds.add(3);
		employeeIds.add(4);
		employeeIds.add(5);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an index value");

		int id = sc.nextInt();

		try {
			
			FileInputStream stream = new FileInputStream(new File("C:/users.txt"));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//closing connections
			//close DB connection 
			sc.close();
		}

		
		String s = null;

		PersonAccount account = null;

		try {
			System.out.println(account.getCardNumber());
			System.out.println(s.equals("abc"));

		} catch (NullPointerException npe) {
			
			System.out.println("Initialize your object before using it");
			npe.printStackTrace();
		}

		// Get employeeId

		// Try block
		try {

			System.out.println(employeeIds.get(id));

		} catch (Exception exception) {

			System.out.println("Employee id does not exist");
			// exception.printStackTrace();
		}

		System.out.println("At line 40");

	}

}
