import java.util.scanner;

class vowels
{
public static void main(String[] arg)
{
		boolean isVowel=false;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character :");
		char ch=scanner.next().charAt(0);
		scanner.close();
		switch(ch)
		
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isVowel=true;
		
		
		
		
		}
		if(isVowel == true){
		System.out.println(ch+ " is a vowel ");
		}
		else {
		if((ch>='a' && ch>='a')||(ch>='A' && ch>='Z')
		System.out.println(ch+ " is a consonant ");
		else
		System.out.println(" input is not an alphabet  ");
		}
		}
		
		}