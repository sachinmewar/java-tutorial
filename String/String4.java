
public class String4 {
    public static void main(String[] args) {
        String str = new String("The way to get started is to quit talking and begin doing");
        // Searching a string
        System.out.println(str);
        System.out.println("indexOf(to) -> " + str.indexOf("the"));
        System.out.println("lastIndexOf(to) -> " + str.lastIndexOf("the"));
        System.out.println("indexOf(t, 5) -> " + str.indexOf('t', 5));
        System.out.println("indexOf(t, 10) -> " + str.indexOf('t', 10));
        System.out.println("indexOf(t, 15) -> " + str.indexOf('t', 15));
        System.out.println("indexOf(t, 25) -> " + str.indexOf('t', 25));
        System.out.println("indexOf(t, 30) -> " + str.indexOf('t', 30));
        System.out.println("lastIndexOf(t, 30) -> " + str.lastIndexOf('t', 30));

        // Extracting  a substring from string....
        System.out.println(str.substring(26));
        System.out.println(str.substring(34, 42));

        // concatinating 2 strings
        String str1 = new String("Sachin");
        String str2 = new String("Mewar");
        System.out.println(str1.concat(str2));

        // replacing all occurance of one character with another.
        String tempStr = new String("Praztize makes man perfezt");
        System.out.println("Using replace rethod --> " + tempStr.replace('z', 'c'));
    }
}