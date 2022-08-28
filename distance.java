import java.util.*;
// this program uses user-inputed values to represented point and calcuates the distance
// between the two points using the distace formula
public class distance
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number for x1");
      double x1 = scan.nextDouble();
      System.out.println("Enter a number for y1");
      double y1 = scan.nextDouble();
      System.out.println("Enter a number for x2");
      double x2 = scan.nextDouble();
      System.out.println("Enter a number for y2");
      double y2 = scan.nextDouble();
      double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
      System.out.println("Entered x1:" + x1 + "\nEntered y1:" + y1);
      System.out.println("Entered x2:" + x2 + "\nEntered y2:" + y2);
      System.out.println("Distance: " + distance);
   }
}
