package lab_2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Enter the charge for the meal: ");
		int charge = scan.nextInt();
		
		//Display the meal charge, tax amount, tip amount, and total bill on the screen.

		double tax = charge * 0.0675;
		
		double tip = (charge * 1.0675 ) * 0.2;
		
		double bill = charge + tax + tip;
		
		System.out.println("The meal charge is "+ charge);
		System.out.println("The tax is "+ tax);
		System.out.println("The tip is "+ tip);
		System.out.println("The total bill is "+ bill);

		
	}

}
