package interfaces;

public class Cherry implements BanquetHall{

	@Override
	public void provideSeatingArrangements() {
		// TODO Auto-generated method stub
		System.out.println("U shape seating arrangement");
	}

	@Override
	public void provideFood() {
		// TODO Auto-generated method stub
		System.out.println("Provide both veg and non-veg options");
	}

	@Override
	public void provideDrinks() {
		// TODO Auto-generated method stub
		System.out.println("Serve whiskey");
	}

	
	public void provideChildPlayArea() {
		System.out.println("Children Play area");
	}
}
