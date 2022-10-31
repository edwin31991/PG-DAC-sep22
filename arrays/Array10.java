/*
Given an array of integers, print whether the numbers are in ascending order or in descending order or in random order without sorting
Input: [5,14,35,90,139] Output: Ascending
Input: [88,67,35,14,-12] Output: Descending
Input: [65,14,129,34,7] Output: Random
*/
import java.util.*;
class Array10
{
	public static void order(double arr[])
	{
	   if(isDescending(arr))
	   
	   		System.out.println("Descending");

	   
	   else if(isAscending(arr))
	   		System.out.println("Ascending");

		else
	
			System.out.println("Random");

	}


	public static boolean isDescending(double arr[])
	{

	boolean flag=true;
	

	for(int i=arr.length;i>1;i--)
	{
		if(arr[i-1]>arr[i-2])
			flag= false;
	}	
		

		return flag;

	}


	public static boolean isAscending(double arr[])
	{
	
	boolean flag=true;
	

	for(int i=arr.length;i>=2;i--)
	{
		if(arr[i-1]<arr[i-2])
			flag=false;
	
	}	
		
	return flag;
	}





	public static void main(String ... args)
	{
		Scanner sc=new Scanner(System.in);

		double arr[]=new double[5];
		for(int i=0;i<5;i++)
		{
			double num=sc.nextDouble();
			arr[i]=num;
		}
		order(arr);

	}

}
