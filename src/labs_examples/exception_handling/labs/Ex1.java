package labs_examples.exception_handling.labs;

public class Ex1 {
    public static void main(String[] args) {
        int a =0;
        int b = 3;
        try{
            int c = b/a;
        }catch (ArithmeticException exc){
            System.out.println("There seems to be a problem");
        }
    }
}
