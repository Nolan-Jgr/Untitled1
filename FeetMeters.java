import java.util.*;
public class FeetMeters
{
   public static double feetToMeter(double x)
   {
      return (0.305 * x);
   }
   public static double meterToFeet(double x)
   {
      return ((long)(3.279 * x * 1000)/1000.0);
   }
   public static void main(String[]args)
   {
      System.out.println("Feet\t\tMeter\t\t\t\tMeter\t\tFeet");
      for(double i = 1.0; i <= 20.0; i++)
      {
         System.out.print(i + "\t\t" + feetToMeter(i) + "\t\t\t\t" + i + "\t\t" + meterToFeet(i));
         System.out.println();
      }
   }
}