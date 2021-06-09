package makingStatements;

public class MySweetProgram {

	public static void main(String[] args) {
		User user = new User();
		
		user.setFirstname("Sub");
		user.setLastname("Scriber");
		
		System.out.println(user.getFullName());
	}

}
