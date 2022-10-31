//Java Program to Illustrates Use of Referencing the Object from Inner Class
//5

public class Outer_Class
{
    static Outer_Class.InnerClass obj;
    void test1()
    {
        System.out.println("Success");
    }
    static public class InnerClass
    {
    	private String name = "Peakit";
        public void test2()
        {
            Outer_Class outer = new Outer_Class();
            outer.test1();
        }
    }
    public static void main(String[] args)
    {
        obj = new Outer_Class.InnerClass();
        obj.test2();
    }
}


//Success