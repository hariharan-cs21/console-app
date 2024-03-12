package covid;

public class Patient {
    private String name;
    private int age;
    private String address;
    private boolean isInfected;

    public Patient(String name, int age, String address,boolean isInfected) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.isInfected = false;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return  age;
    }
    public boolean isInfected(){
        return isInfected;
    }
}
