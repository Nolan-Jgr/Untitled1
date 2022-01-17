import java.util.*;
public class Occurences
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[][] x = new int[3][3];
      int[][] y = new int[3][3];
      System.out.println("Enter 9 values for each of the 3x3 arrays");
      System.out.println("Array A: ");
      for(int r =0; r < x.length; r++)
      {
         for(int c =0; c < x[0].length; c++)
         {
            x[r][c] = scan.nextInt();  
         }
      }
      System.out.println("Array B: ");
      for(int r =0; r < y.length; r++)
      {
         for(int c =0; c < y[0].length; c++)
         {
            y[r][c] = scan.nextInt();  
         }
      }
      if(isEquivalent(x, y))
      {
         System.out.println("Judgment: The arrays are equivalent");
      }
      else
      {
         System.out.println("Judgement: The arrays are not equivalent");
      }
   }
   static boolean isEquivalent(int[][] a, int[][] b)
   {
      int[] one = new int[a.length * a[0].length];
      int[] two = new int[b.length * b[0].length];
      int index = 0;
      for(int r = 0; r < a.length; r++)
      {
         for(int c = 0; c < a[0].length; c++)
         {
            one[index] = a[r][c];
            index++;   
         }
      }
      index = 0;
      for(int r = 0; r < b.length; r++)
      {
         for(int c = 0; c < b[0].length; c++)
         {
            two[index] = b[r][c];
            index++;   
         }
      }
      for(int i=0; i < one.length-1;i++)
      {
         for(int j = i+1; j < one.length; j++)
         {
            if(one[j] < one[i])
            {
               int temp = one[j];
               one[j] = one[i];
               one[i] = temp;
            }
            if(two[j] < two[i])
            {
               int temp = two[j];
               two[j] = two[i];
               two[i] = temp;
            }
         }
      }
      for(int i = 0; i < one.length; i++)
      {
         if(one[i] != two[i])
            return false;
      }
      return true;
      
   }
}