package labs_examples.inheritance.labs;

public class ControllerComp {

    public static void main(String[] args) {
        Company microsoft = new Company(10000,5779976,"Microsoft");
        ConsultingIT accenture = new ConsultingIT(40, 50000, "Accenture", 10, "Projet", false, 10, 1000);
        accenture.publishAccount();
        accenture.buyCompany("PwC");
        microsoft.buyCompany("Open AI");
    }
}
