//Java Program to Check Whether Which One is Executed First, Static Block or the Static Method

	public class demo2
{   
    static 
    {
        System.out.println("First static block");
    }
 
    public demo2()
    {
        System.out.println("Constructor");
    }
 
    public static String staticString = "Static Variable";
 
    static 
    {
        System.out.println("Second static block and "+ staticString);
    }
    static 
    {
        staticMethod();
        System.out.println("Third static block");
    }
 
    public static void staticMethod() 
	{
        System.out.println("Static method");
    }
 
    public static void staticMethod2() 
	{
        System.out.println("Static method2");
    }
    public static void main(String[] args)
    {
        demo2 obj = new demo2();
        obj.staticMethod2();
    }    
}

//First static block
Second static block and Static Variable
Static method
Third static block
Constructor
Static method2