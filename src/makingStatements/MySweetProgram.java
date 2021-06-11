package makingStatements;

import java.util.ArrayList;
import java.util.List;


public class MySweetProgram {

	public static void main(String[] args) {
		
		User me = new User();
		me.setFirstname("Jacob");
		me.setLastname("Lovins");
		
		User you = new User();
		you.setFirstname("Not");
		you.setLastname("Me");
		
		List<User> users = new ArrayList<User>();
		users.add(me);
		users.add(you);
		
		int y = 4;
		User.changeCrap(you);
		System.out.println(you);
	}
	

}