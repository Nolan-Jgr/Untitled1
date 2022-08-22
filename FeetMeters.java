import java.util.*;
// this program converts both 1.0ft - 20.0ft to meters
// as well as 1.0m - 20.0m to feet and displays each conversionto the user
public class FeetMeters
{
   // takes in a double number of feet and returns the number converted to meters
   public static double feetToMeter(double x)
   {
      return (0.305 * x);
   }
   // takes in a double number of meters and returns the number converted to feet
   public static double meterToFeet(double x)
   {
      return ((long)(3.279 * x * 1000)/1000.0);
   }
   public static void main(String[]args)
   {
      System.out.println("Feet\t\tMeter\t\t\t\tMeter\t\tFeet");
      // prints the conversion table of both feet to meter and meter to feet
      for(double i = 1.0; i <= 20.0; i++)
      {
         System.out.print(i + "\t\t" + feetToMeter(i) + "\t\t\t\t" + i + "\t\t" + meterToFeet(i));
         System.out.println();
      }
   }
}
