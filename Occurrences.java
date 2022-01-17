import java.util.*;
public class Occurrences
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter 10 integers"); 
      int[] x = new int[10];
      for(int i = 0;i<x.length;i++)
      {
         x[i] = scan.nextInt();
      } 
      System.out.print("Entered integers:\t\t");
      for(int i = 0; i < x.length;i++)
      {
         System.out.print(x[i] + " ");
      }
      System.out.println(); 
      Count(x);
   }
   public static void Count(int[] a)
   {
      Arrays.sort(a);
      int count = 0;
     
      for(int i = 0; i < a.length;i++)
      {
         int temp = a[i];
         count=0;
         for(int j = 0;j < a.length;j++)
         {
            if(a[j] == temp)
               count++;
         }
       
         System.out.println(temp + " occurred " + count + " times");
         if(count > 1 && count%2==0)
            i++;
         if(count > 1 && count%2 == 1)
            i+=2;
         if(count == 10)
            break;
      
      }     
   }
}