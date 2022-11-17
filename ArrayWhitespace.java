import java.util.*;
public class ArrayWhitespace {

    public static void main(String[] args) {
    	String a;
    	System.out.println("enter the string :");
    	Scanner inp =new Scanner(System.in);
    	a = inp.nextLine();   
        System.out.println("Original sentence: " + a);
         a = a.replaceAll("\\s", "");
        System.out.println("After replacement: " + a);
    }
}
