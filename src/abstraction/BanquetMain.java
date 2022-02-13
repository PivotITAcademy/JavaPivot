package abstraction;

public class BanquetMain {

	public static void main(String[] args) {
		
		Cherry cherry = new Cherry();
		//Do the initial setup for the hall
		cherry.setBar();
		cherry.serveStarters();
		
//		Blossom blossom = new Blossom();
//		
//		blossom.setBar();
//		blossom.serveStarters();
		
		PremiumBlossom premiumBlossom = new PremiumBlossom();
		premiumBlossom.serveStarters();
		premiumBlossom.setBar();
		premiumBlossom.setDanceFloor();
	}

}
