import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class DecimalRound {
   public static void main(String[] args) {
      float input=0;
  
      Scanner inp = new Scanner(System.in);
      System.out.print("Enter the number : ");
      input = inp.nextFloat();
      
      DecimalFormat df = new DecimalFormat("#.###");
      df.setRoundingMode(RoundingMode.CEILING);

      System.out.println(df.format(input));
          }
      
   }


