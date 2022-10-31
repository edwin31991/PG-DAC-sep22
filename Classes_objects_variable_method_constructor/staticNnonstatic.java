//22. Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method

// Java Program to demonstrate Accessibility of an static
// variable by static method

// Importing input output classes
import java.io.*;

// Main class
class staticNnonstatic {

	// Declaring and initializing variables
	// Making variables static
	static int i = 10;
	static int j = 20;

	// Declaring the static temporary array
	static int temp[] = { 2, 6, 3, 0, 1, 7 };

	// Method 1
	// Multiplication of array elements
	public static void multiply(int n)
	{
		for (int k = 0; k < n; k++) {
			// Multiplying each element of array with i=10
			temp[k] = temp[k] * i;
		}
	}

	// Method 2
	// To print an array
	public static void print_Array(int n)
	{
		// Display message
		System.out.print("\nArray = ");

		// Iteration using for loop to print complete array
		for (int m = 0; m < n; m++) {
			// Printing array element
			System.out.print(temp[m] + " ");
		}
	}

	// Method 3
	// Main driver method
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.print("Static variable : " + i);

		// Length of static array temp[]
		int n = temp.length;

		// Calling the static multiply method
		multiply(n);

		// Calling the static Print_Array method
		print_Array(n);
	}
}


//Static variable : 10
Array = 20 60 30 0 10 70