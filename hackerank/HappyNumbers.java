import java.util.Scanner;
public class HappyNumbers  
{     
    public static int isHappyNumber(int num){  
        int rem = 0, sum = 0;  
          
        while(num > 0){  
            rem = num%10;  
            sum = sum + (rem*rem);  
            num = num/10;  
        }  
        return sum;  
    }  
      
    public static void main(String[] args) {  
                    Scanner s = new Scanner(System.in);
                  int n=s.nextInt();
          
        System.out.println("List of happy numbers between 1 and " +n +":");  
         
        for(int i = 1; i <= n; i++){  
            int result = i;  
              
            while(result != 1 && result != 4){  
                result = isHappyNumber(result);  
            }  
              
            if(result == 1)  
                System.out.print(i + " ");  
        }  
    }  
}  
