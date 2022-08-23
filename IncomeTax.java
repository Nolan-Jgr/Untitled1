import java.util.*;
// this program determines the income tax and tax bracket of the given inputed annual income
public class IncomeTax
{
   public static void main(String[]args)
   {
      // user is asked for their annual income
      Scanner scan = new Scanner(System.in);
      System.out.println("enter your annual income");
      int income = scan.nextInt();
      int bracket;
      double amount;
      // depending on the amount of the user's inputed income the amount is calculated and the bracket is set
      if(income <= 50000)
      {
         amount = (double)income * 0.05;
         bracket = 5;
      } 
      else if(income > 50000 && income <= 200000)
      {
         amount = 0.10*(income - 50) + 2500;
         bracket = 10;
      } 
      else if(income > 200000 && income <= 400000)
      {
         amount = 0.15*(income - 200000) + 17500;
         bracket = 15;
      }
      else if(income > 400000 && income <= 900000)
      {
         amount = 0.25*(income - 400000) + 47500;
         bracket = 25;
      } 
      else
      {
         amount = 0.35*(income - 900000) + 172500;
         bracket = 35;
      }
      // the user's income, bracket, and tax amount are printed
      System.out.println("Annual income: $" + income);
      System.out.println("Tax bracket: " + bracket + "%");
      System.out.println("Tax due amount: $" + (int)amount);
   }
}
