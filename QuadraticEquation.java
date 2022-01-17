import java.util.*;
public class QuadraticEquation
{
   private int a,b,c; 
   public QuadraticEquation(int x,int y, int z)
   {
      a = x;
      b = y;
      c = z;
   }
   public double getDiscriminant()
   {
      return (double)(Math.pow(b,2) - 4*a*c);
   }
   public double getRoot1()
   {
      if(getDiscriminant() > 0)
      {
         return (double)(-b + Math.sqrt(getDiscriminant()))/(2*a);
      }
      else
      {
         return 0;
      }
   }
   public double getRoot2()
   {
      if(getDiscriminant() > 0)
      {
         return (double)(-b - Math.sqrt(getDiscriminant()))/(2*a);
      }
      else
      {
         return 0;
      }
   }
   public String toString()
   {
      return "a = " + a + "\nb = " + b + "\nc = " + c;
   }
}
class TestEquation
{
   public static void main(String[]args)
   {
      QuadraticEquation x = new QuadraticEquation(3, 8, 4);
      System.out.println(x);
      if(x.getRoot1() != 0)
      {
         System.out.println("Root 1 = " + x.getRoot1()); 
      }
      else
      {
         System.out.println("Root 1 is Undefined");
      }
      if(x.getRoot2() != 0)
      {
         System.out.println("Root 2 = " + x.getRoot2()); 
      }
      else
      {
         System.out.println("Root 2 is Undefined");
      }
      QuadraticEquation y = new QuadraticEquation(3, 4, 8);
      System.out.println(y);
      if(y.getRoot1() != 0)
      {
         System.out.println("Root 1 = " + y.getRoot1()); 
      }
      else
      {
         System.out.println("Root 1 is Undefined");
      }
      if(y.getRoot2() != 0)
      {
         System.out.println("Root 2 = " + y.getRoot2()); 
      }
      else
      {
         System.out.println("Root 2 is Undefined");
      }
      QuadraticEquation z = new QuadraticEquation(2, 8, 2);
      System.out.println(z);
      if(z.getRoot1() != 0)
      {
         System.out.println("Root 1 = " + z.getRoot1()); 
      }
      else
      {
         System.out.println("Root 1 is Undefined");
      }
      if(z.getRoot2() != 0)
      {
         System.out.println("Root 2 = " + z.getRoot2()); 
      }
      else
      {
         System.out.println("Root 2 is Undefined");
      }
   }

}