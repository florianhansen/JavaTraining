package labs_examples.inheritance.labs;

public class Company {
    private int numbEmployee;
    private int revenues;
    private String compName;

    public Company(){}

    public Company(int numbEmployee, int revenues, String compName){
        this.numbEmployee =numbEmployee;
        this.revenues=revenues;
        this.compName=compName;
    }

    public int getNumbEmployee() {
        return numbEmployee;
    }

    public void setNumbEmployee(int numbEmployee) {
        this.numbEmployee = numbEmployee;
    }

    public int getRevenues() {
        return revenues;
    }

    public void setRevenues(int revenues) {
        this.revenues = revenues;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public void publishAccount(){
        System.out.println("The accounts are published");
    }

    public void buyCompany(String rival){
        System.out.println(this.compName + " buys " + rival);
    }
}
