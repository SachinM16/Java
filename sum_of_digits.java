package Session3;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		
		while(a>=0) {
			int sum = 0;
			int mod = 0;
			int res;
			mod = a % 10;
			sum = a / 10;
			res = mod + sum;
			System.out.println("Sum of digits:"+res);
			break;
		}
	}
}
