package labs_examples.interfaces.labs;

public class Washing implements Electro{
    @Override
    public void switchOn() {
        System.out.println("Biiiiiiiiiiip");
    }

    @Override
    public void switchOff() {
        System.out.println("Bim");

    }

    @Override
    public boolean isBroken() {
        return false;
    }

    @Override
    public int price() {
        return 1500;
    }
}
