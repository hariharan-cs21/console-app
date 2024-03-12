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


}
