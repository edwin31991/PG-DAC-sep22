//10. Java Program to Swap Objects using Swap() Method

public class Swap_Demo
{
    static String emp1, emp2;
    Swap_Demo()
    {
        emp1 = "this is A";
        emp2 = "this is B";
    }
    void swap(String x,String y)
    {
        String res;
        res = x;
        x = y;
        y = res;
        System.out.println("Employee1: "+x);
        System.out.println("Employee2: "+y);
    }
    public static void main(String[] args)
    {
        Swap_Demo obj = new Swap_Demo();
        System.out.println("Before swapping:");
        System.out.println("Employee1:"+emp1);
        System.out.println("Employee2:"+emp2);
        System.out.println("After swapping:");
        obj.swap(emp1,emp2);
    }
}

//Before swapping:
Employee1:this is A
Employee2:this is B
After swapping:
Employee1: this is B
Employee2: this is A