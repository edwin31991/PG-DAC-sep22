//You need to write a program to print all duplicate character and their count in Java. For example, if given String is "Programming" then your program should printg : 2 r : 2  m : 2

import java.util.*;
class String7 {

	// Function to print all duplicate characters in string using HashMap
	public static void
	countDuplicateCharacters(String str)
	{

		// Creating a HashMap containing char as a key and occurrences as a value
		Map<Character, Integer> map
			= new HashMap<Character, Integer>();

		// Converting given string into
		// a char array
		char[] charArray = str.toCharArray();

		// Checking each character
		// of charArray
		for (char c : charArray) {

			if (map.containsKey(c)) {

				// If character is present
				// in map incrementing it's
				// count by 1
				map.put(c, map.get(c) + 1);
			}
			else {

				// If character is not present
				// in map putting this
				// character into map with
				// 1 as it's value.
				map.put(c, 1);
			}
		}

		// Traverse the HashMap, check
		// if the count of the character
		// is greater than 1 then print
		// the character and its frequency
		for (Map.Entry<Character, Integer> entry :
			map.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey()
								+ " : "
								+ entry.getValue());
			}
		}
	}

	public static void
	public static void
	main(String args[])
	{
		String str = "geeksforgeeks";

		countDuplicateCharacters(str);
	}
}
