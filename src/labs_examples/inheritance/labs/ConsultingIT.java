package labs_examples.inheritance.labs;

public class ConsultingIT extends IT{
    private int numCons;
    private int ratePerHour;


    public ConsultingIT() {
    }

    public ConsultingIT(int numbEmployee, int revenues, String compName, int numbEng, String speciality, boolean isSoft, int numCons, int ratePerHour) {
        super(numbEmployee, revenues, compName, numbEng, speciality, isSoft);
        this.numCons = numCons;
        this.ratePerHour = ratePerHour;
    }

    public int getNumCons() {
        return numCons;
    }

    public void setNumCons(int numCons) {
        this.numCons = numCons;
    }

    public int getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(int ratePerHour) {
        this.ratePerHour = ratePerHour;
    }


}
