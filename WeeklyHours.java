import java.util.*;
public class WeeklyHours
{
   public static void main(String[]args)
   {
      int[][] x = new int[3][7];
      for(int r = 0;r < x.length;r++)
      {
         for(int c = 0; c < x[0].length;c++)
         {
            x[r][c] = (int)(Math.random()*10 + 1);
         }
      }
      System.out.println("Employees Data:");
      System.out.println("\t\t\t\tMon   Tue   Wed   Thu   Fri   Sat   Sun");
      System.out.print("Employee1\t");
      for(int r = 0;r < x.length;r++)
      {
         for(int c = 0; c < x[0].length;c++)
         {
            System.out.print(x[r][c] + "\t\t");
         }
         if(r < 2)
         {
            System.out.print("\nEmployee" + (r+2) + "\t");
         }
      }
      System.out.println("\n");
      for(int r = 0; r < x.length; r++)
      {
         int max = x[r][0];
         int index = 0;
         for(int c = 0; c < x[0].length;c++)
         {
            if(x[r][c] > max)
            {
               max = x[r][c];
               index = c; 
            } 
         }
         switch(index)
         {
            case 1:
               System.out.println("Employee" + (r+1)+" worked the most hours on Tuesday");
               break;
            case 2:
               System.out.println("Employee" + (r+1)+" worked the most hours on Wednesday");
               break;
            case 3:
               System.out.println("Employee" + (r+1)+" worked the most hours on Thursday");
               break;
            case 4:
               System.out.println("Employee" + (r+1)+" worked the most hours on Friday");
               break;
            case 5:
               System.out.println("Employee" + (r+1)+" worked the most hours on Saturday");
               break;
            case 6:
               System.out.println("Employee" + (r+1)+" worked the most hours on Sunday");
               break;
            default:
               System.out.println("Employee" + (r+1)+" worked the most hours on Monday");
               break;
         }
      }
      System.out.println("\n\nEmployee#   Weekly Hours");
      System.out.print("-------------------------");
      addHours(x);
      
   }
   public static void addHours(int[][] a)
   {
      int sum1 = 0;
      int sum2 = 0;
      int sum3 = 0;
      int r = 0;
      for(int c = 0; c < a[0].length;c++)
      {
         sum1 += a[r][c];
      }
      r++;
      for(int c = 0; c < a[0].length;c++)
      {
         sum2 += a[r][c];
      }
      r++;
      for(int c = 0; c < a[0].length;c++)
      {
         sum3 += a[r][c];
      }
      r++;
      int[] y = new int[r];
      y[0] = sum1;
      y[1] = sum2;
      y[2] = sum3;
      for(int i = 0; i < y.length-1;i++)
      {
         for(int j = i+1; j < y.length; j++)
         {
            if(y[j] < y[i])
            {
               int temp = y[j];
               y[j] = y[i];
               y[i] = temp;
            }
         }
      }
      for(int i = 0; i < y.length;i++)
      {
         if(y[i] == sum1)
         {
            System.out.println("\n\t" + (r-2) +"\t\t\t\t" + sum1);
         }
         else if(y[i] == sum2)
         {
            System.out.println("\t" + (r-1) + "\t\t\t\t" + sum2);
         } 
         else
         {
            System.out.println("\t" + (r) + "\t\t\t\t" + sum3); 
         }        
      }
      
   }
}