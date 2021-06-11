package makingStatements;

public class Student extends User implements Talk {
	public boolean verified = true;
	public String major;
	
	
	public Student(String fn, String ln) {
		super(fn, ln);
		
	}
	
//	@Override
//	public void sayHello() {
//		super.sayHello();
//		System.out.println("Hi, my major is " + major + ". My name is " + fn + " " + ln);
//	}
}