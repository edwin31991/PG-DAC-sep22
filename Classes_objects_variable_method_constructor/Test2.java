//24. Java Program to Demonstrate Usage of a Static Variable in the Test Class

// Java program to demonstrate execution
// of static blocks and variables

class Test2 {

	// static variable
	static int a = m1();

	// static block
	static
	{
		System.out.println("Inside static block");
	}

	// static method
	static int m1()
	{
		System.out.println("from m1");
		return 20;
	}

	// static method(main !!)
	public static void main(String[] args)
	{
		System.out.println("Value of a : " + a);
		System.out.println("from main");
	}
}


//from m1
Inside static block
Value of a : 20
from main