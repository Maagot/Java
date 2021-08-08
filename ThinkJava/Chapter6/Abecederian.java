import java.util.Scanner;

public class Abecederian {
    public static void main(final String[] args) {

        // get words to compare
        final String word = getWord();
        // assaign lenght to variables
        final int amountOfLettersInWord = countLetters(word);

    }

    public static String getWord() {
        final Scanner in = new Scanner(System.in);

        System.out.print("Type your word to check it for abecederian: ");
        final String word = in.next();
        System.out.println("You typed: " + word);

        return word;

    }

    public static int countLetters(final String word) {
        final int result = word.length();
        final int amountOfLettersInWord = result - 1;
        System.out.println(amountOfLettersInWord);

        return amountOfLettersInWord;

    }

    public static void abecederianChecker(final int amount, final String word) {
        final int startPoint = 0;

        while (startPoint > amount) {
            
        }

    }
}