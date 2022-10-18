import java.util.Scanner;
public class GCDexample {
public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter first number to find GCD 54");
            int n1 = s.nextInt();
            System.out.println("Please enter second number to find GCD 24");
            int n2= s.nextInt();
            
            System.out.println("GCD of two numbers " + n1 +" and " + n2+ " is :" + findGCD(n1,n2));


}

private static int findGCD(int n1,int n2){
        if(n2==0){
            return n1;


            }
            return findGCD(n2,n1%n2);
            }
            }