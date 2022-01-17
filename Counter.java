import java.util.*;
public class Counter
{
   private int value;
   public Counter()
   {
      value = 0;
   } 
   public void increment()
   {
      value += 1;
   }
   public int getValue()
   {
      return value;
   }
}
class coinToss
{
   public static void main(String[]args)
   {
     Counter heads = new Counter();
     Counter tails = new Counter();
     for(int i = 1; i <= 100; i++)
     {
      int toss = (int)(Math.random()* 2);
      if(toss == 1)
      {
         tails.increment();
      }
      else
      {
         heads.increment();
      }
     } 
     System.out.println("Heads: " + heads.getValue());
     System.out.println("Tails: " + tails.getValue());
   }
}