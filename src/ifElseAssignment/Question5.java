package ifElseAssignment;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salesAchieved = 75.0;
		
		double commission =0;
		
		if(salesAchieved<=50) {
			commission=1.0;
		}else if(salesAchieved<70) {
			commission = 5.0;
		}else {
			commission =10.0;
		}
		
		System.out.println("commision earned by sales :"+commission);
	}

}
