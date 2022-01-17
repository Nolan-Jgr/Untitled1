import java.util.*;
public class DrivingCost
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a distance");
      int d = scan.nextInt();
      System.out.println("Enter the miles per gallon");
      int mpg = scan.nextInt();
      System.out.println("Enter cost per gallon");
      double cost = scan.nextDouble();
      double tcost = (d / mpg) * cost;
      System.out.println("Distance traveled (miles): " + d);
      System.out.println("Miles per gallon (miles): " + mpg);
      System.out.println("Price per gallon (dollars): " + cost);
      System.out.println("Trip cost (dollars): " + tcost);
   }
}