package ifElseAssignment;

public class Question1 {

	/*
	 * . Create a program which takes the percentage scored by a student as input and based on the value print the grade.

		Percentage	Grade
			0-50	D
			50 -60	C
			60-75	B
			75 & above	A

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double percentage = 75;
		
		String grade = "";
		
		if(percentage<=50) {
			grade = "D";
		}else if(percentage<60) {
			grade ="C";
		}else if(percentage<75) {
			grade ="B";
		}else {
			grade ="A";
		}
		
		System.out.println("Grade : "+grade);
	}

}
