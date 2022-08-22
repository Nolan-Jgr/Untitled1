import java.util.*;
// this program uses a user inputed 5 digit number to determine if 
// the number is a palindrome ie same forward and backwards
public class FiveDigitPalindrome
{
   public static void main(String[]args)
   {
      // creates a scanner obj for user input
      Scanner scan = new Scanner(System.in);
      // user inputs a number
      System.out.println("enter a five digit number");
      int num = scan.nextInt();
      int temp = num; 
      int rev = 0;
      int count = 0;
      String judge = "";
      // uses mod and division to reverse the user's number and saves it to a variable
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
      // if the reverse variable is the same of the original the number is a palindrome
      if(rev == num)
      {
         judge = "Valid 5-digit palidrome";
      }
      // if the number isn't 5 digits long it is invalid
      else if(count < 5 || count > 5)
      {
         judge = "Invalid 5-digit number. Try again";
      }
      // if the reverse and the original aren't the same the number isn't a palindrome
      else
      {
         judge = "Invalid 5-digit palindrome";
      }
      // prints the number and the judgement
      System.out.println("entered number: " + num);
      System.out.println("Judgement: " + judge);
   }
}
