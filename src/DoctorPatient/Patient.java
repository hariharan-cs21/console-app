package DoctorPatient;

public class Patient {
    private String patientId;
    private String PatientName;
    private String Address;
    Patient(String patientId,String patientName,String address){
        this.patientId=patientId;
        this.PatientName=patientName;
        this.Address=address;
    }
    public String getPatientId(){
        return patientId;
    }
    public String getPatientName(){
        return PatientName;
    }
    public void viewMyAppointment(String myappointment, String myname){
        if(myappointment!=null) {
            System.out.println(myappointment);
        }
        else System.out.println("No Appointment Found");
    }


}
