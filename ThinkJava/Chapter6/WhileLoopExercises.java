package ThinkJava.Chapter6;

public class WhileLoopExercises {
    public static void main(final String[] args) {
        // whileTest();
        // twoDimensionLoop();
        // greekAlphabet();
        // loop(10);
        // square(144);
        System.out.println(checkPow(3, 3));
        
    }

    public static double myPowPosetive(double x, double n) {

        double baseNumber = x;

            while (n != 1) {
                x = x * baseNumber;
                n--;
    
            }

        return x;

    }

    public static double checkPow(double x, double n) {
        double result = 1;

        if (n > 0) {
            result = myPowPosetive(x, n);
            
        } else {
            result = 1 / (myPowPosetive(x, n));

        }

        return result;

    }
    
    public static void gauss(int x, int n) {

        while (n <= 0) {
            x = (-1);

        }



    }

    public static void square(int a) {
        // x = (x0 + a/x0) /2

        double x;

        for(x = 6; String.valueOf(x).length() < 6; x = (x + a / x) / 2) {
            //get some computatuions for create the first sample of letter.
        
        }

        String letter = "";

        while (!letter.equals(".000")) {

            x = (x + a / x) / 2;           

            //get place of the dot in number
            int whereDot = String.valueOf(x).indexOf('.');
            //remove numbers before '.'
            String numbersAfterDotIncluded = String.valueOf(x).substring(whereDot);
            //refresh letter
            letter = numbersAfterDotIncluded.substring(0, 4);
                        
        }
        
        System.out.println("Square of " + a + " is " + Math.abs(Math.round(x)));
        


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