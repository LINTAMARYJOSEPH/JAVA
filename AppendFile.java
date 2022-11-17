
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendFile {
   public static void main( String[] args ) { 
      try { 
         String data = " Welcome To the world of Mystery..";
         File f1 = new File("C:\\Users\\JOSEPH\\Desktop\\text1.txt");
         if(!f1.exists()) {
            f1.createNewFile();
         } 
         FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data);
         bw.close();
         System.out.println("Done");
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}