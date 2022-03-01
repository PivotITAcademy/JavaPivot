package collectionExamples;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashmap is used to store key value 
		//HashMap<SIN, Name> sinNoMap
		HashMap<String, String> sinNoMap = new HashMap<String, String>();
		
		HashMap<Integer, String> rollNoMap = new HashMap<Integer, String>();
		
		HashMap<String, PersonAccount> accountMap = new HashMap<String, PersonAccount>();
		
		HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
		//Put values in a hashmap
		
		sinNoMap.put("345678999", "Ketaki");
		
		sinNoMap.put("345678990", "Manvir");
		
		sinNoMap.put("345678930", "Simar");
		
		sinNoMap.put("345478992", "Neeru");
		
		sinNoMap.put("345478998", "Inderjit");
		
		sinNoMap.put("345478996", "Swaroop");
		
		sinNoMap.put("345478993", "Sreepriya");
		
		sinNoMap.put("345478994", "Swaroop");
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter sin no");
		
		//String sin = sc.next();
		
		//Find person who is recognised by sin no
		
		// Get name from the map
		
	//	System.out.println(sinNoMap.get(sin));
		
		//Swaroop name 
		
		System.out.println(sinNoMap.get("345478996"));
		
		// Employee Map
		
		Employee emp1 = new Employee("Ketaki", "SDET");
		
		Employee emp2 = new Employee("manvir", "SDET");
		
		employeeMap.put(1, emp1);
		employeeMap.put(2, emp2);
		
		System.out.println("Employee Name :"+employeeMap.get(1).getName());
		
		System.out.println("Employee Job Desc :"+employeeMap.get(1).getJobDesc());
		
		
		
	}

}
