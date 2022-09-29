public class PP6
{
  public static void main(String[] args)
  {
    int numberOfRows=7;
    //This loop runs based on the number of rows
    //In this case, the loop runs 7 times to print 7 rows
    for (int i= 0; i<= numberOfRows-1; i++)
    {

      //This loop prints starting spaces for each row of pattern
      for (int j=0; j<=i; j++)
      {
        System.out.print(" ");
      }
      //This loop prints stars and the space between stars for each row
      for (int k=0; k<=numberOfRows-1-i; k++)
      {
        System.out.print("*" + " ");
      }
      //To move the cursor to new line after each row
      System.out.println();
    }
  }
}  