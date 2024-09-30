

import java.util.Scanner;

public class DefaultAndUpdatedArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        System.out.println("Default values in the array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        
        System.out.println(); 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 values to update the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Updated values in the array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}

