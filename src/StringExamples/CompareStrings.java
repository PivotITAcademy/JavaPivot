package StringExamples;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String address1 = "JohnStreet";
		
		String address2 ="johnStreet";
		
		String employeeId ="A2345";
		
		
		
		//Does a case sensitive comparison
		System.out.println("Both addresses are equal : "+address1.equals(address2));
		
		//Does a case insensitive comparison
		System.out.println("Both addresses are equal : "+address1.equalsIgnoreCase(address2));
		
		System.out.println("Employee id matches :"+employeeId.equals("a2345"));
		
		System.out.println("Employee id matches :"+employeeId.equals("A2345"));
		
		
	}

}
