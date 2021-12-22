
 import java.io.*;

 public class Stream1 {
     public static void main(String[] args) throws IOException{
         char ch;
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter characters and press q to quit");
         do {
             ch = (char) br.read();
             System.out.println(ch);
         }while(ch != 'q');
     }
 }