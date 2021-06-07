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
		String reversed = "";
		
		for(int i = input.length()-1; i >=0; i--) {
			reversed += input.charAt(i);
		}
		
		return reversed;
	}

}
