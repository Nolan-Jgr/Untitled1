import java.util.*;
public class MyRectangle
{
   public static boolean isValid(int w,int h)
   {
      if(h + w > 30)
         return true;
      else
         return false;
   }
   public static int Area(int w, int h)
   {
      return w * h;
   }
   public static int Perimeter(int w, int h)
   {
      return (2*w) + (2*h);
   }
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a width and a height");
      int width = scan.nextInt();
      int height = scan.nextInt();
      System.out.println("Entered width: " + width + "\nEntered height: " + height);
      if(isValid(width, height))
      {
         System.out.println("Area: " + Area(width, height));
         System.out.println("Perimeter: " + Perimeter(width, height));
      }
      else
      {
         System.out.println("This is invalid rectangle. Try again");
      }
   }
}