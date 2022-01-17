public class SandClock
{
   public static void main(String[]args)
   {
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