import java.util.*;
public class Pattern
{
   public static void main(String[]args)
   {
      for(int x = 6; x > 0; x--)
      {
         for(int y = 0; y < 6-x;y++)
         {
            System.out.print("  ");
         }
         for(int z = 1; z <= x; z++)
         {
            System.out.print(z + " ");
         }
         System.out.println();
      }
   }
}