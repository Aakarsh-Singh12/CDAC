import java.util.Scanner;


class DiscountCalculator{
	int MRP;
	int discountpercent;
	double discountCalculate;
	double finalPrice;
	
	public void acceptRecord(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter original Price: ");
		this.MRP = sc.nextInt();
		System.out.println("Enter Discount %: ");
		this.discountpercent = sc.nextInt();
		}
	
	public void Calculation(){
		this.discountCalculate = this.MRP * (discountpercent / 100.0);
		
		this.finalPrice = this.MRP - this.discountCalculate;
		
		}
	
	public void printRecord() {
		System.out.println("Discounted amount is: ₹"+discountCalculate);

		System.out.println("Final Price is: ₹"+this.finalPrice);
	}
	
	
}
public class Assignment3 {
	public static void main(String[] args) {
		DiscountCalculator dc = new DiscountCalculator();
		dc.acceptRecord();
		dc.Calculation();
		dc.printRecord();
		
	}
	

}
