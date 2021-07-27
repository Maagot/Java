package ThinkJava.Chapter6;

public class WhileLoopExercises {
    public static void main(final String[] args) {
        // whileTest();
        // twoDimensionLoop();
        // greekAlphabet();
        // loop(10);
        square(9);
        
    }

    public static void square(int a) {
        // x = (x0 + a/x0) /2

        double x = 144;

        while (String.valueOf(x).length() < 6) {
            x = (x + a / x) / 2;           
            
            System.out.println(x);
        } 

        //looking for dot in integer
        // System.out.println(String.valueOf(x).indexOf('.'));
        int whereDot = String.valueOf(x).indexOf('.');

        //remove numbers before dot
        System.out.println(String.valueOf(x).substring(whereDot));
        String numbersAfterDotIncluded = String.valueOf(x).substring(whereDot);
        System.out.println(" here ->" + numbersAfterDotIncluded);


        //Print result
        System.out.printf("Square of %d is %.0f\n",a ,  Math.abs(x));
        
        
        //retain only 4 numbers after dot
        String letter = ""; // 
        for (int i = 0; i < 4; i++) {  
            letter = letter + numbersAfterDotIncluded.charAt(i);
            System.out.println(letter);

        }

        //letter result = the last 5 numbers after

        //TODO:"Add checking for 4 number after dot"

        System.out.println("Comparing result is " + letter.equals(".000"));
         
        while (!letter.equals(".000")) {
            x = (x + a / x) / 2;           
            
            System.out.println(x + " " + letter);


        }

        


    }

    public static void loop(int n) {
        int i = n;

        while (i > 1) {
            System.out.println(i);
        
            if (i % 2 == 0) {
                i = i / 2;
        
            } else {
                i = i + 1;
        
            } 
        }
    }

    public static void whileTest() {
        int n = 3;

        while (n >= 1) {
            System.out.println(n);
            n = n - 1;

        }

        System.out.println("while eneded.");

    }

    public static void twoDimensionLoop() {
        for (int row = 1; row <= 10; row++) {
            for (int cell = 1; cell <= 10; cell++) {
                System.out.printf("%3d", row * cell);

            }
            System.out.println();
        }

    }

    public static void greekAlphabet() {
        System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
            System.out.println();

        }

}