import java.util.*;
public class PhoneBill
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter an account number and service code(r/R or p/P)");
      int account = scan.nextInt();
      char code = scan.next().charAt(0);
      double amount = 0.0;
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
         System.out.println("Account number: " + account);
         System.out.println("Service type: Regular");
         System.out.println("Total minutes: " + min);
         System.out.println("Amount due: $" + amount);
        
         
         
      }
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
         System.out.println("Account number: " + account);
         System.out.println("Service type: Premium");
         System.out.println("Daytime minutes: " + dmin);
         System.out.println("Nighttime minutes: " + nmin);
         System.out.println("Amount due: $" + amount);
         
      }
   }
}