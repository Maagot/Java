import java.util.Arrays;

public class SimpleArray {
    public static void main(String[] args) {
        arrayMethod();
            
    }

    public static void arrayMethod() {
        int[] smallArray; //create an array
        int numberOfIndex = 2;

        smallArray = new int[4]; //create in array 4 empty indexes
        smallArray[2] = 4;
        smallArray[2]++;


        // for (int i = 0; i < smallArray.length; i++) {
        //     System.out.print(smallArray[i] + " ");

        // }
        
        // System.out.println("");

        // System.out.println(Arrays.toString(smallArray));

        int[] referenceToSmallArray = smallArray;

        // System.out.println(Arrays.toString(referenceToSmallArray));

        int[] copiedArray = new int[smallArray.length];

        for (int i = 0; i < copiedArray.length; i++) {
            copiedArray[i] = smallArray[i];

        }

        // System.out.println(Arrays.toString(copiedArray));

        int[] secondCopiedArray = Arrays.copyOf(smallArray, smallArray.length - 1);

        // System.out.println(Arrays.toString(secondCopiedArray));

        int[] traversalArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < traversalArray.length; i++) {
            traversalArray[i] *= traversalArray[i]; // every indext multiplie to itself

        }
        
        System.out.println(Arrays.toString(traversalArray));

        
        int[] searchArray = {1, 2, 3, 4, 5};

        int index = search(searchArray, 4
        );

        System.out.println(index);


    }

    public static int search(int[] targetArray, int target) {
        for (int i = 0; i < targetArray.length; i++) {
            if (targetArray[i] == target) {
                System.out.println("25 is Founded, it's in index " + i);
                return i;

            }

        }

        return -1;

    }
}
