package collectionExamples;

public class Employee {

	private String name;
	public Employee(String name, String jobDesc) {
		super();
		this.name = name;
		this.jobDesc = jobDesc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	private String jobDesc;
}
