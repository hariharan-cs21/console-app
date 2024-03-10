package busReserve;
import  java.util.*;

public class BusMain {
    public static void main(String[] args) {
        ArrayList<Bus>buses=new ArrayList<Bus>();
        ArrayList<Booking> bookings=new ArrayList<Booking>();

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,true,20));
        buses.add(new Bus(3,false,40));

        int userOpt;
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Enter 1 to Book\n Enter 2 to view Buses\nEnter 3 to Exit");
            userOpt=sc.nextInt();
            if(userOpt==1){
               Booking booking=new Booking();
               if(booking.isAvailable(bookings,buses)){
                   bookings.add(booking);
                   System.out.println("Booking Confirm\n");
                   booking.displayReceipt();
               }
               else {
                   System.out.println("Bus not available, Please try another Bus");
               }
            }
            else if(userOpt==2){
                for(Bus b:buses){
                    b.displayBusInfo();
                }
            }
            else if(userOpt==3){
                System.exit(1);
            }
        }
    }
}
