
 import java.io.*;

 public class File1{
     public static void main(String[] args) {
         FileInputStream fin = null;
         int i = -1;
         // Checking weather fileName is specified...
         if(args.length != 1){
             System.out.println("Please specify file name is console like java File1.java File1.txt");
             return;
         }

         // Attempt to open a file...
         try{
             fin = new FileInputStream(args[0]);
             // reading from file...
             do{
                 i =  fin.read();
                 if(i != -1){
                     System.out.println((char)i);
                 }
             }while(i != -1);
         } catch(FileNotFoundException e){
         System.out.println("Cannot open file because of given exception : " + e);
         return;
     }catch(IOException e){
             System.out.println(e);
         }finally{
             try{
                 fin.close();
                 System.out.println("File closed successfully");
             }catch(IOException e){
             System.out.println("Unable to close file....");
             }
         }
     }
 }