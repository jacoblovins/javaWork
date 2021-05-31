package makingStatements;

public class Convert {

	public static void main(String[] args) {
		float daysFloat = 365.25f;
		String weeksString = "52";
		
		int daysint = (int) daysFloat;
		int weeksint = Integer.parseInt(weeksString);
		
		int week = (daysint / weeksint);
		System.out.println("Days per week: " + week);

	}

}
