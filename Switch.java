package program;

import  java.util.Scanner;



public class Switch{

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Select an option");
		System.out.println("1.addition");
		System.out.println("2.Sub");
		System.out.println("3.multiplication");
		System.out.println("4.Division");			

		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		System.out.println("Enter first number");
		double num1 = sc.nextDouble();
		System.out.println("Enter second number");
        double num2 = sc.nextDouble();
        
        double result;
        
        switch(choice) {
        case 1:
        	result = num1 + num2;
        	System.out.println("Addition:"+result);
        case 2:	
        	result = num1 - num2;
        	System.out.println("Subtraction"+result);
        case 3:
        	result = num1 * num2;
        	System.out.println("Multiplication:"+result);
        case 4: 
        	result = num1 / num2;
        	System.out.println("Division:"+result);
        default:
        	System.out.println("Invalid");
        	
        }
		
	}
}


