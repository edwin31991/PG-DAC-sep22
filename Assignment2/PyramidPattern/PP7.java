import java.util.Scanner; 
public class PP7{
public static void main(String args[]){
Scanner sc=new Scanner(System.in); //Scanner class in java
System.out.print("Enter the rows you want");
int rows=sc.nextInt();
System.out.println("");
for (int i=rows; i>=1; i--){
  for (int j=0; j<=rows-i; j++){
  System.out.print(" ");
  }//print space
 int count=0;
while(count != (2*i-1)){
  System.out.print(i+"");  
count++;  
}                                               
System.out.println();
}
                                                   
}
}