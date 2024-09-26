


import java.util.Scanner;

class TollBoothRevenueManager {
    double carRate = 50.0;
    double truckRate = 100.0;
    double motorcycleRate = 30.0;
    int numberOfCars;
    int numberOfTrucks;
    int numberOfMotorcycles;
    double totalRevenue;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Cars: ");
        this.numberOfCars = sc.nextInt();

        System.out.println("Enter number of Trucks: ");
        this.numberOfTrucks = sc.nextInt();

        System.out.println("Enter number of Motorcycles: ");
        this.numberOfMotorcycles = sc.nextInt();
    }

    public void calculateRevenue() {
        totalRevenue = (numberOfCars * carRate) + (numberOfTrucks * truckRate) + (numberOfMotorcycles * motorcycleRate);
    }

    public void printRecord() {
        System.out.println("Total Vehicles: " + (numberOfCars + numberOfTrucks + numberOfMotorcycles));
        System.out.println("Total Revenue: " + totalRevenue + " ₹");
    }
}

public class Question5 {
    public static void main(String[] args) {
        TollBoothRevenueManager tollBooth = new TollBoothRevenueManager();
        tollBooth.acceptRecord();
        tollBooth.calculateRevenue();
        tollBooth.printRecord();
    }
}
