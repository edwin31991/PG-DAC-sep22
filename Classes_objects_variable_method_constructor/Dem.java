//Java Program to Create an Object for Class and Assign Value in the Object using Constructor


public class Dem
{
    int a,b,c;
    Dem()
    {
         a = 5;
         b = 6;
    }
    void change()
    {
        a = 15;
        b = 10;
        c = a + b;
    }
    public static void main(String[] args) 
    {
        Dem obj1 = new Dem();
        System.out.println("a:"+obj1.a);
        System.out.println("b:"+obj1.b);
        obj1.change();
        System.out.println("New a:"+obj1.a);
        System.out.println("New b:"+obj1.b);
        System.out.println("c:"+obj1.c);
    }
}

//a:5
b:6
New a:15
New b:10
c:25