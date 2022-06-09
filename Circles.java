import java.util.*;
public class Circles
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      // asks for the values of the first circle
      System.out.println("Enter the center values(X1 & Y1) and the radius for circle 1");
      int X1 = scan.nextInt();
      int Y1 = scan.nextInt();
      int R1 = scan.nextInt();
      // asks for the values of the second circle 
      System.out.println("Enter the center values(X2 & Y2) and the radius for circle 2");
      int X2 = scan.nextInt();
      int Y2 = scan.nextInt();
      int R2 = scan.nextInt();
      String judgement = "";
      double distance = Math.sqrt(Math.pow(X2-X1,2) + Math.pow(Y2-Y1,2));
      // determines if the two circles are either inside on another or overlapping 
      // assigns judgment statement to variable
      if(distance >= (R1 + R2))
      {
         judgement += "circle 2 is completely outside circle 1";
      }
      else if(R1 > (distance + R2))
      {
         judgement += "circle 2 is completely inside circle 1";
      }
      else if(distance < (R1 + R2))
      {
         judgement += "circle 2 is overlapping with circle 1";
      }
      System.out.println("Circle 1 center is: (" + X1 + ", " + Y1 + ")");
      System.out.println("Circle 1 radius is: " + R1);
      System.out.println("Circle 2 center is: (" + X2 + ", " + Y2 + ")");
      System.out.println("Circle 2 radius is: " + R2);
      System.out.println(judgement);
      
   }
}
