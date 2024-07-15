package labs_examples.arrays.labs;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int[] inp = new int[10];
        for(int i=0;i<10;i++){
            Scanner scan = new Scanner(System.in);
            int scaninp = scan.nextInt();
            inp[i]=scaninp;
            }
        int count =0;
        for(int vals:inp){
            count += vals;
        }
        float avg = (float) count/inp.length;
        System.out.println("The sum is "+ count);
        System.out.println("The average is "+ avg);
    }
}