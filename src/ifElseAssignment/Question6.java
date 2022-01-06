package ifElseAssignment;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double priceOfProduct = 100;
		
		String promoCode = "Promo20";
		
		double finalDiscountedValue = 0;
		double halfPriceDiscountValue = priceOfProduct*0.5;
		
		if(promoCode.equals("")) {
			finalDiscountedValue =halfPriceDiscountValue;
		}else if(promoCode.equals("Promo5")) {
			finalDiscountedValue = halfPriceDiscountValue - ((halfPriceDiscountValue*0.5)*0.05);
		}else if(promoCode.equals("Promo10")) {
			finalDiscountedValue = halfPriceDiscountValue - (halfPriceDiscountValue*0.1);
		}else if(promoCode.equals("Promo20")) {
			finalDiscountedValue = halfPriceDiscountValue - (halfPriceDiscountValue*0.2);
		}
		
		
		System.out.println(finalDiscountedValue);
	}

}
