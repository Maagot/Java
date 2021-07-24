package ThinkJava.Chapter5;

import java.util.Scanner;

public class Triangle {
    public static void main(final String[] args) {
        //programm checking neither we can or no to construct the triangle with sticks

        //get lenght of sticks for building a triangle
        System.out.print("Type length of first stick in centimeters: ");
        double lenghtOfFirstStick = getAVariable();
        System.out.println("Lenght of first stick is " + lenghtOfFirstStick + " centimeters.");

        System.out.print("Type length of first stick in centimeters: ");
        double lenghtOfSecondStick = getAVariable();
        System.out.println("Lenght of second stick is " + lenghtOfSecondStick + " centimeters.");

        System.out.print("Type length of third stick in centimeters: ");
        double lenghtOfThirdStick = getAVariable();
        System.out.println("Lenght of third stick is " + lenghtOfThirdStick + " centimeters.");


        // compute, can we build a triangle with these stiks
        if (computing(lenghtOfFirstStick, lenghtOfSecondStick, lenghtOfThirdStick)) {
            System.out.println("Congratulations, you can construct a triangle this sticks!");
        
        } else {
            System.out.println("Sorry, urfortunately one of these sticks are " + 
            "too long for constructing the triangle.");

        }




   }

    public static double getAVariable() {
        double number = 1;
        final Scanner in = new Scanner(System.in);

        if (in.hasNextDouble()) {
            final double positiveCheck = in.nextDouble();

            if (positiveCheck <= 0) {
                System.out.println("Zero and negative number is not allowed"
                + ", so we decide that first value is 1cm.");

            } else {
                number = positiveCheck;

            }

        } else {
            final String word = in.next();
            System.out.println("\"" + word + "\" is not a number, " +
            "so value of variable equal 1");
            

        }

        return number;
    }

    public static boolean computing(double a, double b, double c) {
        boolean result;
        if (a + b < c || a + c < b || c + b < a) {
            result = false;

        } else {
            result = true;
            
        }

        return result;

    }
}