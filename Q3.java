package lab_2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum+=i;
		}
		
		System.out.println("The sum of all the integers from 1 up to " + num + " is " + sum);
		
	}

}
