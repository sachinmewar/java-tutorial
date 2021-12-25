
 import java.io.*;

 public class File3 {
     public static void main(String[] args) {
         int i = -1;
         if(args.length != 1){
             System.out.println("Enter filename For e.g.: java File3.java FileName");
             return;
         }
         try( FileInputStream fin= new FileInputStream(args[0])){
             do{
                 i = fin.read();
                 if(i != -1){
                     System.out.println((char)i);
                 }
             }while(i != -1);
         }catch(FileNotFoundException e){
             System.out.println("File Not Found...");
         }catch(IOException e){
             System.out.println("IO Exception occurs...");
         }finally{
             System.out.println("File Closed");
         }
     }
}