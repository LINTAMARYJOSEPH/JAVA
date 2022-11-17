import java.util.Scanner;
public class AlphaOrNot {
	public static void main(String[] args)
	{
		char ch;
		int count =0;
		System.out.println("Enter the character to be checked");
		Scanner inp=new Scanner(System.in);
		ch=inp.next().charAt(0);
	    int ascii=ch;
	    if(ascii>=65&&ascii<=90||ascii>=97&&ascii<=122)
	    {
	    	System.out.println(" The character is an alphabet");
	    }
	    else
	    {
	    	System.out.println("The char is not an alphabet");
	    }
	}

}
