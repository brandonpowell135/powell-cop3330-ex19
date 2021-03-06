/*Exercise 19 - BMI Calculator

You’ll often need to see if one value is within a certain range and alter the flow of a program as a result.

Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in pounds. The program should prompt the user for weight and height.

Calculate the BMI by using the following formula:

bmi = (weight / (height × height)) * 703
If the BMI is between 18.5 and 25, display that the person is at a normal weight. If they are out of that range, tell them if they are underweight or overweight and tell them to consult their doctor.

Example Output

Your BMI is 19.5.
You are within the ideal weight range.

or

Your BMI is 32.5.
You are overweight. You should see your doctor.

Constraint
Ensure your program takes only numeric data. Don’t let the user continue unless the data is valid.
Challenges
Make the user interface accept height and weight in Imperial or metric units. You’ll need a slightly different formula for metric units.
For Imperial measurements, prompt for feet and inches and convert feet to inches so the user doesn’t have to.
Use a GUI interface with sliders for height and weight. Update the user interface on the fly. Use colors as well as text to indicate health.

 */
import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        //inputs weight
        boolean isNumber;
        System.out.print("Enter your weight in pounds: ");

        do {
            if (in.hasNextInt()) {
                isNumber = true;
            } else {
                System.out.print("Please enter a numerical value! ");
                isNumber = false;
                in.nextLine();
            }
        }while (!(isNumber));
        String str1 = in.nextLine();

        double pounds = Double.parseDouble(str1);

        //inputs height
        boolean isNumber2;
        System.out.print("Enter your height in inches: ");

        do {
            if (in.hasNextInt()) {
                isNumber2 = true;
            } else {
                System.out.print("Please enter a numerical value! ");
                isNumber2 = false;
                in.nextLine();
            }
        }while (!(isNumber2));
        String str2 = in.nextLine();

        double height = Double.parseDouble(str2);

        //calculations
       double bmi = (pounds / (height * height)) * 703;

       if (bmi < 18.5){
           System.out.println(String.format("Your BMI is %.2f",bmi));
           System.out.print("You are underweight. You should see your doctor.");
       }
       else if (bmi > 25){
           System.out.println(String.format("Your BMI is %.2f",bmi));
           System.out.print("You are overweight. You should see your doctor.");
       }
       else{
           System.out.print("You are within the ideal weight range.");
       }


    }
}
