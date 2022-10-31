//You need to write a Java method that will accept a String and a character to be removed and return a String, which doesn't has that character e.g remove(String word, char ch).

public class String21 {

	public static void main(String[] args) {
		String str = "abcdDCBA123";

		System.out.println("String after Removing 'a' = "+str.replace("a", ""));
		
		System.out.println("String after Removing First 'a' = "+str.replaceFirst("ab", ""));

		System.out.println("String after replacing all small letters = "+str.replaceAll("([a-z])", ""));
	}

}