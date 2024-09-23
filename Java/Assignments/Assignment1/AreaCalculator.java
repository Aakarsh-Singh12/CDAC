
import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Shape Area Calculator");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.print("Select a shape (1-4): ");
        
        int choice = sc.nextInt();
        double area = 0;
        
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                area = Math.PI * radius * radius;
                break;
            case 2:
                System.out.print("Enter the side length of the square: ");
                double side = sc.nextDouble();
                area = side * side;
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                area = length * width;
                break;
            case 4:
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }
        
        System.out.printf("The area is: %.2f\n", area);
        
        sc.close();
    }
}
