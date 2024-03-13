package DoctorPatient;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Patient> patients = new HashMap<>();
        HashMap<String, Doctor> doctors = new HashMap<>();
        HashMap<String, String> appointment = new HashMap<>();
        HashMap<String, String> prescriptions = new HashMap<>();

        patients.put("Hari", new Patient("1", "Hari", "Sathy"));
        patients.put("Arun", new Patient("2", "Arun", "Sathy"));

        doctors.put("Doctor2", new Doctor("2", "Doctor 2"));

        int UserOpt;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 for doctor\nEnter 2 for Patient");
            UserOpt = sc.nextInt();
            sc.nextLine(); // Consume newline character

            if (UserOpt == 1) {
                Doctor d = doctors.get("Doctor2");
                System.out.println("Doctor name : " + d.getDoctorName());

                System.out.println("Scheduled Appointments : ");
                System.out.println(d.viewAppointments());
                d.createAppointment(patients, appointment);
            } else if (UserOpt == 2) {
                System.out.println("Enter patient name:");
                String patientName = sc.nextLine();
                Patient p = patients.get(patientName);
                if (p != null) {
                    System.out.println("Patient Name : " + p.getPatientName());
                    System.out.println("Your Appointments : ");
                    p.viewMyAppointment(appointment.get(patientName), patientName);
                } else {
                    System.out.println("Patient not found.");
                }
            }
        }
    }
}