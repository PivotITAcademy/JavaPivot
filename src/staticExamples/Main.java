package staticExamples;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vaccination neeruRecord = new Vaccination();
				neeruRecord.setDosesTaken(2);
		
		Vaccination ketakiRecord = new Vaccination();
		ketakiRecord.setDosesTaken(3);
		
		Vaccination manvirRecord = new Vaccination();
		manvirRecord.setDosesTaken(3);
		
		System.out.println("Recommended doses :"+Vaccination.recommendedDoses);
		
		System.out.println("Doses taken by ketaki : "+ketakiRecord.getDosesTaken());
		
		System.out.println("Recommended Doses to be taken by ketaki : "+Vaccination.recommendedDoses);
		
		System.out.println("Doses taken by Manvir : "+manvirRecord.getDosesTaken());
		
		System.out.println("RecommendedDoses to be taken by Manvir : "+Vaccination.recommendedDoses);
		
		System.out.println("Doses taken by Neeru : "+neeruRecord.getDosesTaken());
		
		System.out.println("Recommended Doses to be taken by Neeru : "+Vaccination.recommendedDoses);
		
	
		ketakiRecord.recommendedDoses = 5;
		
		System.out.println("RecommendedDoses to be taken by Manvir : "+Vaccination.recommendedDoses);
		System.out.println("RecommendedDoses to be taken by Manvir : "+manvirRecord.recommendedDoses);
		
		System.out.println("RecommendedDoses to be taken by Neeru : "+neeruRecord.recommendedDoses);
	}

}
