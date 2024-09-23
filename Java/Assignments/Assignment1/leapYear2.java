

import java.util.Scanner;

public class leapYear2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a year to check if it's a leap year:");
        int year = scanner.nextInt();
        
        
        
        switch (year % 4) {
            case 0:
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a leap year ");
                    } else {
                        System.out.println(year + " is not a leap year ");
                    }
                } else {
                    System.out.println(year + " is a leap year ");
                }
                break;
            default:
                System.out.println(year + " is not a leap year ");
        }
    }
}