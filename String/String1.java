
public class String1 {
    public static void main(String[] args) {
        // default Contructor
        // Created an empty String
        String str1 = new String();
        System.out.println("str1 -> " + str1);

        // Intializing string with my name
        String str2 = new String("Sachin");
        System.out.println("str2 -> " + str2);

        // Pass char array while creating a String
        char charArray[] = {'s', 'a', 'c', 'h', 'i', 'n'};
        String str3 = new String(charArray);
        System.out.println("str3 -> " + str3);

        // Creating a String from another String
        String str4 = new String(str3);
        System.out.println("str4 -> " + str4);

        //Construct string from subset of character array (Byte to String conversion).
        byte ascii[] = { 65, 97, 66, 98, 67, 99};
        String str5 = new String(ascii);
        System.out.println("str5 -> " + str5);
    }
}