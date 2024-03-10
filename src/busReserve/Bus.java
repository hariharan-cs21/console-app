package busReserve;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int no,boolean ac,int capacity){
        this.busNo=no;
        this.ac=ac;
        this.capacity=capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void displayBusInfo(){
        System.out.println("Bus No: "+busNo);
        System.out.println("AC: "+ac);
        System.out.println("Capacity: "+capacity);
        System.out.println("\n");
    }
}
