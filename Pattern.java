import java.util.*;
// this program uses loops to print a patter
public class Pattern
{
   public static void main(String[]args)
   {
      // number of rows
      for(int x = 6; x > 0; x--)
      {
         // adds needed white space
         for(int y = 0; y < 6-x;y++)
         {
            System.out.print("  ");
         }
         // prints the data that creates the pattern
         for(int z = 1; z <= x; z++)
         {
            System.out.print(z + " ");
         }
         System.out.println();
      }
   }
}
