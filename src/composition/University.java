package composition;

public class University {

	private String name;
	
	

	//University has a college
	College[] colleges = new College[10];
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public College[] getCollege() {
		return colleges;
	}

	public void addCollegesToUniversity(College college) {
		for(int i=0;i<colleges.length;i++) {
			if(colleges[i] == null) {
				colleges[i] = college;
				break;
			}
		}
	}
	
	
	
}
