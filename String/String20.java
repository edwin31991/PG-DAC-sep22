//Write a program to remove a given character from String?

public class String20 {  
    public static void main(String[] args) {  
              String str = "India is my country";  
              System.out.println(charRemoveAt(str, 7));  
           }  
           public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           }  
}  