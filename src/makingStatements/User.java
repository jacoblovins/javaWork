package makingStatements;

public abstract class User implements Talk {

	private String firstname;
	private String lastname;
	public boolean verified = false;
	
	public User(String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}
	
	public void sayHello() {
		System.out.println(firstname + " " + lastname);
	}
	
}
