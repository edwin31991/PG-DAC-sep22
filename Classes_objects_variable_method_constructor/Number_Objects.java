//Java Program to Count Number of Objects Created for Class
//8
public class Number_Objects 
{
    static int count=0;
    Number_Objects()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        Number_Objects obj1 = new Number_Objects();
        Number_Objects obj2 = new Number_Objects();
        Number_Objects obj3 = new Number_Objects();
        Number_Objects obj4 = new Number_Objects();
        System.out.println("Number of objects created:"+count);
    }
}

//Number of objects created:4