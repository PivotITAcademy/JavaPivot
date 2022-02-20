package StringExamples;

public class SubStringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Inderjit Singh knows Kamaljit";
		
		String name1 = name.substring(name.indexOf("Kamaljit"));
		
		System.out.println(name1);
		
		String name2 = name.substring(name.indexOf("Inderjit Singh"));
		
		System.out.println(name2);
		
		String name3 = name.substring(name.indexOf("Inderjit Singh"), name.indexOf("knows"));
		
		System.out.println(name3.trim());
		
		String fullName = "Inderjit,Singh";
		
		String lastName = fullName.substring(fullName.indexOf(",")+1);
		
		System.out.println(lastName);
		
		String firtName = fullName.substring(0,fullName.indexOf(",") );
		
		System.out.println(firtName);
		
		
				
	}

}
