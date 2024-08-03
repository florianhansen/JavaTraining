package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Warrior extends Person{
    int fightPoint;
    String attacks;

    public Warrior() {
    }

    public Warrior(String name, String race, int age, int gender, int fightPoint, String attacks) {
        super(name, race, age, gender);
        this.fightPoint = fightPoint;
        this.attacks = attacks;
    }

    @Override
    public void introduce(){
        System.out.println("Argh "+super.name);
    }

    public void attack(){
        System.out.println(super.name + " attacks " + this.attacks);
    }
}
