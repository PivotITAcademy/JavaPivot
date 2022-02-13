package inheritance;

public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI sbi = new SBI();
		
		System.out.println("Interest provide : "+sbi.provideInterest());
		
		
		ICICI icici = new ICICI();
		
		System.out.println("Interest provide : "+icici.provideInterest());
	}

}
