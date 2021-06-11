package makingStatements;

public class Student extends User {
	public boolean verified = true;
	public String major;
	
	public Student() {
	}
	
	public Student(String firstname, String lastname, String major) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.major = major;
		
	}
	
	@Override
	public void sayHello() {
		super.sayHello();
		System.out.println("Hi, my major is " + major + ". My name is " + firstname + " " + lastname);
	}
}