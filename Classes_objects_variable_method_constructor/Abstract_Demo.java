//Java Program to Illustrate Use of All Features of Abstract Class

abstract class Operations
{
    float a = 12, b = 6, c;
    abstract void add();
    void subtract()
    {
        c = a - b;
        System.out.println("Result:"+c);
    }
    abstract void multiply();
    void divide()
    {
        c = a / b;
        System.out.println("Result:"+c);
    }
}
public class Abstract_Demo extends Operations
{
    @Override
    void add()
    {
        c = a + b;
        System.out.println("Result:"+c);
    }
    @Override
    void multiply()
    {
        c = a * b;
        System.out.println("Result:"+c);
    }
    public static void main(String[] args)
    {
        Abstract_Demo obj = new Abstract_Demo();
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }
}


/* 
Result:18.0
Result:6.0
Result:72.0
Result:2.0
 */