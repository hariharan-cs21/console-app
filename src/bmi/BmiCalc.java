package bmi;

public class BmiCalc {
    private double height;
    private double weight;
    BmiCalc(double weight,double  height){
        this.weight=weight;
        this.height=height;
    }
    public double obtainBmi(){
        return weight/((height*height)/10000);
    }
    public void recommendation(){
        double bmi=obtainBmi();

        System.out.println("Your BMI score is : "+Math.round(bmi*100.0)/100.0);
        if (bmi < 18.5) {
            System.out.println("You are underweight. Here are some tips:");
            System.out.println("- Increase calorie intake with nutrient-rich foods.");
            System.out.println("- Include protein-rich foods in your diet.");
            System.out.println("- Consider strength training exercises to build muscle mass.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You have a healthy weight. Keep it up!");
            System.out.println("- Maintain a balanced diet and regular exercise routine.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight. Here are some tips:");
            System.out.println("- Focus on portion control and eat smaller, more frequent meals.");
            System.out.println("- Increase physical activity, including cardio and strength training exercises.");
            System.out.println("- Incorporate more fruits, vegetables, and whole grains into your diet.");
        } else {
            System.out.println("You are obese. Here are some tips:");
            System.out.println("- Consult with a healthcare professional for personalized advice and support.");
            System.out.println("- Gradually increase physical activity levels, starting with low-impact exercises.");
            System.out.println("- Make dietary changes to reduce calorie intake and improve overall nutrition.");
        }
    }

}
