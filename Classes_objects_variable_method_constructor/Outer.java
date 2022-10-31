//Java Program to Illustrates Use of Static Inner Class

public class Outer 			//outer class
{
    int x = 10;
    static int y = 20;
    static class Inner 			//static inner class
    {
        void show()		        // non static method in static inner class
        {
            System.out.println(y);
            //  System.out.println(x);  error :  non-static variable x cannot be referenced from a static context
        }
    }
    public static  void main(String... s)
    {
        System.out.println("'In main method'. The vlaue of static data member of outer class is :"+y);
        //  System.out.println(x);                     error:  non-static variable x cannot be referenced from a static context
        System.out.println("Inner class method accessed by Inner class object ");
        Inner i = new Inner();
        i.show();
        System.out.println("Inner class method accessed by outer class object ");
        Outer.Inner o = new Outer.Inner();
        o.show();
    }
}

/*'In main method'. The vlaue of static data member of outer class is :20
Inner class method accessed by Inner class object 
20
Inner class method accessed by outer class object 
20  */