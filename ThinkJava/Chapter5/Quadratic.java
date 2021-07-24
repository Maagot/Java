package ThinkJava.Chapter5;

import java.util.Scanner;

public class Quadratic {
    public static void main(final String[] args) {

        // Quadratic equation look like this: axx + bx + c = 0

        final Scanner in = new Scanner(System.in);
        
        // get and check for Double the variables A
        System.out.println("Quadratic equation is AXX + BX + C = 0");
        
        System.out.print("Type A variable: ");
        
        if (!in.hasNextDouble()) {
            final String word = in.next();
            System.err.println("\"" + word + "\" is not allowed, only numbers!");

        } else {
            final double a = in.nextDouble();
            System.out.println("Variable a is: " + a);

            //Get and check for Double variable b

            System.out.print("Type B variable: ");

            if (!in.hasNextDouble()) {
                final String word = in.next();
                System.err.println("\"" + word + "\" is not allowed, only numbers!");

            } else {
                final double b = in.nextDouble();
                System.out.println("Variable b is: " + b);

                // Get and check for Double variable C

                System.out.print("Type c variable: ");

                if (!in.hasNextDouble()) {
                    final String word = in.next();
                    System.err.println("\"" + word + "\" is not allowed, only numbers!");

                } else {

                    final double c = in.nextDouble();
                    System.out.println("Variable c is: " + c);

                    computingQuadraticEquation(a, b, c); // go calculate the result
                }
            }
        }

    }

    public static void computingQuadraticEquation(final double a, final double b, final double c) {
        final double d = Math.pow(b, 2) - 4 * a * c; // Descriminante
        double x1;
        double x2;

        // compute Equation

        if (d > 0) {

            // If descriminante greater than 0 he has 2 roots

            x1 = (-b + Math.sqrt(d)) / 2 * a;
            x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.printf("Congratulations, here is 2 roots: %.1f and %.1f \n", x1, x2);
            System.out.printf("A * %.0f * %.0f + b %.0f + c = 0 \n", x1, x1, x1);
            System.out.printf("A * %.0f * %.0f + b * %.0f + c = 0 \n", x2, x2, x2);
        } else if (d == 0) {

            // If descriminante equal 0 he has only root

            x1 = -b / 2 * a;
            System.out.printf("Congratulations, here is 1 root: %.1f \n", x1);
            System.out.println("a * " + x1 + "*" + x1 + " + b * " + x1 + " * c = 0");

        } else {

            // if descriminante lower 0 he didn't have roots, it's mean that equation not equal 0
           
            System.out.println("Unfortunately, it is can't be equal");

        }


    }

}