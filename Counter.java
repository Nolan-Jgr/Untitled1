import java.util.*;
// a counter object with a value and an increment function
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
// a coinToss game that uses the counter object to count the number of heads and tails 
class coinToss
{
   public static void main(String[]args)
   {
     Counter heads = new Counter();
     Counter tails = new Counter();
     // flips a coin 100 times and either increments the heads or tails counter based on the outcome
     // 1 means a tail and 0 means heads
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
     // prints the outcome of the counters
     System.out.println("Heads: " + heads.getValue());
     System.out.println("Tails: " + tails.getValue());
   }
}
