// this program uses loops to print the patter of a sandclock using the "*" character
public class SandClock
{
   public static void main(String[]args)
   {
      // the top half
      for(int y = 5;y>0;y--)
      {
         for(int z=0;z<5-y;z++)
         {
            System.out.print(" ");
         }
         for(int x=1; x <= 2*y-1  ; x++)
         {
            System.out.print("*");       
         }
         System.out.println();
      }
      // the bottom half
      for(int y = 2; y < 6;y++)
      {
         for(int z=0; z< 5-y;z++)
         {
            System.out.print(" ");
         }
         for(int x=1; x <= 2*y-1;x++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
