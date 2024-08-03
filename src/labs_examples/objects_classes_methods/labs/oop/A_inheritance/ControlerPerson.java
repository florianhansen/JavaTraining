package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class ControlerPerson {
    public static void main(String[] args) {

        Healer gandalf = new Healer("Gandalf","Human",20,1,100,"SexualHealing");
        Human eric = new Human("Eric","Human",20,1,40,"Bam dans les dents",100,99);

        eric.introduce();
        gandalf.introduce();
        eric.flirt();
        gandalf.flirt();
        eric.attack();
        gandalf.heals();

    }
}
