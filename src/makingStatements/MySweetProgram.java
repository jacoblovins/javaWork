package makingStatements;

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	public static void main(String[] args) {
		
		String[] firstnames = {"Caleb", "Sub", "Sally", "Jamie"};
		String[] lastnames = {"Curry", "Scriber", "Smith", "Cal"};
		List<User> users = new ArrayList<User>();
		
		for(int i = 0; i < firstnames.length; i++) {
			User u = new User();
			u.setFirstname(firstnames[i]);
			u.setLastname(lastnames[i]);
			users.add(u);
		}
		
		for(User u: users) {
			System.out.println(u.getFullName());
		}
		
		
		
	}

}