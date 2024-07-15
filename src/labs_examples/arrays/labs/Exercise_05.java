package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        int[][] array = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j]= i*j+2;
            }
        }
        for (int i = 3; i >= 0; i--) {
            for (int j = 3; j >= 0; j--) {
                if ((i+j)%2==0){
                    continue;
                }else{
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}