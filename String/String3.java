
 public class String3{
     public static void main(String[] args) {
         String str1 = new String("Sachin Mewar");
         String str2 = new String("Sachin Mewar");
         String str3 = new String("SACHIN MEWAR");

         // equals() and equalsIgnoreCase()
         System.out.println("Is " + str1 + " equals " + str2 + "-> "+ str1.equals(str2));
         System.out.println("Is " + str1 + " equals " + str3 + "-> "+ str1.equals(str3));
         System.out.println("Is " + str1 + " equalsIgnoreCase " + str3 + "-> " + str1.equalsIgnoreCase(str3));

         // startsWith() and endsWith()
         System.out.println("Sachin Mewar starts with Sachin -> " + str1.startsWith("Sachin"));
         System.out.println("Sachin Mewar starts with sachin -> " + str2.startsWith("sachin"));
         System.out.println("Sachin Mewar ends with mewar -> " + str1.endsWith("mewar"));
         System.out.println("Sachin Mewar ends with Mewar -> " + str2.endsWith("Mewar"));

         // equals() vs ==
         System.out.println("Is " + str1 + " == " + str2 + " -> " + (str1 == str2));
         System.out.println("Is " + str1 + " equals " + str2 + " -> " + str1.equals(str2));

         // compareTo() and compareToignoreCase()
         String str4 = new String("laptop");
         String str5 = new String("desktop");
         if(str4.compareTo(str5) > 0){
             System.out.println(str4 + " is " + "greater than " + str5 + " in dictionary order");
         }
         if("DESKTOP".compareToIgnoreCase("desktop") == 0){
             System.out.println("DESKTOP compareToIgnroeCase desktop are equal");
         }

         // regionMatches()
         System.out.println("Mewar regionMatches() Mewar -> " + str1.regionMatches(7, str2, 7, 5));
     }
 }