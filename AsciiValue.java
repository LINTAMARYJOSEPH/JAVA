import java.util.Scanner;
public class AsciiValue {

	public static void main(String[] args)
	{
		System.out.println("enter the char to check ASCII Value");
		Scanner inp=new Scanner(System.in);
		char ch=inp.next().charAt(0);
		int Ascii=ch;
		System.out.println("ASCII value of "+ch+" is "+ Ascii);
	}
}
