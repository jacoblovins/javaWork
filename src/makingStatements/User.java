package makingStatements;

public class User {

	private String firstname;
	private String lastname;
	
	public String output() {
		
		
		return "Hi, my name is " + firstname + " " + lastname;			
		
		
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String name) {
		firstname = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getFullName() {
		return getFirstname() + " " + getLastname();
	}
	
	
	public static void printUser(User u) {
		System.out.println(u.getFullName());
	}
}
