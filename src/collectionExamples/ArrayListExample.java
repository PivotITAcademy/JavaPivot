package collectionExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Intializing the arraylist variable
		ArrayList<Integer>  intArrayList = new ArrayList<Integer>();
		
		ArrayList<String> stringList = new ArrayList<String>();
		
		ArrayList<Double> doubleList = new ArrayList<Double>();
		
		
		
		
		int[] intArray = new int[9];
		
		intArray[0] = 34;
		intArray[1]=35;
		
		System.out.println(intArray[0]);
		
		//Add values to an arraylist
		
		intArrayList.add(34);
		
		intArrayList.add(35);
		
		intArrayList.add(36);
		
		System.out.println(intArrayList.toString());
		
		System.out.println("Get 36 number from list "+intArrayList.get(intArrayList.indexOf(36)));
		//Length of arraylist 
		
		System.out.println("Size of list:"+intArrayList.size());
		
		//Remove element from List
		
		intArrayList.remove(0);
		
		System.out.println(intArrayList.toString());
		
		
		stringList.add("Mamatha");
		stringList.add("Neeru");
		stringList.add("Inderjit");
		
		System.out.println(stringList.toString());
		
		System.out.println("Index at which Inderjit name is stored : "+stringList.indexOf("Inderjit"));
		
		stringList.remove(stringList.indexOf("Inderjit"));
		
		System.out.println(stringList.toString());
		
		
		//Retrieve values from Arraylist
		
		System.out.println(stringList.get(1));
		
		System.out.println(stringList.get(stringList.indexOf("Neeru")));
		
		//To find an element in the list
		System.out.println( "Is Neeru name is the list:"+ stringList.contains("Neeru"));
		
	
		
		
	}

}
