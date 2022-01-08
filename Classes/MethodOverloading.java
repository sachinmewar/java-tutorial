
 class Overload{
    void area(){
         System.out.println("Please pass parameter to find area");
     }
     void area(double radius){
         double result = 3.1415 * radius * radius;
         System.out.println("Area of Circle is: " + result);
     }
     void area(double length, double breadth){
         double result = length * breadth;
         System.out.println("Area of rectangle is: " + result);
     }
 }

 public class MethodOverloading {
     public static void main(String[] args) {
        Overload overload = new Overload();
        overload.area();
        overload.area(10);
        overload.area(8, 16);
     }
 }