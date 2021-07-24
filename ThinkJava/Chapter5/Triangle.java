package ThinkJava.Chapter5;

import java.util.Scanner;

public class Triangle {
    public static void main(final String[] args) {

        double a = getAVariable();

   }

    public static double getAVariable() {
        double number = 1;
        final Scanner in = new Scanner(System.in);

        if (in.hasNextDouble()) {
            final double positiveCheck = in.nextDouble();

            if (positiveCheck <= 0) {
                System.out.println("Zero and negative number is not allowed ");

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