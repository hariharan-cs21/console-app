package covid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CovidMain {
    public static void main(String[] args) {
        HashMap<String,User>users=new HashMap<>();
        ArrayList<Patient> data = new ArrayList<>();
        int UserOpt;
        Scanner sc=new Scanner(System.in);
        boolean loggedIn = false;
        data.add(new Patient("John", 30, "123 Main St", true));
        String currName="";
        while(true){
            System.out.println("Enter 1 to Register\nEnter 2 to login\nEnter 3 to view Covid Status/ Add Data");
            UserOpt=sc.nextInt();
            sc.nextLine();

            if(UserOpt==1){
                System.out.println("Enter username : ");
                String username=sc.nextLine();

                if(!users.containsKey(username)){
                    System.out.println("Enter password : ");
                    String password=sc.nextLine();

                    users.put(username,new User(username,password));
                    System.out.println("Registered Successfully,");
                }
                else{
                    System.out.println("Username Already exists");
                }
            }
            else if(UserOpt==2){
                System.out.println("Enter username : ");
                String username=sc.nextLine();
                System.out.println("Enter password : ");
                String password=sc.nextLine();
                User user=users.get(username);
                if(user!=null && user.login(username,password)){
                    currName=username;
                    System.out.println("Login successful!  "+ "Welcome "+currName+"!");
                    loggedIn=true;
                }
                else {
                    System.out.println("Invalid username or password.");
                }
            }
            else if (UserOpt==3){
                if(loggedIn==false){
                    System.out.println("Please Login to continue");
                }
                else{
                    System.out.println("Enter 1 to view Covid Status\nEnter 2 to add Data");
                    int option = sc.nextInt();
                    sc.nextLine();

                    if (option == 1) {
                        viewCovidStatus(data);
                    } else if (option == 2) {
                        addData(data);
                        viewCovidStatus(data);
                    } else {
                        System.out.println("Invalid option.");
                    }
                }
            }
        }

        }
        public static void viewCovidStatus(ArrayList<Patient>data){
            System.out.println("\nCovid Status");
            if (data.isEmpty()) {
                System.out.println("No Covid data available.");
            }
            else{
                for(Patient p:data){
                    System.out.println("Name: " + p.getName());
                    System.out.println("Age: " + p.getAge());
                    System.out.println("Address: " + p.getAddress());
                    System.out.println("Infected: " + (p.isInfected() ? "Yes" : "No"));
                    System.out.println();
                }
            }
        }
    public static void addData(ArrayList<Patient>data){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter patient details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("Is the patient infected (true/false): ");
        boolean isInfected = sc.nextBoolean();
        data.add(new Patient(name,age,address,isInfected));
        System.out.println("Patient data added successfully.");

    }
}
