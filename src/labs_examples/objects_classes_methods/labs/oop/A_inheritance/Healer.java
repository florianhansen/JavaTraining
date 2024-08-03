package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Healer extends Person{
    int healingPoint;
    String healPower;

    public Healer() {

    }

    public Healer(String name, String race, int age, int gender, int healingPoint, String healPower) {
        super(name, race, age, gender);
        this.healingPoint = healingPoint;
        this.healPower = healPower;
    }

    public int getHealingPoint() {
        return healingPoint;
    }

    public void setHealingPoint(int healingPoint) {
        this.healingPoint = healingPoint;
    }

    public String getHealPower() {
        return healPower;
    }

    public void setHealPower(String healPower) {
        this.healPower = healPower;
    }

    public void heals(){
        System.out.println(super.name + " heals with "+ this.healPower);
    }

    @Override
    public void flirt(){
        System.out.println("Hello, let me heal your heart");
    }
}
