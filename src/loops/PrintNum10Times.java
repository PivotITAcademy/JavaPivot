package loops;

import java.util.Scanner;

public class PrintNum10Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
			
		int counter =1;
		
		// While, do-while and for loop
		
		//Check FIRST  execute afterwards
		/*
		 * while(check condition for counter){
		 * 		//statements that need to be repeated
		 * }
		 */
		while(counter<=5) {
			
			System.out.println("card given "+counter);
			//increase the value of counter by 1
			counter++;	
		}
		
		//execute at least once and then check 
		/*
		 * do{
		 * 	//statements that need to be repeated
		 * }while(check condition)
		 * 
		 */
		do {
			System.out.println("card given "+counter);
			//increase the value of counter by 1
			counter++;
		}while(counter<=5);
		
		//for loop 
		//for(initialize counter;check condition for counter;increment counter)
		for(int forCounter=1;forCounter<=5;forCounter++) {
			
			System.out.println("card given "+forCounter);
		}
		
		
	}

}
