import java.util.*;
public class FiveDigitPalindrome
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter a five digit number");
      int num = scan.nextInt();
      int temp = num; 
      int rev = 0;
      int count = 0;
      String judge = "";
      while(temp > 0)
      {
         rev += temp % 10;
         temp /= 10;
         if(temp > 0)
         {
            rev *= 10;
         }
         count += 1;
      } 
      if(rev == num)
      {
         judge = "Valid 5-digit palidrome";
      } 
      else if(count < 5 || count > 5)
      {
         judge = "Invalid 5-digit number. Try again";
      }
      else
      {
         judge = "Invalid 5-digit palindrome";
      }
      System.out.println("entered number: " + num);
      System.out.println("Judgement: " + judge);
   }
}