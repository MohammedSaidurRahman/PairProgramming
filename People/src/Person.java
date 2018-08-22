
public class Person {

	public String name;
	private int age;
	private String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		
		this.name = name;
		this.age = age;
		this.setJobTitle(jobTitle);
	}
	
	public String showName() {
		
		return name;
	}
	
	public int showAge() {
		
		return age;
	}
	
	public String showJob() {
		
		return getJobTitle();
	}
	
	public String toString() {
		
		return "The name is: "+ name + ", The Age is: "+ age +", The Job Title is: "+getJobTitle();
		
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	

	
	
	
}
