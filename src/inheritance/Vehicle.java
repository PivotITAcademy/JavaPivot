package inheritance;

public class Vehicle {

	protected String vehicleType;

	public void startEngine() {
		System.out.println("Engine Started");
	}

	public void stopEngine() {
		System.out.println("Engine Stoped");
	}

	public void applyBrakes() {
		System.out.println("Apply Brakes");
	}

	private void permitType() {
		System.out.println("This is only in vehicle class");
	}

}