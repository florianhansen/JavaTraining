package labs_examples.exception_handling.labs;

public class Ex7main {
    public static void main(String[] args) {
        try{
            ex7fct();
        } catch (Ex7 e) {
            System.out.println("Exception caught like a pro");
        }

    }
    public static void ex7fct() throws Ex7{
        Ex7 exc = new Ex7();
        throw exc;
    }

}
