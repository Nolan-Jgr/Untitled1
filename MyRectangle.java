import java.util.*;
// this program asks the user for info that might pertain to a rectangle such as height and width
// then both the area and the perimeter are calculated
public class MyRectangle
{
   // if the sum of the rectangles height and width are less than 30 the rectangle
   // is valid; if not, the rectangle is invalid
   public static boolean isValid(int w,int h)
   {
      if(h + w > 30)
         return true;
      else
         return false;
   }
   // this funciton takes in a height and width and returns the area
   public static int Area(int w, int h)
   {
      return w * h;
   }
   // this function takes in a height and width and returns the perimeter
   public static int Perimeter(int w, int h)
   {
      return (2*w) + (2*h);
   }
   public static void main(String[]args)
   {
      // the user is asked to enter into associated with a rectangle
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a width and a height");
      int width = scan.nextInt();
      int height = scan.nextInt();
      System.out.println("Entered width: " + width + "\nEntered height: " + height);
      // if the rectangle is valid the area and perimater are print
      if(isValid(width, height))
      {
         System.out.println("Area: " + Area(width, height));
         System.out.println("Perimeter: " + Perimeter(width, height));
      }
      // if the rectangle is invalid an error message will be printed
      else
      {
         System.out.println("This is an invalid rectangle. Try again");
      }
   }
}
