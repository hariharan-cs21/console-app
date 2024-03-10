package busReserve;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Booking {
    String name;
    int busno;
    Date date;
    Booking(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of Passenger:");
        name=sc.next();
        System.out.println("\nEnter Bus no: ");
        busno=sc.nextInt();
        System.out.println("\nEnter Date dd/MM/yyyy: ");
        String dateInput=sc.next();
        SimpleDateFormat simple=new SimpleDateFormat("dd/MM/yyyy");

        try {
            date=simple.parse(dateInput);
        } catch (ParseException e) {
           e.printStackTrace();
        }
    }
    public  boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
        int capacity=0;
        for(Bus b:buses){
            if(b.getBusNo()==busno){
                capacity=b.getCapacity();
            }
        }
        int booked=0;
        for(Booking b:bookings){
            if(b.busno==busno && b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
    public void displayReceipt(){
        System.out.println("Your Booking receipt:\n");
        System.out.println("Name : "+name);
        System.out.println("Bus Number : "+busno);
        System.out.println("Travel Date : "+date+"\n");
    }
}
