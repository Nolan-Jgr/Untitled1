import java.util.*;
// this program determines the trip cost using a defined distance, mpg, and gas price
public class DrivingCost
{
   public static void main(String[]args)
   {
      // creates scanner obj for user input
      Scanner scan = new Scanner(System.in);
      // user input for distance
      System.out.println("Enter a distance");
      int d = scan.nextInt();
      // user input for mpg
      System.out.println("Enter the miles per gallon");
      int mpg = scan.nextInt();
      // user input for gas price
      System.out.println("Enter cost per gallon");
      double cost = scan.nextDouble();
      // calculates the trip cost
      double tcost = (d / mpg) * cost;
      // print statements for pertinent information
      System.out.println("Distance traveled (miles): " + d);
      System.out.println("Miles per gallon (miles): " + mpg);
      System.out.println("Price per gallon (dollars): " + cost);
      System.out.println("Trip cost (dollars): " + tcost);
   }
}
