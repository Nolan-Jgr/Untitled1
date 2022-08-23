import java.util.*;
// this program takes some basic info from the user and calculates both 
// the BMR and DCA of the user then displays said info to the screen
public class Health
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      int input = 1;
      // this loop will continue until the user inputs 0 to stop the program
      while(input != 0)
      {
         // user inputs their height, weight, age, and gender
         System.out.println("Enter your height(in), weight(lb), age, and gender(male or female)");
         int h = scan.nextInt();
         int w = scan.nextInt();
         int age = scan.nextInt();
         scan.nextLine();
         String gender = scan.nextLine();
         double BMR;
         double DCA;
         String x;
         // Calculated BMR for either male or female
         if(gender.equals("female"))
         {
            BMR = 655 + (4.35*w) + (4.7*h) - (4.7*age);
         }
         else
         {
            BMR = 66 + (6.23*w) + (12.7*h) - (6.8*age);
         }
         // the user is asked to define their level of excerise in order to calculate and appropriate DCA
         System.out.println("Select your approximate level of exercise");
         System.out.println("1.	You don't exercise\n2.	You engage in light exercise one to three days a week\n3.	You exercise moderately three to five times a week");
         System.out.println("4.	You exercise intensely six to seven days a week\n5.	You exercise intensely six to seven days a week and have a physically active job");
         int exercise = scan.nextInt();
         // depending on the integer input the DCA is calculated using the previously established BMR
         switch(exercise)
         {
            case 2:
               x = "Exercise 2";
               DCA = BMR * 1.375;
               break;
            case 3:
               x = "Exercise 3";
               DCA = BMR * 1.55;
               break;
            case 4:
               x = "Exercise 4";
               DCA = BMR * 1.725;
               break;
            case 5:
               x = "Exercise 5";
               DCA = BMR * 1.9;
               break;
            default:
               x = "Exercise 1";
               DCA = BMR * 1.2;
               break;
         }
         // the user's info is displayed
         System.out.println(gender + ", " + h + "'', " + w + "lbs, age " + age + ", BMR = " + BMR + ", " + x + ", DCA: " + DCA);
         System.out.println("Enter a non-zero number to repeat or enter 0 to quit");
         input = scan.nextInt();

      }
      
   }
}
