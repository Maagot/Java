package ThinkJava.Chapter7;
import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        int[] a = {0, 5, 10, 115, 200, 25, 30, 35, 40};

        System.out.println(indexOfMax(a));
        System.out.println(a.length);

    }

    public static int indexOfMax(int[] aInt) {
        int index = -1;
        int maxIntStore = -1;
        int i = 0;

//        System.out.println(Arrays.toString(aInt));
        //traverse

        while (i < aInt.length - 1) {
            int iTwo = 0;
            int base = aInt[i];

            while (iTwo < aInt.length - 1) {
                //comparison
                System.out.println(base + " -- " + aInt[iTwo] + " " + iTwo);
                iTwo++;

                if (base < aInt[iTwo]) {
                    base = aInt[iTwo];
                    index = iTwo;


                }

            }

            i++;
            maxIntStore = index;
        }

        System.out.println("maxIntStore is " + maxIntStore);

        return index;

    }

}