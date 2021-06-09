package makingStatements;

public class User {

	public String firstname;
	public String lastname;
	
	public void output(int times) {
		
		for(int i = 0; i < times; i++) {
			System.out.println(firstname + " " + lastname);			
		}
		
	}
	
}
