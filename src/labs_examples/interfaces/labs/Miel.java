package labs_examples.interfaces.labs;

public class Miel extends Washing{

    @Override
    public void switchOn() {
        System.out.println("Welcome to Miel Experience");;
    }

    @Override
    public void switchOff() {
        System.out.println("Vuuuhhhh");;
    }

    @Override
    public boolean isBroken() {
        return super.isBroken();
    }

    @Override
    public int price() {
        return 500;
    }
}
