package ifElseAssignment;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double priceOfProduct = 0;
		
		String promoCode = "";
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product price");
		
		priceOfProduct = sc.nextDouble();
		
		System.out.println("Enter promo code ");
		
		//To read string value - use next() method
		promoCode = sc.next();
		
		double finalDiscountedValue = 0;
		//50 % is applied on all products
		double halfPriceDiscountValue = priceOfProduct*0.5;
		
		if(promoCode.equals("")) {
			finalDiscountedValue = halfPriceDiscountValue;
		}else if(promoCode.equals("Promo5")) {
			finalDiscountedValue = halfPriceDiscountValue - (halfPriceDiscountValue*0.05);
		}else if(promoCode.equals("Promo10")) {
			finalDiscountedValue = halfPriceDiscountValue - (halfPriceDiscountValue*0.1);
		}else if(promoCode.equals("Promo20")) {
			finalDiscountedValue = halfPriceDiscountValue - (halfPriceDiscountValue*0.2);
		}
		
		
		System.out.println(finalDiscountedValue);
	}

}
