import java.util.*;
public class BankAccount
{
   private int id;
   private double balance, annualInterestRate;
   private Date dateCreated;
   BankAccount()
   {
      id = 0;
      balance = 0.0;
      annualInterestRate = 0.0;
      dateCreated = new Date();
   }
   BankAccount(int x, double y, double z)
   {
      id = x;
      balance = y;
      annualInterestRate = z;
      dateCreated = new Date();
   }
   public int getId()
   {
      return id;
   }
   public double getBalance()
   {
      return balance;
   }
   public double getAnnualInterestRate()
   {
      return annualInterestRate;
   }
   public Date getDateCreated()
   {
      return dateCreated;
   }
   public double getMonthlyInterestRate()
   {
      return annualInterestRate / 12;
   }
   public double getMonthlyInterest()
   {
      return balance * (getMonthlyInterestRate()/100);
   }
   public void withdraw(double amnt)
   {
      balance -= amnt;
   }
   public void deposit(double amnt)
   {
      balance += amnt;
   }
   public String toString()
   {
      return "Account ID: " + getId() + "\nAccount Balance: $" + getBalance() + "\nInterest Rate: " + getAnnualInterestRate() + "%\nDate Opened: " + getDateCreated(); 
   }
}
class TestBankAccount
{
   public static void main(String[]args)
   {
      BankAccount x = new BankAccount(123456, 10000, 2.5);
      x.withdraw(3500);
      x.deposit(500);
      System.out.println(x);
      System.out.println("Earned Monthly Interest: $" + x.getMonthlyInterest());
   }
}