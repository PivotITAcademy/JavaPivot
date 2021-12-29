package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean inderjitHasNoMoney = true;
		boolean doesManvirHasMoney = true;
		
		boolean ketakiLendsMoney = true;
		
		if(!inderjitHasNoMoney) {
			
			if(doesManvirHasMoney) {
				System.out.println("Let's party");
			}else {
				System.out.println("Enjoy the homecooked tinda");
				
			}
			
		}
		else {
			
			if(ketakiLendsMoney) {
				System.out.println("Let's party");
			}else {
				System.out.println("stay at home");
			}
		}
	}

}
