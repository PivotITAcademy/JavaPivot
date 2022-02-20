package staticExamples;

public class Vaccination {

	//Class level variable
	public static final int recommendedDoses = 4;
	
	//instance level variable
	private int dosesTaken;

	public int getDosesTaken() {
		return dosesTaken;
	}

	public void setDosesTaken(int dosesTaken) {
		this.dosesTaken = dosesTaken;
	}
}
