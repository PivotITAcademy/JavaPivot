package loops;

public class DrinkStopper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int noOfPegs =1;
		
		boolean isStarterAvailable = true;
		
		while(noOfPegs<10  && isStarterAvailable) {
			
			
			System.out.println("On peg no : "+noOfPegs);
			
			isStarterAvailable = false;
			if(noOfPegs>5 || !isStarterAvailable) {
				break;
			}
				
			System.out.println("Keep drinking");
			noOfPegs++;
		}
	}

}
