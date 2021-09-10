package ThinkJava.Chapter7;

import java.util.Arrays;

public class Sieve {
    public static void main(String[] args) {
        sieveMethod(6);

    }

    public static void sieveMethod(int index) {
        int[] sieveArray = new int[index];

        for (int i = 0; i <= sieveArray.length - 1; i++) {
            sieveArray[i] = i;

        }



        System.out.println(Arrays.toString(sieveArray));

    }
}
