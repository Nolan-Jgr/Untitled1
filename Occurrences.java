import java.util.*;
// this program takes in 10 user-inputed integers and displays
// how many times each integers occurs
public class Occurrences
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter 10 integers"); 
      // an array of length 10 is initialized
      int[] x = new int[10];
      // the area is filled in via user input
      for(int i = 0;i<x.length;i++)
      {
         x[i] = scan.nextInt();
      }
      // the array of intgers is printed
      System.out.print("Entered integers:\t\t");
      for(int i = 0; i < x.length;i++)
      {
         System.out.print(x[i] + " ");
      }
      System.out.println(); 
      // funciton call to display the count of each integer entered by the user
      Count(x);
   }
   // this function takes in an array of integers an prints for each index
   // the number of times that integer appears within the array
   public static void Count(int[] a)
   {
      // the array is sorted in ascending order
      Arrays.sort(a);
      int count = 0;
      // the array is traversed and the amount of times a number occurs after the first is saved    
      for(int i = 0; i < a.length;i++)
      {
         int temp = a[i];
         count=0;
         for(int j = 0;j < a.length;j++)
         {
            if(a[j] == temp)
               count++;
         }
         // the occurence is printed
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
