package labs_examples.conditions_loops.labs;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a word");
        String vowels = "aeiou";
        String word = scanner.next();
        int len = word.length()-1;
        int indof = -1;
        char ind;
        int i;

        for(i=0;i<=len;i++){
            ind= word.charAt(i);
            indof = vowels.indexOf(ind);
            if(indof!=-1){
                break;
                }
            }
        if(indof==-1){
            System.out.println(word);
            System.out.println("There is no vowels");

        }else{
            System.out.println(word);
            System.out.println("The first vowel is "+word.charAt(i));
        }







    }
}
