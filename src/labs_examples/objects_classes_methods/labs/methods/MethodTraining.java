package labs_examples.objects_classes_methods.labs.methods;

import labs_examples.lambdas.examples.anonymous_inner_classes.AnonymousInnerClass;

import java.util.Arrays;

public class MethodTraining {

    public static void main(String[] args) {
        //Demonstrating overloading
        conc(1, 22, 3);
        conc("allo", "c'estmoi");
        // Demontrasting largest value
        highest(25,3,12,9);
        // Consonnate
        cons("alright","coucou","incroyable ca marche vraiment je suis très étonné des progres réalisés");
        //prime
        prime(978664);
    }

    //Overloading methods
    public static String conc(int... v) {
        String entire = "";
        for (int val : v) {
            entire = entire + val;

        }
        System.out.println(entire);
        return entire;
    }

    public static String conc(String... v) {
        String entire = "";
        for (String val : v) {
            entire = entire + val;
        }
        System.out.println(entire);
        return entire;
    }

    public static void highest(int a, int b, int c, int d) {
        int[] arr = { b, c, d};
        int val = a;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > val) {
                val = arr[i];
            }

        }
        System.out.println(val);

    }

    public static void cons(String...v){
        String vowels = "zrtypqsdfghjklmwxcvbn";
        int count = 0;
             for(String text:v) {
                 for (int i = 0; i < vowels.length(); i++) {
                     for (char val : text.toCharArray()) {
                         if (val == vowels.charAt(i)) {
                             count += 1;
                         }
                     }


                 }
             }
        System.out.println(count);
    }
    public static void prime(int a){
        int prim = 0;
        int notprim = 0;

        for(int i= a - 1 ;i>1;i--){
            if(a%i==0){
                notprim+=1;
                break;
            }else{
                prim+=1;
            }
        }
        if (notprim==0){
            System.out.println("Prime");
        }else{
            System.out.println("not prime");
        }

    }




}

