package composition;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//University is established
		University university = new University();
		
		university.setName("Pivot University");
		
		//Enroll/Affiliate my college to it - Add my college to college ref variable
		
		College pivotCollege = new College();
		
		pivotCollege.setName("Pivot College");
		
		university.addCollegesToUniversity(pivotCollege);
		
		College thomasCollege = new College();
		thomasCollege.setName("Thomas's College");
		
		thomasCollege.setCourses("Business Management");
		
		university.addCollegesToUniversity(thomasCollege);
		
		
//		
//		System.out.println("Courses offered by college in Pivot University  : "+university.getCollege().getCourses());
		
	}

}
