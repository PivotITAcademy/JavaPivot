package exceptionHandling;

public class A {

	public void methodA() throws Exception {
		B b =new B();
		b.methodB();
	}
	
	public static void main(String arg[]) {
		A a = new A();
		try {
			a.methodA();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
