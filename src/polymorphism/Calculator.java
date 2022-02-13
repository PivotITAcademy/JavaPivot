package polymorphism;

public class Calculator {

	// Multiply two number of same datatype int int
	
	//multiply two numbers of different datatypes double double
	
	//multiply 3 number of same datatype int int int
	//No of arguments changed
	public int multiply(int num1, int num2, int num3) {
		return (num1*num2*num3);
	}
	
	public int multiply(int num1, int num2) {
		return (num1*num2);
	}
	
	//Datatype changed
	public double multiply(double num1, double num2) {
		return (num1*num2);
	}
	
	
	public double multiply(double num1, int num2) {
		return (num1*num2);
	}
	//Order changed
	public double multiply(int num1, double num2) {
		return (num1*num2);
	}
	
	double sum(float a,int b) {
		return a+b;
	}

	double sum(int a, float b) {
		return a+b;
	}

	double sum(double a, float b) {
		return a+b;
	}
	
	
}
