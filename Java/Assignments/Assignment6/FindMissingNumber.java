

import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        
        int[] arr = new int[N - 1];
        System.out.println("Enter " + (N - 1) + " numbers from 1 to " + N + ":");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int totalSum = (N * (N + 1)) / 2; // Sum of first N natural numbers
        int arraySum = 0;
        
        for (int value : arr) {
            arraySum += value;
        }
        
        int missingNumber = totalSum - arraySum;
        System.out.println("Missing number is: " + missingNumber);
    }
}
