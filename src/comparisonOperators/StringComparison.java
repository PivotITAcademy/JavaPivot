package comparisonOperators;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 ="John";
		String name2 ="Jon";
		String name3 ="John";
		
		
		// TO compare strings we use equals method the general structure is str1.equals(str2)
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name2.equals("John"));
		System.out.println("john".equals(name3));
		
		if(name1.equals(name3)) {
			System.out.println("names match");
		}
	}

}
