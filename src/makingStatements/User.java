package makingStatements;

import java.util.List;

public class User {

	private String firstname;
	private String lastname;
	
	public String output() {
		return "Hi, my name is " + getFirstname() + " " + getLastname();				
	}
	
	public String output(boolean nice) {
		if(nice) {
			return "You are a  beautiful person " + getFullName();
		}
		return "You are a freak " + getFullName();
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
	
	
	public static void printUsers(List<User> users) {
		for(User u : users) {
			System.out.println(u.getFullName());
		}
	}
}
