import java.util.Scanner;

public class Abecederian {
    public static void main(final String[] args) {

        // get words to compare
        String word = getWord();
        // assaign lenght to variables
        int amountOfLettersInWord = countLetters(word);
        abecederianChecker(amountOfLettersInWord, word);
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

        return amountOfLettersInWord;

    }

    public static void abecederianChecker(int amount, String word) {
        int startPoint = 0;
        char firstChar = 'a';
        boolean checkingBoolean = true;

        while (startPoint <= amount && checkingBoolean) {
            
            char letter = word.charAt(startPoint);
            
            //checking
            if (letter >= firstChar) {
                firstChar = letter;
                
            
            } else { 
                checkingBoolean = false;
                System.out.println("You word isn't abecederian");  
            }
            
            startPoint++;
            
        }

        if (checkingBoolean) {
            System.out.println("You word is abecederian");
        }

    }
nn