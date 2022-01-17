import java.util.*;
public class DistinctValues
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      int[] x = new int[10];
      for(int i = 0; i < x.length; i++)
      {
         x[i] = scan.nextInt();
      }
      System.out.print("Original array: ");
      for(int i = 0; i < x.length; i++)
      {
         System.out.print(x[i] + " ");
      }
      System.out.println();
      System.out.print("Distinct array: ");
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
      Arrays.sort(a);
      int[] y = new int[len];
      int index = 0;
      for(int i = 0; i < a.length; i++)
      {
         int temp = a[i];
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
      return y;       
   }
}
