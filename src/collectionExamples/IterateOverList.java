package collectionExamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterateOverList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Mamatha");
		stringList.add("Neeru");
		stringList.add("Inderjit");
		
		System.out.println("Printing list using for loop \n");
		for(int i=3;i<stringList.size();i++) {
			
			//array[i] - SYntax for array for comparison only 
			//Syntax of getting element from list - list.get(i)
			System.out.println(stringList.get(i));
		}
		
		
		ListIterator<String> iterator = stringList.listIterator();
		
		System.out.println("Printing list using Iterator \n");
		// while there are elements in the list
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}
		
		//Removes all elements from the list and you get an empty list
		stringList.clear();
	}

}
