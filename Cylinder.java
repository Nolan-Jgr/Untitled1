import java.util.*;
public class Cylinder
{
   public static void main(String[]args)
   {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a radius");
     double radius = scan.nextDouble();
     System.out.println("Enter a length");
     double length = scan.nextDouble();
     double pi = 3.14;
     double area = (radius * radius) * pi;
     double volume = area * length;
     System.out.println("Entered radius: " + radius);
     System.out.println("Entered length: " + length);
     System.out.println("The volume is " + volume);
   }
}