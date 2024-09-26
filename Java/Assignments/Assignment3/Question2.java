import java.util.Scanner;

class CompoundInterestCalculator{
	double initialamount;
	double interestrate;
	int duration;
	double numberofcompounds;
	double futurevalue;
	double totalinterestearned;
	
	
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal amount : ");
		this.initialamount = sc.nextDouble();
		
		System.out.println("Interest Rate: ");
		this.interestrate = sc.nextDouble();
		
		System.out.println("Duration : ");
		this.duration = sc.nextInt();
		
		System.err.println("Number of compounds : ");
		this.numberofcompounds = sc.nextDouble();
		
	}
	
	public void calculations() {
		
		this.futurevalue = this.initialamount * Math.pow((1 + interestrate / numberofcompounds), (this.numberofcompounds * this.duration));
		this.totalinterestearned = this.futurevalue - this.initialamount;
		
		
		
	}
	
	public void printRecord() {
		System.out.println("Future value : "+this.futurevalue);

		System.out.println("totalinterestearned : "+this.totalinterestearned);
	}
}

public class Question2 {
	public static void main(String[] args) {
		CompoundInterestCalculator cic = new CompoundInterestCalculator();
		cic.acceptRecord();
		cic.calculations();
		cic.printRecord();
		
	}

}
