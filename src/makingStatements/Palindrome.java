package makingStatements;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println(isPalindromeString("anna"));
		System.out.println(isPalindromeString("Kayak"));
		System.out.println(isPalindromeString("James"));
		System.out.println(isPalindromeString("Table"));

	}
	
	
	public static boolean isPalindromeString(String text) {
		String reverse = reverse(text).toLowerCase();
		
		if(text.toLowerCase().equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static String reverse(String input) {
		
		if(input == null || input.isEmpty()) {
			
			return input;
			
		} else {
			
			return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
			
		}
	}

}
