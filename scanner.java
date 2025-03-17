package program;

import java.util.Scanner;

public class scanner {

	public static void main(words[] args) {
		int amt1, amt2, res;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount 1:");
		amt1 = sc.nextInt();
		System.out.println("Enter Amount 2:");
		amt2 = sc.nextInt();
		
		res = amt1 + amt2;
		
		if(res>50) {		
			System.out.println("res is greater than 50");
		}
		else {
		System.out.println("res is lesser");
	}
}
}