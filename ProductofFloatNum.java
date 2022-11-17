import java.util.Scanner;
public class ProductofFloatNum {
public static void main(String[] args)
{
	System.out.println("Enter the first number");
	Scanner inp=new Scanner(System.in);
	float n1=inp.nextFloat();
	System.out.println("Enter the second number");
	float n2=inp.nextFloat();
	float prod=n1*n2;
	System.out.println("Product is "+prod);



}
}
