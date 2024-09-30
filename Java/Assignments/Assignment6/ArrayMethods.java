
import java.util.Scanner;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        // Accepting values
        acceptRecord(arr);
        
        // Printing values
        printRecord(arr);
    }
    
    public static void acceptRecord(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 values to store in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    
    public static void printRecord(int[] arr) {
        System.out.println("Values in the array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
