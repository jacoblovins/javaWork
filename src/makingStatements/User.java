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
	
	public static User findUser(List<User> users, User u) {
		for(User user : users) {
			if(user.equals(u)) {
				return user;
			}
		}
		return null;
	}
	
	public static int searchList(List<User> users, User u) {
		return searchList(users, u.getFullName());
	}
	
	public static int searchList(List<User> users, String fn, String ln) {
		return searchList(users, fn + " " + ln);
		
	}
	
	public static int searchList(List<User> users,  String fullName) {
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).getFullName().equals(fullName)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void changeCrap(User x) {
		x.setFirstname("Changed");
	}
	 
}
