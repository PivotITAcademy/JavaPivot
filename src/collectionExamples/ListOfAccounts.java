package collectionExamples;

import java.util.ArrayList;

public class ListOfAccounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create a list of accounts
		
		//PErson1 - Inderjit
		//Perso
		

		PersonAccount inderjitAccount = new PersonAccount("8786868", "Inderjit", 1122,"abcd1234");
		
		PersonAccount kamalAccount = new PersonAccount("8686899", "Kamaljit", 1234,"ajdjg");
		
		PersonAccount simarAccount = new PersonAccount("786869", "Simarjit", 2345,"ajgu");
		
		PersonAccount[] accounts = new PersonAccount[3];
		
		ArrayList<PersonAccount> accountList = new ArrayList<PersonAccount>();
		
		accountList.add(inderjitAccount);
		
		accountList.add(kamalAccount);
		
		accountList.add(simarAccount);
		
		//First Create account
		PersonAccount neeruAccount = new PersonAccount("8979798","Neeru", 1234,"asiuhis");
		
		//and then add it to list of accounts in my bank
		accountList.add(neeruAccount);
		
		PersonAccount manvirAccount = new PersonAccount("987987", "Manvir", 2211, "jhgu");
		
		accountList.add(1,manvirAccount);
		
		//Retrieve values from Arraylist
		
		
		
		PersonAccount ketakiAccount = new PersonAccount("987987", "Manvir", 2211, "jhgu");
		
		accountList.add(3,ketakiAccount);
		
		//System.out.println(accountList.get(0).getCardNumber() + "    pin : "+accountList.get(0).getPin());
		int currentUserindex = accountList.indexOf(simarAccount);
	
				
		PersonAccount currentUserObject = accountList.get(currentUserindex);
		
		
		
		String simarCard =	currentUserObject.getCardNumber();
				
		int simarPin = currentUserObject.getPin();
		
		System.out.println("Simarcard : "+simarCard + "  Pin : "+simarPin);
		
		String simarCardNo = accountList.get(accountList.indexOf(simarAccount)).getCardNumber();
		
		System.out.println("simarCardNo"+simarCardNo);
		
		
		String simarPassword = accountList.get(accountList.indexOf(simarAccount)).getPassword();
		
		//Create a list of employees where employee have a name and employee id 
	}

}
