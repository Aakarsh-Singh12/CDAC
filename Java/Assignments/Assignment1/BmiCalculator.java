

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to BMI Calculator!");
        
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        
        // Calculate BMI
        double bmi = weight / (height * height);
        
        // Round BMI to two decimal places
        bmi = Math.round(bmi * 100.0) / 100.0;
        
        System.out.println("Your BMI is: " + bmi);
        
        // Classify BMI
        if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You have Normal weight.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }
        
        sc.close();
    }
}

