
 import java.io.*;

 public class File2 {
     public static void main(String[] args) {
         FileInputStream fin = null;
         FileOutputStream fout = null;
         int i = -1;
         if(args.length != 2){
             System.out.println("Please specify name of two files: File to be copied and File in which you want to copy");
             return;
         }
         try{
             fin = new FileInputStream(args[0]);
             fout = new FileOutputStream(args[1]);
             // Copying from one file to another....
             do{
                 i = fin.read();
                 if(i != -1){
                     fout.write(i);
                 }
             }while(i != -1);
         }catch(FileNotFoundException e){
             System.out.println("Unable to find file..." + e);
         }catch(IOException e){
             System.out.println("IO Exception Occured..." + e);
         }finally {
             if(fin != null){
                 try{
                     fin.close();
                 }catch(IOException e){
                     System.out.println(e);
                 }
             }
             if(fout != null){
                 try{
                     fout.close();
                 }catch(IOException e){
                     System.out.println(e);
                 }
             }
         }
     }
}