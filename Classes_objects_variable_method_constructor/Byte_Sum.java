//Java Program to Calculate Sum of Two Byte Values using Type Casting

import java.util.Scanner;
public class Byte_Sum
{
    public static void main(String[] args) 
    {
        byte a, b;
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first byte value:");
        a = s.nextByte();
        x = a;
        System.out.print("Enter second byte value:");
        b = s.nextByte(); 
        y = b;
        z = x + y;
        System.out.println("Result:"+z);
     }
}

//Enter first byte value:124
Enter second byte value:115
Result:239