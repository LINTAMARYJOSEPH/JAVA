import java.util.Scanner;

public class CharatoString {

    public static void main(String[] args) {
    	System.out.println("Enter the character: ");
    	Scanner inp =new Scanner(System.in);
    	char ch = inp.next().charAt(0);     
        String st = Character.toString(ch);
        System.out.println("The string is: " + st);
        System.out.println("Enter the string: ");
        Scanner inp1 =new Scanner(System.in);
    	String st1 = inp1.nextLine();   
        char chars = st1.charAt(0);
        System.out.println(chars);
    }
}
