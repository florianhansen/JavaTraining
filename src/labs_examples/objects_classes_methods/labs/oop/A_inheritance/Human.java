package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Human extends Warrior{
    int hp;
    int currentHp;

    public Human(int hp, int currentHp) {
        this.hp = hp;
        this.currentHp = currentHp;
    }

    public Human(String name, String race, int age, int gender, int fightPoint, String attacks, int hp, int currentHp) {
        super(name, race, age, gender, fightPoint, attacks);
        this.hp = hp;
        this.currentHp = currentHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public void reproduce(){
        System.out.println("There is now more humans");
    }

    @Override
    public void attack(){
        System.out.println(super.name + " attacks " + super.attacks + " and shouts 'where was Gondor when the Mordor attacked?'");
    }
}
