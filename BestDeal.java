import java.util.*;
public class BestDeal
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the weight and price of a small box");
      int sweight = scan.nextInt();
      int sprice = scan.nextInt();
      System.out.println("enter the weight and price of a large box");
      int lweight = scan.nextInt();
      int lprice = scan.nextInt();
      String judgement = "";
      if(((double)sprice/(double)sweight) < ((double)lprice/(double)lweight))
      {
         judgement += "The smaller box is a better deal";
      }
      else if(((double)sprice/(double)sweight) == ((double)lprice/(double)lweight))
      {
         judgement += "Both boxes are of the same value";
      }
      else
      {
         judgement += "The large box is the better deal";
      }
      System.out.println("Small box weight: " + sweight + "\nSmall box price: " + sprice);
      System.out.println("Large box weight: " + lweight + "\nLarge box price: " + lprice);
      System.out.println("Judgement: " + judgement);
   }
}