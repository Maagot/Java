package ThinkJava.Chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class Doubloon {
    
    public static String getWord() {
        final Scanner in = new Scanner(System.in);

        System.out.print("Type your word to check it for doubloon: ");
        final String word = in.next();
        System.out.println("You typed: " + word);

        return word;

    }

    public static int countLetters(final String word) {
        final int result = word.length();
        final int amountOfLettersInWord = result - 1;

        return amountOfLettersInWord;

    }

    public static void doubloonChecker(int amount, String word) {
        int startPoint = 0;
        boolean checkingBoolean = true;
        int innerPoint;

        while (startPoint <= amount && checkingBoolean) {
            
            char letter = word.charAt(startPoint); //get letter for comparsion


            if (startPoint == amount) {
                innerPoint = startPoint - 1; // set last comparsion for prelast & last letter

            } else {
                innerPoint = startPoint + 1; // define index for second letter

            }

            char secondLetter = word.charAt(innerPoint);

            while (innerPoint <= amount) { // comparsion every letter with firstLetter
                
                if (letter == secondLetter) { // comparsion for equalent
                    checkingBoolean = false; 

                }
                
                secondLetter = word.charAt(innerPoint); // set new letter for new round 

                innerPoint++; // increase index by one on next round 
                //increment after defining, it removes "index out of range"

                
            }
            
            startPoint++; // increase letter index 
            
        }

        if (!checkingBoolean) {
            System.out.println("Your word is doubloon");
        } else {
            System.out.println("Your word isn't doubloon");
        }

    }

    public static void main(String[] args) {

//        String word = getWord();
//        int amountOfLetters = countLetters(word);
//        doubloonChecker(amountOfLetters, word);




        Scanner in = new Scanner(System.in);
        System.out.println("Is doubloon - " + trueDoubloon(in.nextLine()));


    }

    public static boolean trueDoubloon(String word) {

        int counts[] = new int[26]; //create an empty alphabet counting array (26 letters in english alphabet)
        String lower = word.toLowerCase(); //make inputted word in lowerCase

        //counting letters and add every to array
        for (char letter : lower.toCharArray()) {
            int index = letter - 'a';
            counts[index]++;

        }

        for (int count : counts) {
            if (count != 0 && count != 2) {
                return false;

            }

        }

        return true;

    }

}