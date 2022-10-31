//How to sort String on their length in Java?
//Write a Program to sort String on their length in Java? Your method should accept an array of String and return a sorted array based upon the length of String. Don't forget to write unit tests for your solution.
// Java program to sort an Array of
// Strings according to their lengths
import java.util.*;

class String23
{
static void sort(String []s, int n)
{
	for (int i=1 ;i<n; i++)
	{
		String temp = s[i];

		// Insert s[j] at its correct position
		int j = i - 1;
		while (j >= 0 && temp.length() < s[j].length())
		{
			s[j+1] = s[j];
			j--;
		}
		s[j+1] = temp;
	}
}

// Function to print the sorted array of string
static void printArraystring(String str[], int n)
{
	for (int i=0; i<n; i++)
		System.out.print(str[i]+" ");
}

// Driver function
public static void main(String args[])
{
	String []arr = {"GeeksforGeeks", "I", "from", "am"};
	int n = arr.length;
	
	// Function to perform sorting
	sort(arr,n);
	// Calling the function to print result
	printArraystring(arr, n);
	
}
}
