/*

Given a string, s, return the length of the longest substring that contains every vowel occurring an even number of times.
Note: You may assume s only contains lowercase alphabetical characters and the vowels you must account for are a, e, i, o, and u.
Ex: Given the following string s…
s = "aeiouaeioua", return 10 (the last 'a' cannot count).
Ex: Given the following string s…
s = "bbb", return 3 (all vowels occur an even number of times, i.e. zero times each).

*/


import java.io.*;
import java.util.*;

class Array15 {
	// Function to find the length of the
// longest substring having even number
// of vowels
static void longestSubstring(String s)
{
	// Create two hashmaps
	HashMap<String, Integer> indexes = new HashMap<>();
	HashMap<Character, Integer> chars = new HashMap<>(){{
		put('a', 0);put('e', 1);
		put('i', 2);put('o', 3);
		put('u', 4);
	}} ;

	// Keep the track of frequencies
	// of the vowels
	String evenOdd = "00000";
	indexes.put(evenOdd , -1);

	// Stores the maximum length
	int length = 0;

	// Traverse the given string S
	for (int i = 0; i < s.length(); ++i) {

		char c = s.charAt(i);

		// Find character in the map
		boolean it = chars.containsKey(c);

		// If it is a vowel, then update
		// the frequency
		if (it != false) {
			if(evenOdd.charAt(chars.get(c)) == '0'){
				evenOdd = evenOdd.substring(0,chars.get(c)) + '1' + evenOdd.substring(chars.get(c)+1);
			}
			else{
				evenOdd = evenOdd.substring(0,chars.get(c)) + '0' + evenOdd.substring(chars.get(c)+1);
			}
		}

		// Find the index of occurrence
		// of the string evenOdd in map
		boolean lastIndex = indexes.containsKey(evenOdd);

		if (lastIndex == false) {
			indexes.put(evenOdd, i);
		}

		// Update the maximum length
		else {
			length = Math.max(length, i - indexes.get(evenOdd));
		}
	}

	// Print the maximum length
	System.out.println(length);
}
	
// Driver Code
public static void main(String args[])
{
	// Given Input
	String S = "bcbcbc";
	longestSubstring(S);
}
}

// code is contributed by shinjanpatra
