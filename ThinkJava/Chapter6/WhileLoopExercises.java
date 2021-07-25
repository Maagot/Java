package ThinkJava.Chapter6;

public class WhileLoopExercises {
    public static void main(final String[] args) {
        // whileTest();
        // twoDimensionLoop();
        greekAlphabet();


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