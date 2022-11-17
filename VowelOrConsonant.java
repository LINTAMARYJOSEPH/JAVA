import java.util.Scanner;
public class VowelOrConsonant {
	public static void main(String[] args)
	{
		char input;
		System.out.println("Enter the character to be checked");
		Scanner inp=new Scanner(System.in);
		input=inp.next().charAt(0);
		switch(input)
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
		case 'U':System.out.println("The char " + input+" is a vowel");
		         break;
		default : System.out.println("The char "+input+ " is a consonant");


			
		}
	}
	

}
