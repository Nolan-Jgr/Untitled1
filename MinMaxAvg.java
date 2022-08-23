import java.util.*;
// this program uses a 4x4 array of random values that represent grades to 
// calculate the min grade, max grade, and avg of the grades
public class MinMaxAvg
{
   public static void main(String[]args)
   {
      int[][] Grades = new int[4][4];
      // the array is populated with random values
      for(int rows = 0; rows < Grades.length; rows++)
      {
         for(int col = 0; col < Grades.length; col++)
         {
            Grades[rows][col] = (int)(Math.random()*100) + 1;
         }
      }
      // the array of grades is printed
      System.out.println("Array Grades: ");
      for(int rows = 0; rows < Grades.length; rows++)
      {
         for(int col = 0; col < Grades.length; col++)
         {
            System.out.print("\t" + Grades[rows][col]);
         }
         System.out.println();
      }
      // a function call is made using the array of grades
      minMaxAvg(Grades);
   }
   // this function takes in a 2D array and determines the min grade, max grade, and avg grade
   public static void minMaxAvg(int[][] a)
   {
      // base values for min max and avg are set
      int min = a[0][0];
      int max = a[0][0];
      double avg = 0;
      // depending of the value of grade at the specified index the min and max are set
      // all grade values are added to the avg variable
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
      // avg is calcualted and the grade info is printed 
      avg = avg/16.0;
      System.out.println("Highest grade: " + max);
      System.out.println("Lowest grade: " + min);
      System.out.print("Class average: " + avg);
   } 
}
