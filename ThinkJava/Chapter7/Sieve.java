package ThinkJava.Chapter7;

import java.util.Arrays;

public class Sieve {
    public static void main(String[] args) {
//        sieveMethod(120);

    }

    public static boolean areFactors(int n, int[] fCheck) {

        return false;

    }

    public static boolean[] sieveMethod(int index) {
        // allocate memory for array
        int[] sieveArray = new int[index];
        boolean[] sieveBooleanArray = new boolean[index];

        // fill array with numbers from 1 to n
        for (int i = 0; i < sieveArray.length; i++) {
            sieveArray[i] = i + 1;

            if (sieveArray[i] == 2 || sieveArray[i] == 3 || sieveArray[i] == 5) {
                sieveBooleanArray[i] = true;

            } else if (sieveArray[i] % 2 != 0 && sieveArray[i] % 3 != 0 && sieveArray[i] % 5 != 0 && sieveArray[i] % 7 != 0) {
                sieveBooleanArray[i] = true;

            }

        }

        System.out.println(Arrays.toString(sieveArray));
        System.out.println(Arrays.toString(sieveBooleanArray));
        System.out.println(sieveArray[98 - 2]);
        System.out.println(sieveBooleanArray[98 - 2]);



        return sieveBooleanArray;

    }
}
