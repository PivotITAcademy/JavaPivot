package exceptionHandling;

public class ThrowMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			try {
				ThrowExample.checkAge(17);
				System.out.println("Enter the bar");
				System.out.println("Party");
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
			
	}
}
