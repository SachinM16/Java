package program;

import java.util.Scanner;

public class conditionalstate {

	public static void main(String[] args) {
		Scanner as = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = as.nextInt();
		if (age>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not Eligible to vote");
		}
		
	}
}
