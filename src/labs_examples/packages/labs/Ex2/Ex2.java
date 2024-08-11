package labs_examples.packages.labs.Ex2;

import labs_examples.packages.labs.Ex1.Ex1;

public class Ex2 {
    protected static void ex2(){
        System.out.println("This is protectedd");
    }
    public static void pubex2(){
        System.out.println("This is public");
    }

    public static void main(String[] args) {
        Ex1.pubex1();


    }
}
