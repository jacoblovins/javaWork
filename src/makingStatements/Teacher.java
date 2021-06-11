package makingStatements;

public class Teacher extends User {

	@Override
	public void sayHello() {
		System.out.println("I'm a teacher. My name is " + firstname + " " + lastname);
		
	}
	

}
