package lab_2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter the amount of a purchase: ");
		int purchase = scan.nextInt();

		// Assume the state sales tax is 4 percent and the county sales tax is 2
		// percent.

		double stateTax = purchase * 0.04;

		double countyTax = purchase * 0.02;

		double total = purchase + stateTax + countyTax;

		System.out.println("The purchase is " + purchase);
		System.out.println("The state tax is " +stateTax );
		System.out.println("The county tax is " + countyTax);
		System.out.println("The total bill is " + total);

	}

}
