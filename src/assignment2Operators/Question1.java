package assignment2Operators;

public class Question1 {

	public static void main(String arg[]) {

		int a = 5;
		int x = 10 + ++a; //Increment first and then use it a=1+5 = 6
		a = a + 1;
		x = 10 + 5;
		System.out.println(x);
		System.out.println(a);
	}
}
