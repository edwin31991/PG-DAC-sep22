/*8. Write a program which takes an array of integers and prints the running average of 3 consecutive integers.
In case the array has fewer than 3 integers, there should be no output.
Input: [5,14,35,89,140]
Output: [18, 46, 88]
(Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...)*/


import java.util.*;
class Array8
{
	public static void printAverage(int ... arr)
	{
		while(arr.length>3)
		{
		for(int i=0;i<arr.length-2;i++)
		{
			int avg= (arr[i]+arr[i+1]+arr[i+2])/3;
			System.out.print(avg+",");
		}
		}
		
	}

	public static void main(String ... args)
	{
		int arr[]={5,14,35,89,140};
		printAverage(arr);
	}
}