package abstraction;

public abstract class Blossom extends BanquentHall {

//	@Override
//	public void setBar() {
//		System.out.println("Serving cocktails only");
//	}

	@Override
	public void serveStarters() {
		System.out.println("serve paneer tikka");
	}
	
	public void setDanceFloor() {
		System.out.println("Only hall with dance floor");
	}
}
