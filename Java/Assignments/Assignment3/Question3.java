


import java.util.Scanner;

class BMITracker {
    double weight;
    double height;
    double bmi;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight (in kg): ");
        this.weight = sc.nextDouble();

        System.out.println("Enter height (in meters): ");
        this.height = sc.nextDouble();
    }

    public void calculateBMI() {
        this.bmi = this.weight / (this.height * this.height);
    }

    public String classifyBMI() {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public void printRecord() {
        System.out.println("BMI: " + this.bmi);
        System.out.println("Classification: " + classifyBMI());
    }
}

public class Question3 {
    public static void main(String[] args) {
        BMITracker bmiTracker = new BMITracker();
        bmiTracker.acceptRecord();
        bmiTracker.calculateBMI();
        bmiTracker.printRecord();
    }
}
