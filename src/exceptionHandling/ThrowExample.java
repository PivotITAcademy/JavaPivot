package exceptionHandling;

public class ThrowExample {

	public static void checkAge(int age) throws Exception {

		if (age > 18) {
			System.out.println("Permission to drink");

		} else {
			// System.out.println("Invalid age");
			throw new Exception("Invalid age");
		}
	}
}
