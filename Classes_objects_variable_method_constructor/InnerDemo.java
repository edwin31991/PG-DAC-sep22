//Java Program to Illustrates Use of Instance Inner Class

class Outer 
{
    int outer_x = 100;
    void test() 
    {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner 
    {
        int y = 10; 
        void display() 
        {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
    void showy() 
    {
        System.out.println(y); // error, y not known here!
    }
}
class InnerDemo 
{
    public static void main(String args[]) 
    {
        Outer outer = new Outer();
        outer.test();
    }
}

/* display: outer_x = 100 */