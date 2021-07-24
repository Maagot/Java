package ThinkJava.Chapter5;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        
        final Scanner in = new Scanner(System.in);
        
        // get and check for Double the variables A
        
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

                    if (a + b > c || a + c > b || c + b > a) {
                        System.out.println("Sorry, but you can't create a triangle :c");

                    } else {
                        System.out.println("Yea, you can make a triangle c:");

                    }

                }
            }
        }


    }
}