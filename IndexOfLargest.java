import java.util.*;
// this program asks the user for 10 integers and returns the index of the largest integer
public class IndexOfLargest
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter 10 integers");
      int[] x = new int[10];
      // the array is filled with user inputed integers
      for(int i = 0;i < x.length;i++)
      {
         x[i] = scan.nextInt();
      }
      System.out.print("Entered integers: ");
      for(int i: x)
      {
         System.out.print(i + " ");
      }
      System.out.println();
      // calls the findIndex function and prints the index of the largest value
      System.out.print("Index of largest value is " + findIndex(x));
   }
   // this function take in an array and returns the index of the largest integer within that array
   public static int findIndex(int[] a)
   {
      int temp = a[0];
      int index  = 0;
      for(int i = 0; i < a.length;i++)
      {
         if(a[i] > temp)
         {
            index = i;
            temp = a[i];
         }
      }
      return index;
   }  
}
