package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Person {

    String name;
    String race;
    int age;
    int gender;


    public Person(){}
    public Person(String name, String race, int age, int gender) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void introduce(){
        System.out.println("Hello my name is "+this.name);
    }

    public void flirt(){
        System.out.println("Hello, I am a " + this.race + " and I am looking for love");
    }
}
