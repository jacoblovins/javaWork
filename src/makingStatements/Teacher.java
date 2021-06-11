package makingStatements;

public class Teacher extends User implements Talk {
	
	public Teacher(String fn, String ln) {
		super(fn, ln);
		
	}

	@Override
	public void sayHello() {
		System.out.println("I'm a teacher.");
		
	}
	

}
