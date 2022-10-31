//23. Java Program to Demonstrate Usage of an Instance Variable in the Test Class


public class Test
{
    int x = 17;
    public static void main(String...a)
    {
        //System.out.println(x);  Error : non-static variable x cannot be referenced from a static context
        // non static variable can be called only after making objects
        Test ob = new Test();
        System.out.println(ob.x);
    }
}

//17