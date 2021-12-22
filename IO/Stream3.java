
 import java.io.*;
 public class Stream3 {
     public static void main(String[] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String str[] = new String[100];
         System.out.println("Enter notes or paragraphs... ");
         System.out.println("Enter \"stop\" to quit.... ");
         for(int i = 0; i < 100; i++){
             str[i] = br.readLine();
             if(str[i].equals("stop")) break;
         }
         System.out.println("Your entered Notes or paragraph are... ");
         for(int i = 0; i < str.length-1; i++){
             if(str[i].equals("stop")){
                 break;
             }
             System.out.println(str[i]);
         }
     }
}