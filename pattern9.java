import java.util.Scanner;

public class pattern9
{
    public static void main(String[] args)
    {
        
        Scanner inp = new Scanner(System.in);

        
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = inp.nextInt();
        
      
        
        for (int i = 1; i <= rows; i++)
        {
            int j = (i * 2) - 1;

            for (int k = i; k <= rows; k++) 
            { 
                System.out.print(j + " "); 
                j += 2; 
            } 
            for (int l = (i * 2) - 3; l >= 1; l-=2)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }
      
    }
}
 
