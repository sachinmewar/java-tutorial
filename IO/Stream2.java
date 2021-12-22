
 import java.io.*;

 public class Stream2{
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String str;
         System.out.println("Enter lines");
         System.out.println("Enter \"stop\" to stop");
         do{
             str = br.readLine();
             System.out.println("Entered line is: ", str);
         }while(!str.equals("stop"));
     }
 }