package inheritance;

public class Main {
	public static void main(String[] args) {

		System.out.println("This is how a car works");
		Car car = new Car();
		//Method called depends on the object
		car.startEngine();
		
		

//		car.numberOfSeats(5);
//
//		car.applyBrakes();
//
//		car.stopEngine();
//		

		// Vehicle class - parent class
		Vehicle vehicle = new Vehicle();
		vehicle.startEngine();

//		// Truck
		Truck truck = new Truck();
		truck.startEngine();
		
//		truck.towTrailer(true);
//		truck.applyBrakes();
//		truck.stopEngine();

	}
}
