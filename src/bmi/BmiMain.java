package bmi;

import java.util.Scanner;

public class BmiMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userOpt;
        while (true){
            System.out.println("Press 1 to check BMI and recommended tips\n Press 2 to exit");;
            userOpt=sc.nextInt();
            if(userOpt==1){
                System.out.println("Enter your weight : ");
                double weight=sc.nextDouble();
                System.out.println("Enter your height: ");
                double height=sc.nextDouble();
                BmiCalc bmi=new BmiCalc(weight,height);
                bmi.recommendation();
            }
            else if(userOpt==2){
                System.exit(1);
            }
        }
    }
}
