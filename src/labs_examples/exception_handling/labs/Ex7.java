package labs_examples.exception_handling.labs;

public class Ex7 extends Throwable {
    @Override
    public String toString(){
        System.out.println("That's cool");
        return "that's cool";
    }
}

