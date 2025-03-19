package Session3;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		int i;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
	    i = sc.nextInt();
		do {
			System.out.println("Numbers from entered number:"+i);
			i++;
		}while( i != 10);
	}
}
