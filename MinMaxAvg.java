import java.util.*;
public class MinMaxAvg
{
   public static void main(String[]args)
   {
      int[][] Grades = new int[4][4];
      for(int rows = 0; rows < Grades.length; rows++)
      {
         for(int col = 0; col < Grades.length; col++)
         {
            Grades[rows][col] = (int)(Math.random()*100) + 1;
         }
      }
      System.out.println("Array Grades: ");
      for(int rows = 0; rows < Grades.length; rows++)
      {
         for(int col = 0; col < Grades.length; col++)
         {
            System.out.print("\t" + Grades[rows][col]);
         }
         System.out.println();
      }
      minMaxAvg(Grades);
   }
   public static void minMaxAvg(int[][] a)
   {
      int min = a[0][0];
      int max = a[0][0];
      double avg = 0;
      for(int r = 0; r < a.length;r++)
      {
         for(int c = 0; c < a.length;c++)
         {
            if(a[r][c] < min)
            {
               min = a[r][c];
            }
            if(a[r][c] > max)
            {
               max = a[r][c];
            }
            avg += a[r][c];
         }
      }
      avg = avg/16.0;
      System.out.println("Highest grade: " + max);
      System.out.println("Lowest grade: " + min);
      System.out.print("Class average: " + avg);
   } 
}