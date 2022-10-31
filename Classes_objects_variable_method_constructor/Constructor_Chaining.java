//18. Java Program to Illustrates Use of Chaining Constructor

public class Constructor_Chaining
{
        public Constructor_Chaining
        {
            System.out.println("In default constructor");
        }
        public Constructor_Chaining(int i)
        {
            this();
            System.out.println("In single parameter constructor");
        }
        public Constructor_Chaining(int i,int j)
        {
            this(j);
            System.out.println("In double parameter constructor");
        }
        public static void main(String a[])
		{
           Constructor_Chaining obj = new Constructor_Chaining(11,12);
        }
}

//In default constructor
In single parameter constructor
In double parameter constructor