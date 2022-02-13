package interfaces;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BanquetHall hall =null;
		Cherry cherry = new Cherry();

//		Blossom blossom = new Blossom();
//
//		Harmony harmony = new Harmony();
//
//		cherry.provideSeatingArrangements();
//
//		cherry.provideDrinks();
//
//		cherry.provideFood();

		// Using parent class reference variable to access child class object

		Scanner sc = new Scanner(System.in);
		System.out.println("Select a hall");

		String hallName = sc.next();

		if (hallName.equals("Cherry")) {
			hall = new Cherry();
		}else if(hallName.equals("Blossom")) {
			hall = new Blossom();
		}

		hall.provideSeatingArrangements();

		

		hall.provideSeatingArrangements();
	}

}
