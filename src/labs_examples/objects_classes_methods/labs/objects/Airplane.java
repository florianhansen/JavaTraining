package labs_examples.objects_classes_methods.labs.objects;


class Airplane {
    private double fuelCapacity;
    private double currentFuelLevel;
    private Company company;
    private Seats seats;
    private Motor motor;
    private Staff staff;

    public Airplane(double fuelCapacity, double currentFuelLevel, Company company, Seats seats, Motor motor, Staff staff) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.company = company;
        this.seats = seats;
        this.motor = motor;
        this.staff = staff;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Seats getSeats() {
        return seats;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", company=" + company +
                ", seats=" + seats +
                ", motor=" + motor +
                ", staff=" + staff +
                '}';
    }
}

class Company{

    String compName;
    String compLogo;
    public Company(){}
    public Company(String compName,String compLogo){
        this.compName = compName;
        this.compLogo = compLogo;
    }

    public String getCompName() {
        return compName;
    }

    public String getCompLogo() {
        return compLogo;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public void setCompLogo(String compLogo) {
        this.compLogo = compLogo;
    }

    @Override
    public String toString() {
        return "Company{" +
                "compName='" + compName + '\'' +
                ", compLogo='" + compLogo + '\'' +
                '}';
    }
}

class Seats{
    private int seatNum;
    private String seatMat;
    public Seats(){}
    public Seats(int seatNum, String seatMat) {
        this.seatNum = seatNum;
        this.seatMat = seatMat;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getSeatMat() {
        return seatMat;
    }

    public void setSeatMat(String seatMat) {
        this.seatMat = seatMat;
    }

    @Override
    public String toString() {
        return "Seats{" +
                "seatNum=" + seatNum +
                ", seatMat='" + seatMat + '\'' +
                '}';
    }
}

class Motor{
    private int hp;
    private String make;
    public Motor(){}
    public Motor(int hp, String make) {
        this.hp = hp;
        this.make = make;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "hp=" + hp +
                ", make='" + make + '\'' +
                '}';
    }
}

class Staff{
    private int staffNum;
    public Staff(){}

    public Staff(int staffNum) {
        this.staffNum = staffNum;
    }

    public int getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(int staffNum) {
        this.staffNum = staffNum;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffNum=" + staffNum +
                '}';
    }
}
class Example2{
    public static void main(String[] args) {
        Company myCompany = new Company();
        Motor myMotor = new Motor();
        Seats mySeats= new Seats();
        Staff myStaff = new Staff();
        myCompany.setCompLogo("Flag");
        myCompany.setCompName("UAE");
        myMotor.setHp(400);
        myMotor.setMake("RollsRoyce");
        mySeats.setSeatNum(300);
        mySeats.setSeatMat("Leather");
        myStaff.setStaffNum(10);
        Airplane myAirplane = new Airplane(500,300,myCompany,mySeats,myMotor,myStaff);
        System.out.println(myAirplane.toString());


    }
}

