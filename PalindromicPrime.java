import java.util.*;
public class PalindromicPrime
{
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