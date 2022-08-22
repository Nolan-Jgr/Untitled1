import java.util.*;
// This program takes in an array of integers from the user
// The function getValues then creates an array without duplicate numbers from the original array
public class DistinctValues
{
   public static void main(String[]args)
   {
      // creates a scanner object for user input
      Scanner scan = new Scanner(System.in);
      // initialized an array of 10 integers
      int[] x = new int[10];
      for(int i = 0; i < x.length; i++)
      {
         // the array is filled using user input
         x[i] = scan.nextInt();
      }
      // the user defined array is printed
      System.out.print("Original array: ");
      for(int i = 0; i < x.length; i++)
      {
         System.out.print(x[i] + " ");
      }
      System.out.println();
      // the modified array without duplicates is printed
      System.out.print("Distinct array: ");
      // function call
      int[] y = getValues(x);
      for(int i = 0; i < y.length;i++)
      {
         if(y[i] != 0)
            System.out.print(y[i] + " ");        
      }
      
   }
   public static int[] getValues(int[] a)
   {
      int len = a.length;
      // sorts the array in ascending order
      Arrays.sort(a);
      // initialized an empty array that will contain only unique numbers
      int[] y = new int[len];
      int index = 0;
      // each index of the original array is checked for duplicate occurances
      for(int i = 0; i < a.length; i++)
      {
         // each index is saved to a temporary value
         int temp = a[i];
         // the array holding the unique value is checked to make sure
         // only one occurence of each number is added
         for(int j = 0; j < y.length;j++)
         {
            if(y[j] != temp && index == 0)
            {
               y[index] = temp;
               break;
            }
            if(y[j] != temp && y[index-1] != temp)
            {
               y[index] = temp;
            }
         }
         if(y[index] == temp && index < len-1)
         {
            index++;
         }       
      }
      // after the array is populated with unique values it is returned
      return y;       
   }
}
