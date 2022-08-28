import java.util.*;
// this program checks to see if a number is both a palindrome and a prime number
// if both are satisfied an output is printed
public class PalindromicPrime
{
   // this function take in an int and checks to see if it a palindrome
   // ie same forward as backwards
   public static boolean isPalindrome(int x)
   {
      int rev = 0;
      int temp = x;
      while(temp > 0)
      {
         rev += temp % 10;
         temp /= 10;
         if(temp > 0)
         {
            rev *= 10;
         }
      } 
      if( x == rev)
         return true;
      else
         return false;
   }
   // this function takes in a int and check if it is a prime 
   public static boolean isPrime(int x)
   {
      for(int i = 2; i <= x/2; i++)
      {
         if(x % i == 0)
         {
            return false;
         }
      }
      return true;
   }
   public static void main(String[]args)
   {
      int temp = 1;
      // using loops numbers are checked to see if they are both a palindrome and prime
      // if the number is a palindrome and prime it is printed
      for(int y = 0; y < 5; y++)
      {
         for(int x = 0; x < 10; x++)
         {
            for(int z = temp; z < 1000000000;z++)
            {
               if(isPalindrome(z) && isPrime(z))
               {
                  System.out.print(z + " ");
                  temp = z + 1;
                  break;
               }
            }
         }
         System.out.println();
      }
   }
}
