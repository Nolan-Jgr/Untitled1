import java.util.*;
// this program represents a phone bill either a regualar plan or premium plan
public class PhoneBill
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      // account num is entered and the type of plan is specified
      System.out.println("enter an account number and service code(r/R or p/P)");
      int account = scan.nextInt();
      char code = scan.next().charAt(0);
      double amount = 0.0;
      // if the plan is regular the total minutes is entered and the amount is calculated
      if(code == 'r' || code == 'R') 
      {
         System.out.println("enter the number of minutes used");
         int min = scan.nextInt();
         if(min <= 50 && min > 0)
         {
            amount = 15.0;
         }
         else if(min == 0)
         {
            amount = 0.0;
         }
         else
         {
            amount = 0.5*(min-50) + 15.0; 
         }
         // account information is printed
         System.out.println("Account number: " + account);
         System.out.println("Service type: Regular");
         System.out.println("Total minutes: " + min);
         System.out.println("Amount due: $" + amount);
      }
      // if the plan is premium daytime and nightime min are specified and the amounts are calculated separetly 
      else if(code == 'p' || code == 'P')
      {
         System.out.println("enter the number of minutes for daytime use and nighttime use");
         int dmin = scan.nextInt();
         int nmin = scan.nextInt();
         amount = 25.0;
         if(dmin > 50)
         {
            amount += 0.2*(dmin-50);
         }
         if(nmin > 100)
         {
            amount += 0.1*(nmin - 100);
         }
         // account information is printed
         System.out.println("Account number: " + account);
         System.out.println("Service type: Premium");
         System.out.println("Daytime minutes: " + dmin);
         System.out.println("Nighttime minutes: " + nmin);
         System.out.println("Amount due: $" + amount);
         
      }
   }
}
