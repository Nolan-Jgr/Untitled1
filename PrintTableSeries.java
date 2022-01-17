import java.util.*;
public class PrintTableSeries
{
   public static String displaySums(int n)
   {
      double sum = 1.0/2.0;
      String x = "i\t\tSum(i)\n";
      for(int i = 1; i <= n; i++)
      {
         x += i + "\t\t" + sum + "\n";
         sum +=(double)i/(i+1);
      }
      return x;
   }
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter an integer value");
      int n = scan.nextInt();
      System.out.println(displaySums(n));
   }
}