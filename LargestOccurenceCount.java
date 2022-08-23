import java.util.*;
// this program determines the number of occurances of the largest integer value
public class LargestOccurenceCount
{
   public static void main(String[]arg)
   {
      Scanner scan = new Scanner(System.in);
      // the user can enter as many non zero ints as they want 
      // if the user inputs zero no more numbers can be entered
      System.out.println("Enter any amount of non-zero integers you want(enter 0 to quit)");
      int x = 1;
      int large = 0;
      int count = 0;
      while(x != 0)
      {
         // if the user inputs the largest value the count is incremented by 1
         x = scan.nextInt();
         if(x == large)
         {
            count += 1;
         }
         // if the user inputs a larger number than the maximum value already entered the
         // largest value is set to that input and the count is reset
         if(x > large)
         {
            large = x;
            count = 1;
         }
      }
      // the largest value and how many times it shows up is printed
      System.out.println("Largest Value: " + large);
      System.out.println("Occurence: " + count + " times");
   }
}
