
public class String2 {
    public static void main(String[] args) {
        String str = new String("abcdefgh");
        // Using charAt() method.
        System.out.println("Char at 4th place is -> " + str.charAt(3));

        // Using getChars()
        String fullName = new String("Hi! My name is Sachin Mewar");
        int start = 15;
        int end = 27;
        char charArray[] = new char[20];
        fullName.getChars(start, end, charArray, 0);
        System.out.println(charArray);


        // Using getBytes
        byte[] tempByte = str.getBytes();
        System.out.println("In byte form : " + tempByte);

        // Converting back to String.
        String tempStr = new String(tempByte);
        System.out.println("Byte to String value : " + tempStr);

        // To convert whole String to character array using toCharArray() method.
        String car = new String("Mustang");
        char[] carCharArray = car.toCharArray();
        System.out.println(carCharArray);
    }
}