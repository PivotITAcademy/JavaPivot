package inheritance;

public class Car extends Vehicle {
	
	public void numberOfSeats(int noOfSeats) {
		System.out.println("The seats in car is " + noOfSeats);
		
		System.out.println(vehicleType);
	}

//	public void startCarEngine() {
//		
//	}
	
	//Add specific functionality to startEngine
	//Overriding
	//Method syntax - method definition remains same
	//Method Accessmodifier, same name , same return type
	//Change the method body
	
	
	public void startEngine() {
		
		System.out.println("Car Engine Started");
	}
}
