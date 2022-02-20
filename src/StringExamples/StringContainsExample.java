package StringExamples;

public class StringContainsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String randomText = "Alphabets abc";

		// Find if the string contains abc

		if (randomText.contains("abc")) {
			System.out.println("Display abcd song");
		} else {
			System.out.println("Word not found");
		}

		// Find how many students have jit in there name
		String[] names = { "Inderjit", "Simarjit", "Kamaljit", "SriPriya", "Priyanka", "Neeru", "Mamatha", "Thomas" };

		int counter = 0;

		for (int i = 0; i < names.length; i++) {

			if (names[i].contains("jit")) {
				counter++;
			}
		}
		
		System.out.println("How many Jits : "+counter);
	}

}
