package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for(int j=0;j<5;j++){
            for(int i=0;i<5;i++){
                array[j][i]=(i+1)*3+15*j;
            }
        }
        for(int[] val:array){
            for(int vals:val){
                System.out.print(vals+ " ");
            }
            System.out.println();
        }
    }

}
