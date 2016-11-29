package palindrome;

public class Palindrome {
	
	public static boolean check(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
		}
		return true;
	}

}
