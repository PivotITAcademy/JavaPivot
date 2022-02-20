package StringExamples;

public class Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String searchText = "dresses";
		
		String searchedText = searchText.toUpperCase();
		System.out.println("SEARCH "+searchText.toUpperCase());
		
		System.out.println("Lower case :"+searchedText.toLowerCase());
		
		
		//Find length of string
		
		String password = "";
		System.out.println("password length: "+password.length());
		
		System.out.println("Is password empty : "+password.isEmpty());
		
		
		if(!password.isEmpty() && password.length()>8) {
			
			System.out.println("Allowed to login");
		}else {
			System.out.println("Enter a valid password");
		}
		
		
		String email = "abc@gmail.com";
		
	
		
		if(email.contains("@gmail.com")) {
			System.out.println("valid email format");
		}else {
			System.out.println("Enter a valid email ");
		}
		
		
	}

}
