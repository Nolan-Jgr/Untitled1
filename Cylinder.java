import java.util.*;
// This is a program that asks the user for dimensions of a cylinder then calculates
// the cylinder's volume
public class Cylinder
{
   public static void main(String[]args)
   {
     // creates scanner object for user input
     Scanner scan = new Scanner(System.in);
     // asks user for radius
     System.out.println("Enter a radius");
     double radius = scan.nextDouble();
     // asks user for length
     System.out.println("Enter a length");
     double length = scan.nextDouble();
     // defines pi
     double pi = 3.14;
     // uses pi and the radius to calculate the area
     double area = (radius * radius) * pi;
     // uses the area and the length to calculate the volume
     double volume = area * length;
     // displays the radius, length, and volume to the user
     System.out.println("Entered radius: " + radius);
     System.out.println("Entered length: " + length);
     System.out.println("The volume is " + volume);
   }
}
