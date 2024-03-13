package DoctorPatient;


import java.util.HashMap;
import java.util.Scanner;

public class Doctor {
    private String doctorId;
    private String doctorName;
    Doctor(String doctorId,String doctorName){
        this.doctorId=doctorId;
        this.doctorName=doctorName;
    }
    private HashMap<String,String>appoin;
    public void createAppointment(HashMap<String,Patient>p,HashMap<String,String>appointments){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Patient Name : ");
        String patient=sc.nextLine();
        System.out.println("Enter Appointment Date in (DD/MM/YYYY):");
        String date=sc.nextLine();
        System.out.println("Appointment creatd for Date " + p.get(patient).getPatientName());
        appointments.put(p.get(patient).getPatientName(),date);
        appoin=appointments;
    }
    public void prescriptions(HashMap<String, Patient> patients, HashMap<String, String> prescriptions){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Patient Name");
        String patient=sc.nextLine();
        System.out.println("Enter Patient Name");
        String mediactionName=sc.nextLine();
        System.out.println("Enter Dosage");
        String dosage=sc.nextLine();
        System.out.println("Enter Frequency");
        String frequency=sc.nextLine();


    }
    public HashMap<String, String> viewAppointments(){
        return appoin;
    }
    public String getDoctorName(){
        return doctorName;
    }
}
