package makingStatements;

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	public static void main(String[] args) {
		User me = new User();
		me.setFirstname("Jacob");
		me.setLastname("Lovins");
		
		
		User you = new User();
		you.setFirstname("Sub");
		you.setLastname("Scriber");
		
		List<User> users = new ArrayList<User>();
		users.add(you);
		users.add(me);
		
		System.out.println(users.get(1).getFullName());
		
		
	}

}