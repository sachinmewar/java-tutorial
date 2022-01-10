
 public class UsingStatic {
    static int val1 = 13;
    static int val2;

    static  void printing(int x){
        System.out.println("x = " + x);
        System.out.println("val1 = " + val1);
        System.out.println("val2 = " + val2);
    }
    static {
        System.out.println("Static Block initialised");
        val2 = val1 + 12;
    }

     public static void main(String[] args) {
        printing(10);
         System.out.println("UsingStatic class is loaded, all of the static statements will run.\n" +
                 "First val1 is set to 13, then the static block executes which initializes val2.\n " +
                 "Then main( ) is called, which calls meth( )");
     }
}