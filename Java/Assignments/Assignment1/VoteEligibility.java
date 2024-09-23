
import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Voting Eligibility Checker");
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println("Congratulations! You are eligible to vote.");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("Sorry, you are not eligible to vote yet.");
            System.out.println("You will be eligible to vote after " + yearsLeft + " year(s).");
        }
        
        sc.close();
    }
}