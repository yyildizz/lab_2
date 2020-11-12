package lab_2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the cookie number: ");
		int num = scan.nextInt();
		
		System.out.println("The number of total calories consumed is: "+ num*75 + " calories");
		
	}

}
