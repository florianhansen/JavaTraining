package labs_examples.conditions_loops.labs;

import videos_source_code.conditional_statements.WhileLoop;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for(int i =0;i<10;i++){
            System.out.println(i);
            if(i*2==8){
                break;
            }
        }
    }
}
