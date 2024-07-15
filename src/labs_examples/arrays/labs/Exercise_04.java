package labs_examples.arrays.labs;

import java.io.PrintStream;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] petitnom = {{3, 2}, {4, 3, 3}, {3, 2, 3, 3, 3, 4}};
        for (int[] vals : petitnom) {
            for (int val : vals) {
                System.out.println(val);
            }
        }
    }
}
