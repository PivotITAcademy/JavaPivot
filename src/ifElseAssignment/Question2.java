package ifElseAssignment;

public class Question2 {

	/*
	 * Ontario license authority checks for two things to issue a license, first is the age of person and the current level (G1 or G2 or G) .
	 * Assume different values for these two values and write code which will print, whether license will be used to the person or not and if the license is issued,
	 *  which type of license the person will get i.e. he will get a G1 or G2 or G.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 17;
		
		int level = 6;
		
		String licenseIssued = "none";
		
		
		if(age>=16) {
			//Check level
			if(level==0) {
				licenseIssued = "G1";
			}else if(level==1){
				licenseIssued="G2";
			}else if(level==2) {
				licenseIssued="G";
			}else {
				System.out.println("not a valid level");
			}
			if(!licenseIssued.equals("none")) {
				System.out.println("Congratulation on getting license "+licenseIssued);
			}
		}else {
			System.out.println("Not eligible for driving license");
		}
	}

}
