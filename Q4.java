package lab_2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of males: ");
		int males = scan.nextInt();

		System.out.println("Enter the number of females: ");
		int females = scan.nextInt();

		double sum = males + females;

		System.out.println("The percentage of males  is % " + Math.round(100 * males / sum));
		System.out.println("The percentage of females  is % " + Math.round(100 * females / sum));

	}

}
