import java.util.*;
public class sumDigits
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number between 0 and 1000");
      int num = scan.nextInt();
      int x = num;
      int total = 0;
      while(x > 0)
      {
         total += x % 10;
         x = x / 10; 
      }
      System.out.println("Entered Number:" + num + "\nSum of Digits:" + total);
   }
}