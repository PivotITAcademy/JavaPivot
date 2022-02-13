package polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator = new Calculator();

		System.out.println(calculator.multiply(10, 5.0));

		System.out.println(calculator.multiply(10, 10, 12));

		System.out.println(calculator.multiply(10, 10));
		
		float num1 = 1.5f;
		
		System.out.println(calculator.sum(num1,2));

		System.out.println(calculator.sum(10.58888, 1.5f));
	}

}
