package labs_examples.inheritance.labs;

import javax.swing.*;

public class IT extends Company{

    private int numbEng;
    private String speciality;
    private boolean isSoft;

    public IT(){}

    public IT(int numbEmployee, int revenues, String compName,int numbEng,String speciality,boolean isSoft){
        super(numbEmployee,revenues,compName);
        this.numbEng=numbEng;
        this.speciality=speciality;
        this.isSoft=isSoft;
    }

    public int getNumbEng() {
        return numbEng;
    }

    public void setNumbEng(int numbEng) {
        this.numbEng = numbEng;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public boolean isSoft() {
        return isSoft;
    }

    public void setSoft(boolean soft) {
        isSoft = soft;
    }

    @Override
    public void buyCompany(String rival){
        System.out.println(super.getCompName() + " buys the IT rival " + rival);
    }
}
