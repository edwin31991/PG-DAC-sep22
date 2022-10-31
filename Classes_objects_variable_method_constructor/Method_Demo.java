//13. Java Program to Create a Method without Parameters and Return Type

public class Test
{
    void areacircle()
    {   
        System.out.print("enter the radius :");
        Scanner s = new Scanner(System.in);
        float r = s.nextFloat();
        float ar;
        ar = (r * r) * 22 / 7;
        System.out.println("area of the circle is : "+ar+" sq units.");
    }
}
class Method_Demo
{
    public static void main(String args[]) 
    {
        Test obj = new Test();
        obj.areacircle();
    }
}

//enter the radius :3
area of the circle is:28.285715 sq units