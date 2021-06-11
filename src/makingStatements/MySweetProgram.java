package makingStatements;

import java.util.ArrayList;
import java.util.List;


public class MySweetProgram {

	public static void main(String[] args) {
		
		Student s = new Student("Jacob", "Lovins", "Mustache Design");
		
		
		Teacher t = new Teacher(); 
		t.firstname = "Teach";
		t.lastname = "er";
		
		List<User> users = new ArrayList<User>();
		users.add(s);
		users.add(t);
		
		for(User u : users) {
			u.sayHello();
		}
		
		
	}
	

}