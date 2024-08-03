package labs_examples.interfaces.labs;

public class Dishing implements Electro{
    @Override
    public void switchOn() {
        System.out.println("Blurp");
    }

    @Override
    public void switchOff() {
        System.out.println("Bip");
    }

    @Override
    public boolean isBroken() {
        return false;
    }

    @Override
    public int price() {
        return 150;
    }
}
