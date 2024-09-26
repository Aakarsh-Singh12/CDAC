

import java.util.Scanner;

class DiscountCalculator {
    double originalPrice;
    double discountRate;
    double discountAmount;
    double finalPrice;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter original price of the item (in ₹): ");
        this.originalPrice = sc.nextDouble();

        System.out.println("Enter discount percentage: ");
        this.discountRate = sc.nextDouble();
    }

    public void calculateDiscount() {
        this.discountAmount = this.originalPrice * (this.discountRate / 100);
        this.finalPrice = this.originalPrice - this.discountAmount;
    }

    public void printRecord() {
        System.out.println("Discount Amount: " + this.discountAmount + " ₹");
        System.out.println("Final Price: " + this.finalPrice + " ₹");
    }
}

public class Question4 {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        discountCalculator.acceptRecord();
        discountCalculator.calculateDiscount();
        discountCalculator.printRecord();
    }
}
