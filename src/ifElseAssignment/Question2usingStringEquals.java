package ifElseAssignment;

public class Question2usingStringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 17;

		String level = "";

		String licenseIssued = "none";

		if (age >= 16) {
			// Check level
			if (level.equals("")) {
				licenseIssued = "G1";
			} else if (level.equals("G1")) {
				licenseIssued = "G2";
			} else if (level.equals("G2")) {
				licenseIssued = "G";
			} else {
				System.out.println("not a valid level");
			}
			if (!licenseIssued.equals("none")) {
				System.out.println("Congratulation on getting license " + licenseIssued);
			}
		} else {
			System.out.println("Not eligible for driving license");
		}
	}

}
