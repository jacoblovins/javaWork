package makingStatements;

public abstract class User {

	public String firstname;
	public String lastname;
	public boolean verified = false;
	
	public void sayHello() {
		System.out.println("Hi, I'm a user. My name is " + firstname + " " + lastname);
	}
	
}
