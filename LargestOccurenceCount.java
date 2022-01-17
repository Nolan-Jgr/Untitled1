import java.util.*;
public class LargestOccurenceCount
{
   public static void main(String[]arg)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter any amount of non-zero integers you want(enter 0 to quit)");
      int x = 1;
      int large = 0;
      int count = 0;
      while(x != 0)
      {
         x = scan.nextInt();
         if(x == large)
         {
            count += 1;
         }
         if(x > large)
         {
            large = x;
            count = 1;
         }
      }
      System.out.println("Largest Value: " + large);
      System.out.println("Occurence: " + count + " times");
   }
}
