package makingStatements;

public class MySweetProgram {

	public static void main(String[] args) {
		User user = new User();
		
		user.firstname = "Sub";
		user.lastname = "Scriber";
		
		System.out.println(user.firstname);
		user.output(6);
	}

}
