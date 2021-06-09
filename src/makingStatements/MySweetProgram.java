package makingStatements;

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	public static void main(String[] args) {
		
		User me = new User();
		me.setFirstname("Jacob");
		me.setLastname("Lovins");
		
		User you = new User();
		you.setFirstname("Charles");
		you.setLastname("Spurgeon");
		
		List<User> users = new ArrayList<User>();
		users.add(me);
		users.add(you);
		
		System.out.println(User.searchList(users, "Charles", "Spurgeon"));
	}
	

}