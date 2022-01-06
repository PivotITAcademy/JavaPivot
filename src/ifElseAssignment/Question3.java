package ifElseAssignment;

public class Question3 {

	//Find largest of three numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =7;
		int num2 =12;
		int num3=3;
		
		int largestNumber =0;
		
		if(num1>num2) {
			
			if(num1>num3) {
				largestNumber=num1;
			}else {
				largestNumber=num3;
			}
		}else {
			if(num2>num3) {
				largestNumber=num2;
			}else {
				largestNumber=num3;
			}
		}
		
		System.out.println("largest num :"+largestNumber);
	}

}
